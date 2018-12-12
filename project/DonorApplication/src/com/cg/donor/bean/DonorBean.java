package com.cg.donor.bean;

import java.sql.Date;

public class DonorBean {
	private String donorId;
	private String donorName;
	private String phonenumber;
	private String adddress;
	private double donationAmount;
	private Date donationDate;
	@Override
	public String toString() {
		return "DonorMain [donorId=" + donorId + ", donorName=" + donorName + ", phonenumber=" + phonenumber + ", adddress="
				+ adddress + ", donationAmount=" + donationAmount + ", donationDate=" + donationDate + ", getDonorId()="
				+ getDonorId() + ", getDonorName()=" + getDonorName() + ", getPhonenumber()=" + getPhonenumber()
				+ ", getAdddress()=" + getAdddress() + ", getDonationAmount()=" + getDonationAmount()
				+ ", getDonationDate()=" + getDonationDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getDonorId() {
		return donorId;
	}
	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAdddress() {
		return adddress;
	}
	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}
	public double getDonationAmount() {
		return donationAmount;
	}
	public void setDonationAmount(double donationAmount) {
		this.donationAmount = donationAmount;
	}
	public Date getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}

	}


