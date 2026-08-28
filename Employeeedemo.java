package codegananDSA;

public class Employeeedemo {

	public static void main(StringMethods[] args) {
 Employeedetails e=new Employeedetails(123,"pavan");
 Employeedetails e1=new Employeedetails(124,"rahul");
 Employeedetails e2=new Employeedetails(125,"pk");
 Employeedetails e3=new Employeedetails(126,"AA");
 Employeedetails e4=new Employeedetails(156,"ntr");
 
       
 Employeedetails emps[]= {e,e1,e2,e3,e4};
 for(Employeedetails ee:emps) {
	 System.out.println(ee);
 }
 
	}

}
