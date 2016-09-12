package com.fit2cloud.cloudstack.wsclient.model.request.snapshot;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class CreateSnapshotPolicyRequest extends Request {
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
