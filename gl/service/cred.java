package com.gl.service;

import java.util.Random;

import com.gl.model.employee;

public class cred {
			public String genemailid(String fname, String sname,String dept) {
				return fname+sname+"@"+dept+".gl.com";
			}
public char[] genpassword() {
	
	
	String capLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallletters="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String splchars="!@#$%^&*;<>+-/";
	String value=capLetters+smallletters+numbers+splchars;
	int i;
	char p[]=new char[8];
	
	Random random=new Random();
	for(i=0;i<8;i++)
	{
		p[i]=value.charAt(random.nextInt(value.length()));
	}
	return p;
				
	}


public void displayempdetails(String fname, String lname, String genemail, char[] genpass)
{
	
	
	System.out.println("Emp FirstName is "+fname);
	System.out.println("Emp LastName is "+lname);
	System.out.println("Your Generated Credentials are:");
	System.out.println("Emp EmailID is "+genemail);
	System.out.println("Emp Password is "+genpass);
	
}

}

		