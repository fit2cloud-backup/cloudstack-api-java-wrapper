package com.fit2cloud.cloudstack.wsclient.model.request.vpc;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class CreateStaticRouteRequest extends Request {
	private String cidr;
	public String getCidr() {
		return cidr;
	}
	public void setCidr(String cidr) {
		this.cidr = cidr;
	}
	private String gatewayid;
	public String getGatewayid() {
		return gatewayid;
	}
	public void setGatewayid(String gatewayid) {
		this.gatewayid = gatewayid;
	}

}
