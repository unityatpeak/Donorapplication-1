package com.cg.donor.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.dao.DonorDaoImpl;
import com.cg.donor.dao.IDonorDAo;
import com.cg.donor.exception.DonorException;

public class DonorServiceImpl implements IDonorservice {
	IDonorDAo daoObj= new DonorDaoImpl();
	@Override
	public String addDonor(DonorBean db) throws ClassNotFoundException, SQLException, IOException, DonorException {
		String donorSeq;
		donorSeq=daoObj.addDonor(db);
		return donorSeq;// TODO Auto-generated method stub
		
	}

	@Override
	public DonorBean viewDonorDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List retrieveAllDonors() {
		// TODO Auto-generated method stub
		return null;
	}

	public void validateDonor(DonorBean donorBean) {
		// TODO Auto-generated method stub
		
	}

}
