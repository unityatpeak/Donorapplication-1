package Validation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid {
	Scanner scn=new Scanner(System.in);

	public String validatetrainnumber() {
		
	String trainnumber=scn.toString();
		String num="[\\p{Digit}&&[123456789]]+";
		 /* Pattern p = Pattern.compile("[0-7]");
		  Matcher matcher=
		return null;*/
		return trainnumber;
		
	}
	/*public int validatephonenumber()
	{
		int phonenumber=scn.nextInt();
		String num="[\\p{Digit}&&[123456789]]+";
		return phonenumber;
		
	}*/
	boolean validatephonenumber(double phonenumber )
	{
		String doublephonenumber;
		Pattern p=Pattern.compile("[0-9]{3}");
		Matcher m=p.matcher();
		
	}
}

	