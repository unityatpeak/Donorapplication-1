package com.cg.donor.bean;

public class DonorBean {
	private String donorId;
	private String phoneNumber;
	private String donorName;
	private String address;
	private String donationDate;
	private double donationAmount;
	public String getDonorId() {
		return donorId;
	}
	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public   String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	public double getDonationAmount() {
		return donationAmount;
	}
	public void setDonationAmount(double donationAmount) {
		this.donationAmount = donationAmount;
	}
	@Override
	public String toString() {
		return "DonorBean [donorId=" + donorId + ", phoneNumber=" + phoneNumber + ", donorName=" + donorName
				+ ", address=" + address + ", donationDate=" + donationDate + ", donationAmount=" + donationAmount
				+ "]";
	}

}
