package Sample;

import java.util.Arrays;

public class ReversingArray {
	
	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30,40,50};
		int[] arr1 = new int[arr.length];
		int size = 0;
		
		for(int i = arr.length-1; i >= 0; i--) {
			arr1[size] = arr[i];
			size++;
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}
