package codegananDSA;

interface A{
	void m1();
	public default void sleeping() {
		System.out.println("sleeping with dreamzz...");
	}
}
public class interfacefunc implements A{
	public void m1() {
		System.out.println("eating in the class");
	}

public void sleeping() {
	System.out.println("sleeping with dreamz along with eating");
}

	public static void main(String[] args) {
		interfacefunc d=new interfacefunc();
		d.m1();
		d.sleeping();

	}

}

