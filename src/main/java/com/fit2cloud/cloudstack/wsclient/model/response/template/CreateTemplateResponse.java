package com.fit2cloud.cloudstack.wsclient.model.response.template;

import com.fit2cloud.cloudstack.wsclient.domain.model.AsyncJobResponse;
import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class CreateTemplateResponse extends Response {
	private AsyncJobResponse createtemplateresponse;

	public AsyncJobResponse getCreatetemplateresponse() {
		return createtemplateresponse;
	}

	public void setCreatetemplateresponse(AsyncJobResponse createtemplateresponse) {
		this.createtemplateresponse = createtemplateresponse;
	}
}
