package codegananDSA;
interface Dad{
	default void sleep() {
		System.out.println("sleep left direction");
	}
}
interface Mom{
	default void sleep() {
		System.out.println("sleep right direction");
	}
}

public class Baby  implements Mom,Dad{
	public void sleep() {
		System.out.println("i can sleep my own");
		Mom.super.sleep();
		Dad.super.sleep();
	}

	public static void main(String[] args) {
         Baby bb=new Baby();
         bb.sleep();
	}

}
