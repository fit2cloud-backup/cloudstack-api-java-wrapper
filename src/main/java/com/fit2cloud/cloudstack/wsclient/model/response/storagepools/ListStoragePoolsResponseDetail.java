package com.fit2cloud.cloudstack.wsclient.model.response.storagepools;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.StoragePool;

public class ListStoragePoolsResponseDetail {
	private int count;
	private List<StoragePool> storagepool;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<StoragePool> getStoragepool() {
		return storagepool;
	}
	public void setStoragepool(List<StoragePool> storagepool) {
		this.storagepool = storagepool;
	}
}
