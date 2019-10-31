package SWexpertD3;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int [] arr = new int[n];
			int max = 0;
			int maxp = 0;
			for(int j = 0; j<n; j++) {
				for(int x = 0; x<m; x++) {
					int input = scn.nextInt();
					if(input==1) {
						arr[j]++;
					}
				}
				if(arr[j]>max) {
					max=arr[j];
					maxp=1;
				}
				else if(arr[j]==max) {
					maxp++;
				}
			}
			System.out.println("#"+(i+1)+" "+maxp+" "+max);
		}
	}
}

