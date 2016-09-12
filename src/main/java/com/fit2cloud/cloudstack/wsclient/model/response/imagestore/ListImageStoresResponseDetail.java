package com.fit2cloud.cloudstack.wsclient.model.response.imagestore;

import java.util.List;

import com.fit2cloud.cloudstack.wsclient.domain.model.ImageStore;

public class ListImageStoresResponseDetail {
	private int count;
	private List<ImageStore> imagestore;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<ImageStore> getImagestore() {
		return imagestore;
	}
	public void setImagestore(List<ImageStore> imagestore) {
		this.imagestore = imagestore;
	}
}
