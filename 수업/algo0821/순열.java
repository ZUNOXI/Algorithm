package algo0821;

import java.util.Arrays;

public class 순열 {
	public static void main(String[] args) {
		perm(new int[] {1,2,3}, 0);
	}
	
	
	static void perm(int[] arr, int k) {
		if( k == arr.length ) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		 
		for(int i = k; i < arr.length; i++) {
			swap(arr, i, k);
			perm(arr, k+1);
			swap(arr, i, k);
		}
	}
	
	
	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
