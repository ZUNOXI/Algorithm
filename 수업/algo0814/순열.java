package algo0814;

import java.util.Arrays;

public class 순열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm(new int[] {1,2,3},0);
	}
	
	public static void perm(int[]arr,int k){
		if(k == arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		else {
			for(int i = k; i<arr.length; i++) {
				swap(arr, i, k);
				perm(arr, k+1);
				swap(arr, i, k);
			}
		}
	}
	
	public static void swap(int[]arr, int a, int b) {
		int tmp = arr[b];
		arr[b] = arr[a];
		arr[a] = tmp;
	}

}
