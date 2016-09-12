package com.fit2cloud.cloudstack.wsclient.model.request.template;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class CopyTemplateRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String destzoneid;
	public String getDestzoneid() {
		return destzoneid;
	}
	public void setDestzoneid(String destzoneid) {
		this.destzoneid = destzoneid;
	}
	private String sourcezoneid;
	public String getSourcezoneid() {
		return sourcezoneid;
	}
	public void setSourcezoneid(String sourcezoneid) {
		this.sourcezoneid = sourcezoneid;
	}

}
