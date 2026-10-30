package Sample;

import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] arr1;
		
		arr1 = new int[arr.length*2];
		
		for(int i = 0; i <arr.length; i++) {
			arr1[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr1));

	}

}
