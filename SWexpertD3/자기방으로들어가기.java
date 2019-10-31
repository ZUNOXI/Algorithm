package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 자기방으로들어가기 {
	/*
	 10 100
	 20 80
	 30 50 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			int [] arr = new int [201];
			Person [] arr = new Person[n];
			for(int j = 0; j<n; j++) {
				int a = (scn.nextInt()-1)/2;
				int b = (scn.nextInt()-1)/2;
				
//				Person p = new Person(Math.min(a, b),Math.max(a, b));
//				arr[j] = p;
//			}
//			
//			Arrays.sort(arr);
//			
//			int cnt =1 ;
//			int max = 0;
//			for(int x = 1; x<n; x++) {
//				cnt = 1;
//				for(int j = 0; j<n; j++) {
//					if((arr[x].start>arr[j].start && arr[x].start<arr[j].end)||(arr[x].end>arr[j].start && arr[x].end<arr[j].end)) {
//						cnt++;
//					}
//				}
//				max = Math.max(max, cnt);
//			}
//			System.out.println("#"+(i+1)+" "+max);
			
			
			}
		}
	}
	
	static class Person implements Comparable<Person>{
		int start;
		int end;
		public Person(int a, int b) {
			this.start = a;
			this.end = b;
		}
		@Override
		public int compareTo(Person o) {
			// TODO Auto-generated method stub
			return this.start - o.start;
		}
	}

}
