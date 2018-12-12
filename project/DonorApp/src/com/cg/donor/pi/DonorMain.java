package com.cg.donor.pi;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.donor.bean.DonorBean;
import com.cg.donor.exception.DonorException;
import com.cg.donor.service.DonorServiceImpl;
import com.cg.donor.service.IDonorservice;

public class DonorMain {
	static Scanner in = new Scanner(System.in);
	static IDonorservice donorservice = null;
	static DonorServiceImpl donorServiceImpl=null;


public static void main(String[] args) {
		
		DonorBean donorBean = null;
		
		String donorId = null;
		int option=0;
		while(true) {
			System.out.println("ICARE CAPGEMINI TRUST");
			System.out.println("----------------------------\n");
			System.out.println(" 1.Add Donator ");
			System.out.println(" 2.View Donator ");
			System.out.println(" 3. Retrieve all");
			System.out.println("4. Exit");
			System.out.println(" ------------------");
			System.out.println("select an option :");
		try
		{
			option = in.nextInt();
			switch(option)
			{
			case 1:
				while(donorBean==null)
				{
					donorBean = populateDonorBean();
				}
					try
					{
						donorservice= new DonorServiceImpl();
						donorId = donorservice.addDonor(donorBean);
						System.out.println("donator details has been successfully added");
						System.out.println("donator id : "+donorId);
					}
					catch(DonorException donorException)
					{
						System.err.println("error :"+donorException.getMessage());
					}
					finally
					{
						donorId=null;
						donorservice=null;
						donorBean=null;
					}
				break;
			case 2:
				break;
				
			case 3:
				break;
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	}
	private static DonorBean populateDonorBean()
	{
		DonorBean donorBean = new DonorBean();
		System.out.println("\n Enter Details: ");
		
		System.out.println("Enter donor name: ");
		donorBean.setDonorName(in.next());
		
		System.out.println(" enter donor number: ");
		donorBean.setPhoneNumber(in.next());
		
		System.out.println(" enter donor address: ");
		donorBean.setAddress(in.next());
		
		System.out.println(" enter donor amount: ");
		try {
		donorBean.setDonationAmount(in.nextDouble());
		}
		catch(InputMismatchException ime)
		{
			in.nextLine();
			System.err.println("Please enter a numeric value for donation amount, try again");
		}
		//System.out.println(" enter donation date: ");
	//	donorBean.setDonationDate(in.nextLine());
		
		
		donorServiceImpl = new DonorServiceImpl();
		try
		{
			donorServiceImpl.validateDonor(donorBean);
			return donorBean;
		}
		catch(Exception de)
		{
			System.err.println("Invalid data: ");
			System.err.println(de.getMessage()+"\n try again  ");
			System.exit(0);
		}
		return null;
	}

}
