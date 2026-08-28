package codegananDSA;

import java.util.ArrayList;

public class ExampleArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("pawan");
		al.add("kalyan");
		al.add("aa");
		al.add("mb");
		System.out.println(al);
		al.remove("aa");
		System.out.println(al);
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(3);
		a2.add(4);
		a2.add(5);
		System.out.println(a2);
		System.out.println(a2.get(1));//index
		System.out.println(a2.contains(4));//element occur
		ArrayList<Integer> a3=new ArrayList<>();
		System.out.println(a2.isEmpty());
		System.out.println(a3.isEmpty());
		System.out.println(a2.isBlank());

	}

}
