package com.fit2cloud.cloudstack.wsclient.model.response.ssh;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class CreateSSHKeyPairResponse extends Response {
	private String fingerprint;
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String privatekey;
	public String getPrivatekey() {
		return privatekey;
	}
	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}

}
