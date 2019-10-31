package 정올;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class 냉장고 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ele [] arr = new ele[n];
		for(int i = 0; i<n; i++) {
			ele e = new ele(scn.nextInt(), scn.nextInt());
			arr[i] = e;
		}
		Arrays.sort(arr);
		
		int maxdegree = -271;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if( maxdegree < arr[i].minc ) {
				cnt++;
				maxdegree = arr[i].maxc;
			}
		}
		System.out.println(cnt);
		
		
//		for(int i = 1; i<n; i++) {
//			int x = Math.max(arr[i].minc, arr[i-1].minc);
//			int y = Math.min(arr[i].maxc, arr[i-1].maxc);
//			if(x>y) {
//				cnt++;
//			}
//			else {
//				
//			}
//		}
		
		
	}

	static class ele implements Comparable<ele>{
		int minc;
		int maxc;
		public ele(int a, int b) {
			this.minc = a;
			this.maxc = b;
		}
		@Override
		public int compareTo(ele o) {
			// TODO Auto-generated method stub
			if(this.maxc == o.maxc) {
				return this.minc - o.minc;
			}
			return this.maxc - o.maxc;
		}
	}
}
