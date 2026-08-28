package codegananDSA;

public class Employeedetails {
	
	int empid;
	StringMethods empname;
	public Employeedetails(int empid,StringMethods empname) {
		this.empid=empid;
		this.empname=empname;
		
	}
	
	public StringMethods toString() {
		return "employee[empid=" +empid+", empname="+empname+"]";
	}

}
