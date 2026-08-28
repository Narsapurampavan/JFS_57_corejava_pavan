package codegananDSA;
interface employee{
	void work();

	static void employeename() {
		System.out.println("abc company");
	}
}
public class Devel implements employee{
	public void work() {
		System.out.println("handling some issue");
	}

	public static void main(String[] args) {
		Devel de=new Devel();
		de.work();
		employee.employeename();

	}

}
