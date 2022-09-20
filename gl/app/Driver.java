package com.gl.app;

import java.util.Scanner;

import com.gl.model.employee;
import com.gl.service.cred;

public class Driver {
	public static void main (String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String fname=sc.next();
		System.out.println("Enter Last Name");
		String lname=sc.next();
		
		
		employee e1=new employee(fname,lname);
	
		cred cs=new cred();
		String genemail="";
		char[] genpass=null;
		
		
		
		System.out.println("please choose your department");
	    System.out.println("1. tech");
	    System.out.println("2. legal");
	    System.out.println("3. HR");
	    System.out.println("4. admin");
	    System.out.println("5. exit");
	    int choice=sc.nextInt();
	    	
	    switch(choice)
	    {
	    
	    case 1:
	    	genemail=cs.genemailid(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(),"tech");
	    	genpass=cs.genpassword();
	    	break;
	    case 2:
	    	genemail=cs.genemailid(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(),"legal");
	    	genpass=cs.genpassword();
	    	break;
	    case 3:	
	    	genemail=cs.genemailid(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(),"HR");
	    	genpass=cs.genpassword();
	    	break;
	    case 4:
	    	genemail=cs.genemailid(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase(),"admin");
	    	genpass=cs.genpassword();
	    	break;
	    case 5:
	    	System.exit(0);
	    default:
	    	System.out.println("please enter valid choice");
	    }
	        cs.displayempdetails(e1.getFirstname(),e1.getLastname(),genemail,genpass);
	    
	
	}
}


