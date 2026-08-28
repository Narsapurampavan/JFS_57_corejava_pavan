package codegananDSA;

public class StringMethods {
  public static void main(String[] agrs) {
	 String  name1="bahubali"; //immutable
	  System.out.println(name1);
	  
	  String st1= new String("pavan");
	  String st2=new String("pavan");
	  System.out.println(st1==st2);// new keywords reference==> false
	  System.out.println(st1.equals(st2));
	  
	  String a="bahubali";
	  String b="bahu";
	  String c=b+"bali";
	  System.out.println(a==c);
	  System.out.println(a.equals(c));
	  
	  
	  //index
	  String name="welcome to bahubali";
	  System.out.println(name.charAt(0));//index of 0 =>w
	  //System.out.println(name.charAt(30);)// out of boundarys
	  System.out.println(name.codePointAt(6));//ascill value of character
	  System.out.println(name.codePointBefore(7));//before ascill value
	  String cmp1="babu";
	  String cmp2="BAHU";
	  
	  System.out.println(name)
	  
  }
}
