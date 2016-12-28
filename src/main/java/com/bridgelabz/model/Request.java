package com.bridgelabz.model;

public class Request {
	private String mFirstName,mLastName;

	public Request(){}
	
	public Request(String mFirstName, String mLastName) {
		super();
		this.mFirstName = mFirstName;
		this.mLastName = mLastName;
	}

	public String getmFirstName() {
		return mFirstName;
	}

	public void setmFirstName(String mFirstName) {
		this.mFirstName = mFirstName;
	}

	public String getmLastName() {
		return mLastName;
	}

	public void setmLastName(String mLastName) {
		this.mLastName = mLastName;
	}
	
}
