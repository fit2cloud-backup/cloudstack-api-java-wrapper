package com.fit2cloud.cloudstack.wsclient.model.response.user;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class RegisterUserKeysResponse extends Response {
	private String apikey;
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	private String secretkey;
	public String getSecretkey() {
		return secretkey;
	}
	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}

}
