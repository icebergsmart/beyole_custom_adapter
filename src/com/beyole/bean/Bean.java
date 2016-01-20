package com.beyole.bean;

public class Bean {

	private String title;
	private String describe;
	private String phone;
	private String time;

	public Bean() {
	}

	public Bean(String title, String describe, String phone, String time) {
		this.title = title;
		this.describe = describe;
		this.phone = phone;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
