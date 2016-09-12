package com.fit2cloud.cloudstack.wsclient.model.response.asyncjob;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class QueryAsyncJobResultResponse extends Response {
	private QueryAsyncJobResultResponseDetail queryasyncjobresultresponse;

	public QueryAsyncJobResultResponseDetail getQueryasyncjobresultresponse() {
		return queryasyncjobresultresponse;
	}

	public void setQueryasyncjobresultresponse(QueryAsyncJobResultResponseDetail queryasyncjobresultresponse) {
		this.queryasyncjobresultresponse = queryasyncjobresultresponse;
	}
}
