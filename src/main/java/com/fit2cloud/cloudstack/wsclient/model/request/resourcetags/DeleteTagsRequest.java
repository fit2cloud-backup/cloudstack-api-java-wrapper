package com.fit2cloud.cloudstack.wsclient.model.request.resourcetags;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class DeleteTagsRequest extends Request {
	private String resourceids;
	public String getResourceids() {
		return resourceids;
	}
	public void setResourceids(String resourceids) {
		this.resourceids = resourceids;
	}
	private String resourcetype;
	public String getResourcetype() {
		return resourcetype;
	}
	public void setResourcetype(String resourcetype) {
		this.resourcetype = resourcetype;
	}
	private String tags;
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

}
