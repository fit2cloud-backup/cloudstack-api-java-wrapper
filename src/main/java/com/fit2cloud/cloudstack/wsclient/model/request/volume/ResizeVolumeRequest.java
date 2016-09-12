package com.fit2cloud.cloudstack.wsclient.model.request.volume;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class ResizeVolumeRequest extends Request {
	private String diskofferingid;
	public String getDiskofferingid() {
		return diskofferingid;
	}
	public void setDiskofferingid(String diskofferingid) {
		this.diskofferingid = diskofferingid;
	}
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String shrinkok;
	public String getShrinkok() {
		return shrinkok;
	}
	public void setShrinkok(String shrinkok) {
		this.shrinkok = shrinkok;
	}
	private String size;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
