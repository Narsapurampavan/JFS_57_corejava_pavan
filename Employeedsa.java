package codegananDSA;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Employeedsa {

	public static void main(StringMethods[] args) {
		Scanner sc=new Scanner(System.in);
		
		byte experienc=0;
		short department=0;
		int empid=0;
		long moblienum=0;
		float height=0;
		double salary=0;
		boolean filePresent=false;
		BigInteger aadar=BigInteger.ZERO;
		BigDecimal bonus=BigDecimal.ZERO;
		
		
		StringMethods empName=" ";
		StringMethods empfullname="";
		char maritalstatus= ' ';
		//emp id
		System.out.println("Enter employee id:");
		if(sc.hasNextInt()) {
			empid=sc.nextInt();
		}
		else {
			System.out.println("Employee id is invalid");
			return;
		}
		//employeee name
		System.out.println("enter employee name:");
		if(sc.hasNext()) {
			empName=sc.next();
			
		}else {
			System.out.println("employee name is invalid");
		}
		//marirtalstatus
//		System.out.println("enter employee status:");
//		if(sc.hasNext());
//		{
//			maritalstatus=sc.next().charAt(0);
//		}
//		else
//		{
//			System.out.println("invalid status");
//		}
		
		// empfullname
		System.out.println("enter full name:");
		if(sc.hasNext()) {
			 empfullname=sc.next();
			 
			
		}else {
			System.out.println("invalid fullname ");
		}
		//experience
		
		System.out.println("enter experience of employee:");
		if(sc.hasNextByte()) {
			experienc=sc.nextByte();
		}
		else {
			System.out.println("invalid experience");
		}
	//department
		System.out.println("enter department employee:");
		if(sc.hasNextShort()) {
			sc.nextShort();
		}
		else {
			System.out.println("invalid employeee department");
			
		}
		
		//moblie number
		System.out.println("enter employee moblie number:");
		if(sc.hasNextLong()) {
			sc.nextLong();
		}
		else {
			System.out.println("invalid moblie number");
		}
		
		//height
		System.out.println("enter height of employee:");
		if(sc.hasNextFloat()) {
			
            sc.nextFloat();
		}else {
			System.out.println("invalid of height of employee");
		}
		
		//emp salary
		System.out.println("enter employee salary:");
		if(sc.hasNextDouble()) {
			sc.nextDouble();
		}
		else {
			System.out.println("invalid employee salary");
		}
		//filepresent
		System.out.println("enter filepresent employee:");
		if(sc.hasNextBoolean()) {
			sc.nextBoolean();
		}else {
			System.out.println("invalid filepresent of employee");
		}
		
		
		
	}
	
	
	

}
