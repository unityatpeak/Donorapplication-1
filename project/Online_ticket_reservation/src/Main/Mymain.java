package Main;

import java.util.Scanner;
import java.util.regex.Pattern;

import Menu.Train;
import Validation.Valid;

public class Mymain {
	public static void main(String[] args) {
		Train t=new Train();
		Scanner scn=new Scanner(System.in);
		Valid v=new Valid();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter train no.");
	String s1=sc.toString();
		
		System.out.println("enter pnr");
		int s2=sc.nextInt();
	
	System.out.println("age");
		int s3=sc.nextInt();
		
		System.out.println("price");
		int s4=sc.nextInt();
		 
		String s7=v.validatetrainnumber();
		double phonenumber=scn.nextDouble();
	//System.out.println("Phone number 1234567890 validation result: "+validatePhoneNumber("1234567890"));
	//int pnr=scn.nextInt();
	
	}

	
}
