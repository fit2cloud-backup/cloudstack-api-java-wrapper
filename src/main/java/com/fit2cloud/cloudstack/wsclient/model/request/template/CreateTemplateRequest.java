package com.fit2cloud.cloudstack.wsclient.model.request.template;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class CreateTemplateRequest extends Request {
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
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
	private String bits;
	public String getBits() {
		return bits;
	}
	public void setBits(String bits) {
		this.bits = bits;
	}
	private String details;
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	private String isdynamicallyscalable;
	public String getIsdynamicallyscalable() {
		return isdynamicallyscalable;
	}
	public void setIsdynamicallyscalable(String isdynamicallyscalable) {
		this.isdynamicallyscalable = isdynamicallyscalable;
	}
	private String isfeatured;
	public String getIsfeatured() {
		return isfeatured;
	}
	public void setIsfeatured(String isfeatured) {
		this.isfeatured = isfeatured;
	}
	private String ispublic;
	public String getIspublic() {
		return ispublic;
	}
	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
	}
	private String passwordenabled;
	public String getPasswordenabled() {
		return passwordenabled;
	}
	public void setPasswordenabled(String passwordenabled) {
		this.passwordenabled = passwordenabled;
	}
	private String requireshvm;
	public String getRequireshvm() {
		return requireshvm;
	}
	public void setRequireshvm(String requireshvm) {
		this.requireshvm = requireshvm;
	}
	private String snapshotid;
	public String getSnapshotid() {
		return snapshotid;
	}
	public void setSnapshotid(String snapshotid) {
		this.snapshotid = snapshotid;
	}
	private String templatetag;
	public String getTemplatetag() {
		return templatetag;
	}
	public void setTemplatetag(String templatetag) {
		this.templatetag = templatetag;
	}
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private String virtualmachineid;
	public String getVirtualmachineid() {
		return virtualmachineid;
	}
	public void setVirtualmachineid(String virtualmachineid) {
		this.virtualmachineid = virtualmachineid;
	}
	private String volumeid;
	public String getVolumeid() {
		return volumeid;
	}
	public void setVolumeid(String volumeid) {
		this.volumeid = volumeid;
	}

}
