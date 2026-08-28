package codegananDSA;

 class guest{
	 public void tale() { 
	System.out.println( "hii to child" );
}
 }
 class Developer extends guest{
	 public void property() {
		 System.out.println("hi to developer");
	 }
 }


public class Child extends Developer {
	public  void delete() {
		System.out.println("fkjsdhkjfhskjfkjsfoi");
	}

	public static void main(StringMethods[] args) {
		Child ch=new Child();
	
		ch.delete();

	}

}
