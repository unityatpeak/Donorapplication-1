package com.cg.donor.dao;

//import com.cg.donor.bean.DonorBean;



	import java.io.IOException;
	import java.sql.SQLException;
	import java.util.List;

	import com.cg.donor.bean.DonorBean;
	import com.cg.donor.exception.DonorException;

	public interface IDonorDAo {

		public String addDonor(DonorBean donor) throws ClassNotFoundException, SQLException, IOException, DonorException;
		public DonorBean viewDonorDetails() throws DonorException;
		public List retrieveAllDonors() throws DonorException;


}
