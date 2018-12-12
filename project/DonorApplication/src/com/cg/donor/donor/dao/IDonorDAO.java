package com.cg.donor.donor.dao;

import java.util.List;

import com.cg.donor.bean.DonorBean;

public interface IDonorDAO {
	public String addDonor(DonorBean donor);
	public void viewDonorDetails(String donorId);
	public List retrieveAll();
}
