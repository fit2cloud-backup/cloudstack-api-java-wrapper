package com.fit2cloud.cloudstack.wsclient.model.request.snapshot;

import com.fit2cloud.cloudstack.wsclient.model.request.Request;

public class DeleteVMSnapshotRequest extends Request {
	private String vmsnapshotid;
	public String getVmsnapshotid() {
		return vmsnapshotid;
	}
	public void setVmsnapshotid(String vmsnapshotid) {
		this.vmsnapshotid = vmsnapshotid;
	}

}
