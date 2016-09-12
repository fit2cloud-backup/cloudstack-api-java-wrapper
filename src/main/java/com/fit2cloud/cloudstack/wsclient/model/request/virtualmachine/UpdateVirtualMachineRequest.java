package com.fit2cloud.cloudstack.wsclient.model.request.virtualmachine;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class UpdateVirtualMachineRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String displayname;
	public String getDisplayname() {
		return displayname;
	}
	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}
	private String displayvm;
	public String getDisplayvm() {
		return displayvm;
	}
	public void setDisplayvm(String displayvm) {
		this.displayvm = displayvm;
	}
	private String group;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	private String haenable;
	public String getHaenable() {
		return haenable;
	}
	public void setHaenable(String haenable) {
		this.haenable = haenable;
	}
	private String isdynamicallyscalable;
	public String getIsdynamicallyscalable() {
		return isdynamicallyscalable;
	}
	public void setIsdynamicallyscalable(String isdynamicallyscalable) {
		this.isdynamicallyscalable = isdynamicallyscalable;
	}
	private String ostypeid;
	public String getOstypeid() {
		return ostypeid;
	}
	public void setOstypeid(String ostypeid) {
		this.ostypeid = ostypeid;
	}
	private String userdata;
	public String getUserdata() {
		return userdata;
	}
	public void setUserdata(String userdata) {
		this.userdata = userdata;
	}

}
