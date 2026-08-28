package codegananDSA;

import java.util.Arrays;
import java.util.List;

public class Arraymethods {

	public static void main(StringMethods[] agrs) {
		
		List<Integer>nums=Arrays.asList(1,5,7,9,4);
		System.out.println(nums);
		
//sorting of array
		int arr[]= {5,6,8,2,4,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//index of array element
		int index=Arrays.binarySearch(arr, 2);
		System.out.println("index:"+index);
		
		
		int arr1[]= {1,2,3};
		int[] arr2= {1,2,3};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.compare(arr1, arr2));

		
		int st[]= {8,4,2,4};
		int cpy[]=Arrays.copyOf(st, st.length);	
		System.out.println(Arrays.toString(cpy));
		
		
		int arr3[]=new int[6];
		Arrays.fill(arr3, 7);
		System.out.println(Arrays.toString(arr3));
		
//		
	}
}
