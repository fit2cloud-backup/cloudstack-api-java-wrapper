package com.fit2cloud.cloudstack.wsclient.model.response.storagepools;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class ListStoragePoolsResponse extends Response {
	private ListStoragePoolsResponseDetail liststoragepoolsresponse;

	public ListStoragePoolsResponseDetail getListstoragepoolsresponse() {
		return liststoragepoolsresponse;
	}

	public void setListstoragepoolsresponse(ListStoragePoolsResponseDetail liststoragepoolsresponse) {
		this.liststoragepoolsresponse = liststoragepoolsresponse;
	}
}
