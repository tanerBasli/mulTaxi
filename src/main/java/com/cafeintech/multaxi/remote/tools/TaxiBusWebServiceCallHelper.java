package com.cafeintech.multaxi.remote.tools;

import java.io.IOException;
import java.util.Date;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.taxibus.remote.model.request.BaseRequestModel;
import com.taxibus.remote.model.response.OpenApiResponseWrapper;
import com.taxibus.remote.model.response.TokenResponseModel;

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
		headers.add("CONTENT_TYPE", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add("Accept", "application/json");
		headers.add("Authorization", TokenHelper.getInstance().getToken());

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<T> entity = new HttpEntity<T>(request, headers);

		ResponseEntity<OpenApiResponseWrapper<U>> result = restTemplate.exchange(url, HttpMethod.POST, entity, new ParameterizedTypeReference<OpenApiResponseWrapper<U>>() {
		});

		U convertedObject = new ObjectMapper().convertValue(result.getBody().getResponse().getRet(), response);

		return convertedObject;

	}
	
	public <T extends BaseRequestModel, U> U makeHttpRequest(String url, T request, Class<U> response) {

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("CONTENT_TYPE", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add("Accept", "application/json");
		headers.add("Authorization", TokenHelper.getInstance().getToken());

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
		headers.add("CONTENT_TYPE", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
		headers.add("Accept", "application/json");
		MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
		body.add("email", "ahmetvefasaruhan53@gmail.com");
		body.add("password", "serah34020");
		body.add("oauth_consumer_key", "47164fb0-b7b3-49e8-891b-650270b82cf2");
		body.add("oauth_signature_method", "HMAC-SHA256");
		body.add("oauth_timestamp", "" + new Date().getTime());
		body.add("oauth_nonce", "qJ1VFt");
		body.add("oauth_version", "1.0");
		HttpEntity<?> entity = new HttpEntity<Object>(body, headers);
		ResponseEntity<String> result = restTemplate.exchange(UrlHelper.tokenUrl, HttpMethod.POST, entity, String.class);
		TokenResponseModel model;
		try {
			model = new ObjectMapper().readValue(result.getBody(), TokenResponseModel.class);
			logToConsole(model);
			return model;
		} catch (IOException e) {
			logToConsole("Hata al�nd�");
		}

		return new TokenResponseModel();
	}

	public synchronized String createToken() {
		return createToken();
	}

	/**
	 * email:ahmetvefasaruhan53@gmail.com
password:serah34020
oauth_consumer_key:47164fb0-b7b3-49e8-891b-650270b82cf2
oauth_token:
oauth_signature_method:HMAC-SHA256
oauth_timestamp:1520769651
oauth_nonce:qJ1VFt
oauth_version:1.0
	 */

	public void logToConsole(Object log) {
		System.out.println(log);
	}

}
