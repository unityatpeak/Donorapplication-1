package com.cg.donor.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.util.Dbconn;

public class DonorDaoImpl implements IDonorDAo{

	@Override
	public String addDonor(DonorBean db) throws ClassNotFoundException, SQLException, IOException {
		Connection connection=Dbconn.getConnection();// TODO Auto-generated method stub
		PreparedStatement preparedstatement=null;
		ResultSet resultSet=null;
		
		String donorId=null;
		
		int queryResult=0;
		try
		{
			
			
			
			Statement st = connection.createStatement();
			
			preparedstatement = connection.prepareStatement("insert into donor_details values(donorID_sequence.nextval,?,?,?,sysdate,?)");
			
			preparedstatement.setString(1,db.getDonorName());
			preparedstatement.setString(2,db.getAddress());
			preparedstatement.setString(3,db.getPhoneNumber());
			preparedstatement.setDouble(4,db.getDonationAmount());
			
			preparedstatement.executeUpdate();
			
			resultSet=st.executeQuery("select * from donor_details order by donor_id");
			
			while(resultSet.next())
			{
				System.out.println("donorid : "+resultSet.getString(1)+"donorname : "+resultSet.getString(2)+"");
				donorId = resultSet.getString(1);
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return donorId;
	}

	@Override
	public DonorBean viewDonorDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List retrieveAllDonors() {
		
		return null;
	}

}
