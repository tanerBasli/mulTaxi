package com.cafeintech.multaxi.remote.tools;

import java.io.IOException;
import java.util.Date;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.cafeintech.multaxi.remote.model.request.BaseRequestModel;
import com.cafeintech.multaxi.remote.model.response.OpenApiResponseWrapper;
import com.cafeintech.multaxi.remote.model.response.TokenResponseModel;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TaxiBusWebServiceCallHelper {

	public static java.time.Instant lastInstant;

//	public static void main(String[] args) {
//		OpenApiHelper tokenGenerator = new OpenApiHelper();
//
//		System.out.println("Main Test - " + tokenGenerator.createTokenResponse());
//
//		PaymentPlanOpenApiRequestModel requestModel = new PaymentPlanOpenApiRequestModel();
//
//		requestModel.setPrincipal(new BigDecimal(1250000));
//		requestModel.setNop(new BigDecimal(20));
//
//		OpenApiHelper helper = new OpenApiHelper();
//
//		ObjectMapper mapper = new ObjectMapper();
//		try {
//			String jsonInString = mapper.writeValueAsString(requestModel);
//			System.out.println(jsonInString);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println(helper.makeHttpRequest(UrlHelper.loanUrl, requestModel, PaymentPlanModel.class).getTotalInstallment());
//
//	}

	public TaxiBusWebServiceCallHelper() {
		super();
	}

	public <T extends BaseRequestModel, U> U makeHttpRequestWrapper(String url, T request, Class<U> response) {

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add(HttpHeaders.AUTHORIZATION, TokenHelper.getInstance().getToken());

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<T> entity = new HttpEntity<T>(request, headers);

		ResponseEntity<OpenApiResponseWrapper<U>> result = restTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<OpenApiResponseWrapper<U>>() {
		});

		U convertedObject = new ObjectMapper().convertValue(result.getBody().getResponse().getRet(), response);

		return convertedObject;

	}
	
	public <T extends BaseRequestModel, U> U makeHttpRequest(String url, T request, Class<U> response) {

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add(HttpHeaders.AUTHORIZATION, TokenHelper.getInstance().getToken());

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<T> entity = new HttpEntity<T>(request, headers);

		ResponseEntity<U> result = restTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<U>() {
		});

//		U convertedObject = new ObjectMapper().convertValue(result.getBody().getResponse().getRet(), response);

		return result.getBody();

	}

	public synchronized TokenResponseModel createTokenResponse() {
		return createTokenResp();
	}

	public TokenResponseModel createTokenResp() {

		RestTemplate restTemplate = new RestTemplate();

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add(HttpHeaders.ACCEPT, MediaType.APPLICATION_FORM_URLENCODED_VALUE);

		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		body.add("email", "qwerty@gmail.com");
		body.add("password", "serah34020");
		body.add("oauth_consumer_key", "47164fb0-b7b3-49e8-891b-650270b82cf2");
		body.add("oauth_signature_method", "HMAC-SHA256");
		body.add("oauth_timestamp", "" + new Date().getTime());
		body.add("oauth_nonce", "qJ1VFt");
		body.add("oauth_version", "1.0");

		HttpEntity<?> entity = new HttpEntity<Object>(body, headers);
		ResponseEntity<String> result = restTemplate.postForEntity(UrlHelper.tokenUrl, entity, String.class);

		TokenResponseModel model;
		try {
			String responseBody = result.getBody();
			log.info(responseBody);
			model = new ObjectMapper().readValue(responseBody, TokenResponseModel.class);
			return model;
		} catch (IOException e) {
			log.error("Hata alindi", e);
		}

		return new TokenResponseModel();
	}

}