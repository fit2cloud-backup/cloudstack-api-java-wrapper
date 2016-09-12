package com.fit2cloud.cloudstack.wsclient.model.request.asyncjob;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class QueryAsyncJobResultRequest extends Request {
	private String jobid;
	public String getJobid() {
		return jobid;
	}
	public void setJobid(String jobid) {
		this.jobid = jobid;
	}
}
