package com.fit2cloud.cloudstack.wsclient.model.response.affinitygroups;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.Affinitygroup;

public class ListAffinityGroupsResponseDetail {
	private int count;
	private List<Affinitygroup> affinitygroup;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Affinitygroup> getAffinitygroup() {
		return affinitygroup;
	}
	public void setAffinitygroup(List<Affinitygroup> affinitygroup) {
		this.affinitygroup = affinitygroup;
	}
}
