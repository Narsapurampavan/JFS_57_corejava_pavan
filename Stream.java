package codegananDSA;

import java.util.Arrays;
import java.util.List;


public class Stream {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(12,89,37,28,12,89,37,20);
		List<String> names=Arrays.asList("pavan","kalyan","nani","prabhu");
		numbers.stream().filter(i->i>40).forEach(System.out::println);
		
		//map
		List<Integer> lengths=names.stream().map(name->name.length()).collect(coll);
		System.out.println(lengths);
		numbers.stream().map(i->i*2).forEach(System.out::println);
		long failedStudents=numbers.stream().filter(marks->marks<40).count();
		System.out.println(failedStudents);
		names.stream().sorted().forEach(System.out::println);
		
		
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println());
		 
		
		numbers.stream()
		       .filter(n->n%2==0)
		       .distinct()

		       .forEach(System.out::println);
		
		numbers.stream().limit(3).forEach(System.out::println);
	     numbers.stream().skip(3).forEach(System.out::println);
	     Integer maxvalue=numbers.stream().max(i1,i2)->i1.compareTo(i2)).get();
	     System.out.println(maxvalue);
	     
		

	}

}
