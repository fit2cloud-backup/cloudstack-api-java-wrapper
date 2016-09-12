package com.fit2cloud.cloudstack.wsclient.model.response.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class GetVMPasswordResponse extends Response {
	private String encryptedpassword;
	public String getEncryptedpassword() {
		return encryptedpassword;
	}
	public void setEncryptedpassword(String encryptedpassword) {
		this.encryptedpassword = encryptedpassword;
	}

}
