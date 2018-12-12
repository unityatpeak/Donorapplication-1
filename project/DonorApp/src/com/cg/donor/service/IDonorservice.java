package com.cg.donor.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.exception.DonorException;

public interface IDonorservice {
	public String addDonor(DonorBean db) throws ClassNotFoundException, SQLException, IOException, DonorException;
	public DonorBean viewDonorDetails() throws DonorException; //throws DonorException;
	public List retrieveAllDonors() ;// throws DonorException;

}	



