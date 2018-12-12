package com.cg.donor.service;

import java.util.List;

import com.cg.donor.bean.DonorBean;

public interface IDonorService {
public String addDonor(DonorBean donor);
public void viewDonorDetails(String donorId);
public List retrieveAll();
}
