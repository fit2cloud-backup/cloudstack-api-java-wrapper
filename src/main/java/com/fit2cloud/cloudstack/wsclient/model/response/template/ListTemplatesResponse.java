package com.fit2cloud.cloudstack.wsclient.model.response.template;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListTemplatesResponse extends Response {
	private ListTemplatesResponseDetail listtemplatesresponse;

	public ListTemplatesResponseDetail getListtemplatesresponse() {
		return listtemplatesresponse;
	}

	public void setListtemplatesresponse(ListTemplatesResponseDetail listtemplatesresponse) {
		this.listtemplatesresponse = listtemplatesresponse;
	}
}
