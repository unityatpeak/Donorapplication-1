package com.cg.donor.pi;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.donor.dao.DonarDaoImpl;
import com.cg.donor.exception.DonorException;
import com.cg.donor.service.Donorserviceimpl;
import com.cg.donor.service.IDonorService;

public class Dmain {
	static Scanner sc = new Scanner(System.in);
	static IDonorService donorService = null;
	static Donorserviceimpl donorServiceImpl = null;

	public static void main(String[] args) {
		DonorBean donorBean=null;
		String donorId=null;
		int option=0;
		while(true)
		{
			System.out.println();
			System.out.println();
			System.out.println("ICARE CAPGEMINI TRUST");
			System.out.println("-----------------------------------");
			System.out.println("1.add donator");
			System.out.println("2.view donator");
			System.out.println("3.retrieve all");
			System.out.println("4.exit");
			System.out.println("-----------------------");
			System.out.println("select an option:");
			try {
				option=sc.nextInt();
				switch (option) {
				case 1:while(donorBean==null) {
					donorBean=populateDonorbean();
				}
				try {
					donorService=(IDonorService) new DonarDaoImpl();
					donorId=donorService.addDonor(donorBean);
					System.out.println("donor details has been successfully registered");
					System.out.println("id is"+donorId);}
				catch(DonorException donorException)
				{
				System.err.println("Error:"+donorException);	
				} 
				finally 
				{
					
				}
					
					break;

				
                 case 2:
					
					break;

                   case 3:
	
	               break;

                   case 4:
 	
	                break;
                  default:
					break;
				}
				
			}
			
			catch(Exception e) {
			
			
			
			
			
		}
	}

}

	private static DonorBean populateDonorbean() {
	DonorBean donorBean=new DonorBean();
	System.out.println("enter deatils");
	System.out.println("enter donor name");
	donorBean.setDonorName(sc.next());
	System.out.println("enter donor contact");
	donorBean.setPhonenumber(sc.next());
	System.out.println("enter donor address");
	donorBean.setAdddress(sc.next());
	System.out.println("enter donation amount");
	try {
		donorBean.setDonationAmount((sc.nextFloat()));
	}
	catch(InputMismatchException ime) {
		sc.nextLine();
		System.err.println("enter numeric valuefor amt,try again");
	}
	donorServiceImpl=new Donorserviceimpl();
	
	try {
		donorServiceImpl.validateDonor(donorBean);
		return donorBean;
	}
	catch(DonorException donorException){
		System.err.println("invalid data:");
		System.err.println(donorException.getMessage()+"\n Try again..");
		System.exit(0);}
	
		return null;
	}
}
