package com.fit2cloud.cloudstack.wsclient.model.response.template;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Template;

public class ListTemplatesResponseDetail {
	private int count;
	private List<Template> template;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Template> getTemplate() {
		return template;
	}
	public void setTemplate(List<Template> template) {
		this.template = template;
	}
}
