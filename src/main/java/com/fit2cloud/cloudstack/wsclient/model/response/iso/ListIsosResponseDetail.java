package com.fit2cloud.cloudstack.wsclient.model.response.iso;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Template;

public class ListIsosResponseDetail {
	private int count;
	private List<Template> iso;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Template> getIso() {
		return iso;
	}
	public void setIso(List<Template> iso) {
		this.iso = iso;
	}
}
