package Sample;

import java.util.Arrays;

public class ReversingTwoPointer {

	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30,40,50};
		int startPointer = 0;
		int endPointer = arr.length-1;
		
		while(startPointer < endPointer) {
			int temp = arr[startPointer];
			arr[startPointer] = arr[endPointer];
			arr[endPointer] = temp;
			startPointer++;
			endPointer--;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
