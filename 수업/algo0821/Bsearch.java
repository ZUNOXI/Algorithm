package algo0821;

import java.util.Scanner;

public class Bsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,5,7,9,11,13,15};
		int low = 0;
		int high = arr.length - 1;
		int key = new Scanner(System.in).nextInt();
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] ==key) {
				high = mid;
				break;
			}
			
			else if(arr[mid] < key) {
				low = mid + 1;
			}
			
			else {
				high = mid - 1;
			}
		}
//		System.out.println(low);
		System.out.println(high);
	}

}
