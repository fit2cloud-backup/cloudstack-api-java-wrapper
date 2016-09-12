package com.fit2cloud.cloudstack.wsclient.model.response.snapshot;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class CreateSnapshotPolicyResponse extends Response {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String intervaltype;
	public String getIntervaltype() {
		return intervaltype;
	}
	public void setIntervaltype(String intervaltype) {
		this.intervaltype = intervaltype;
	}
	private String maxsnaps;
	public String getMaxsnaps() {
		return maxsnaps;
	}
	public void setMaxsnaps(String maxsnaps) {
		this.maxsnaps = maxsnaps;
	}
	private String schedule;
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	private String timezone;
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	private String volumeid;
	public String getVolumeid() {
		return volumeid;
	}
	public void setVolumeid(String volumeid) {
		this.volumeid = volumeid;
	}

}
