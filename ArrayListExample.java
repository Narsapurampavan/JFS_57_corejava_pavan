package codegananDSA;


import java.util.ArrayList;


public class ArrayListExample {
	public static  void main(String[] agrs) {
		ArrayList al=new ArrayList();
		//Vector al=new Vector();
		//LinkedList al=new LinkedList();
		//stack al=new stack();
		al.add("pavan");
		al.add("kalyan");
		al.add(null);
		al.add(true);
		al.add(56.94);
		al.add('g');
		al.add("ramesh");
		al.add("mallesh");
		System.out.println(al);
		System.out.println("intial capacity" +al.capacity());
		System.out.println("initial capacity" +al.size());
	}

}
