package com.taxibus.remote.tools;

import java.lang.reflect.Type;

import org.springframework.core.ParameterizedTypeReference;

import com.google.gson.reflect.TypeToken;

public class ParameterizedTypeReferenceBuilder {
	public static <T> ParameterizedTypeReference<T> fromTypeToken(TypeToken<T> typeToken) {
		return new TypeTokenParameterizedTypeReference<>(typeToken);
	}

	private static class TypeTokenParameterizedTypeReference<T> extends ParameterizedTypeReference<T> {

		private final Type type;

		private TypeTokenParameterizedTypeReference(TypeToken<T> typeToken) {
			this.type = typeToken.getType();
		}

		@Override
		public Type getType() {
			return type;
		}

		@Override
		public boolean equals(Object obj) {
			return (this == obj || (obj instanceof ParameterizedTypeReference &&
					this.type.equals(((ParameterizedTypeReference<?>) obj).getType())));
		}

		@Override
		public int hashCode() {
			return this.type.hashCode();
		}

		@Override
		public String toString() {
			return "ParameterizedTypeReference<" + this.type + ">";
		}

	}
}
