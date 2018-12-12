package com.cg.donor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.donor.dao.DonarDaoImpl;
import com.cg.donor.donor.dao.IDonorDAO;
import com.cg.donor.exception.DonorException;

public class Donorserviceimpl implements IDonorService{
	
IDonorDAO donardao=new DonarDaoImpl();

	@Override
	public String addDonor(DonorBean donor) {
		String donorSeq;
		donorSeq=donardao.addDonor(donor);
		
		return donorSeq;
	}

	@Override
	public void viewDonorDetails(String donorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}
public void validateDonor(DonorBean donorBean) throws DonorException
{
	
	List<String> validationErrors=new ArrayList<String>();
	
	if(!(isValidName(donorBean.getDonorName()))) {
		validationErrors.add("donor name should be in alphabets and 3 characters long");
	}
	if(!(isvalidAddress(donorBean.getAdddress()))){
		validationErrors.add("address should be 5 characters long");
	}
	if(!(isvalidPhonenumber(donorBean.getPhonenumber()))) {
		validationErrors.add("phone no. should be 10 digits");
	}
	if(!(isvalidAmount(donorBean.getDonationAmount())))
			{
		validationErrors.add("amount should be positive");
			}
	if(!validationErrors.isEmpty())
		throw new DonorException(validationErrors+" ");
		
}
		
		private boolean isvalidAmount(double donationAmount) {
	return donationAmount>0;
}
		
		
private boolean isvalidPhonenumber(String Phonenumber) {
	Pattern phonePattern=Pattern.compile("^[6-9]{1}[0-9]{9}$");
	Matcher phoneMatcher=phonePattern.matcher(Phonenumber);
	return phoneMatcher.matches();
}

private boolean isvalidAddress(String address)
{
	return(address.length()>6);
	
}

private boolean isValidName(String donorName)
{
	
Pattern namePattern =Pattern .compile("^[A-Za-z]{3,}$");
Matcher nameMatcher=namePattern.matcher(donorName);
return nameMatcher.matches();
}

public boolean validateDonorId(String donorId)
{
	Pattern idPattern=Pattern.compile("[0-9]{1,4}");
	Matcher IdMatcher=idPattern.matcher(donorId);
	if(IdMatcher.matches())
		return true;
	else
		return false;
}



/*private boolean isValidName(Class<bean> class1) {
	// TODO Auto-generated method stub
	return false;*/
}
