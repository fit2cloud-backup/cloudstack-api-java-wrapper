package com.fit2cloud.cloudstack.wsclient.model.request.volume;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class MigrateVolumeRequest extends Request {
	private String storageid;
	public String getStorageid() {
		return storageid;
	}
	public void setStorageid(String storageid) {
		this.storageid = storageid;
	}
	private String volumeid;
	public String getVolumeid() {
		return volumeid;
	}
	public void setVolumeid(String volumeid) {
		this.volumeid = volumeid;
	}
	private String livemigrate;
	public String getLivemigrate() {
		return livemigrate;
	}
	public void setLivemigrate(String livemigrate) {
		this.livemigrate = livemigrate;
	}

}
