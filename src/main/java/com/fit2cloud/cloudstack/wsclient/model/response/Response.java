package com.fit2cloud.cloudstack.wsclient.model.response;

import com.google.gson.Gson;

public class Response {
	
	@SuppressWarnings("unchecked")
	public static <T> T fromJson(String jsonResponse, Class<T> T){
		Gson gson = new Gson();
		T response = (T) gson.fromJson(jsonResponse, T.getClass());
		return response;
	}
}
