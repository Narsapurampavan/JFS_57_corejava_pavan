package codegananDSA;

import java.util.ArrayList;
class Employee{
	int empid;
	String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpname(String name) {
		empname=name;
	}
	public String getEmpName() {
		return empname;
	}
	public void setEmpId(int empid) {
		this.empid=empid;
	}
	
	public Employee(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
}


public class EmployeeArrayList {
	

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(102,"pavan"));
		System.out.println(emp);

	}

}
