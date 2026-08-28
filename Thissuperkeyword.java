package codegananDSA;

public class Thissuperkeyword {
	class person{
		int salary=60000;
		public void getSalary(int salary) {
			salary=50000;
			System.out.println("parent salary is"+salary);
			System.out.println("parent class global salary:"+this.salary);
		}
	}

	
	public class Employee extends person{
		int salary=30000;
		public void getSalary(double salary) {
			System.out.println("my parttime salary is:"+salary);
		}
		public void getSalary(int salary) {
			salary=2000;
			System.out.println(salary);//local
			System.out.println(this.salary)
			super.
		}
	}
	public static void main(String[] args) {

	}

}
