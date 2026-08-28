package codegananDSA;

public class Demo {
	class parentCon() {
		
		public parentCon() {
			this(45);
			System.out.println("parent class constructor 6");
		}
		public parentCon(int age) {
			this.m1();
			System.out.println("age of parent class constructor5"+age);
		}
}
		
	
	
	
	
	
	public class children extends parentCon{
		public children() {
			this(48);
			System.out.println("child class constructor 3");
		}
		public children(int age) {
			this.m1();
			System.out.println("age of child class con 2:"+age);
		}
		public void m1() {
			System.out.println("child class m1 method");
		}
		
	}

	public static void main(String[] args) {
		children cc=new children();
		cc.m1();

	}

}
