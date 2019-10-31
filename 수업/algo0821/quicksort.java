package algo0821;

import java.util.ArrayList;
import java.util.Arrays;

public class quicksort {

	public static void main(String[] args) {
		int[] arr = {3,2,5,1,4,7};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void quickSort(int[] arr, int left, int right) {
		if(left < right) {
			int pivot = partition(arr, left, right);
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
		}
	}
	static int partition(int[] arr, int left, int right) {
		int x = arr[right];
		int i = left-1;
		for(int j = left; j < right; j++) {
			if( arr[j] <= x ) {
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		int tmp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = tmp;
		return i+1;
	}


}
