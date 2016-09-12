package com.fit2cloud.cloudstack.wsclient.model.request.template;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class UpdateTemplateRequest extends Request {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String bootable;
	public String getBootable() {
		return bootable;
	}
	public void setBootable(String bootable) {
		this.bootable = bootable;
	}
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}
	private String format;
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	private String isdynamicallyscalable;
	public String getIsdynamicallyscalable() {
		return isdynamicallyscalable;
	}
	public void setIsdynamicallyscalable(String isdynamicallyscalable) {
		this.isdynamicallyscalable = isdynamicallyscalable;
	}
	private String isrouting;
	public String getIsrouting() {
		return isrouting;
	}
	public void setIsrouting(String isrouting) {
		this.isrouting = isrouting;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String ostypeid;
	public String getOstypeid() {
		return ostypeid;
	}
	public void setOstypeid(String ostypeid) {
		this.ostypeid = ostypeid;
	}
	private String passwordenabled;
	public String getPasswordenabled() {
		return passwordenabled;
	}
	public void setPasswordenabled(String passwordenabled) {
		this.passwordenabled = passwordenabled;
	}
	private String sortkey;
	public String getSortkey() {
		return sortkey;
	}
	public void setSortkey(String sortkey) {
		this.sortkey = sortkey;
	}

}
