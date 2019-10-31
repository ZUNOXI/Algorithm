package D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class 준홍이의카드놀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			LinkedList<Integer>[]list = new LinkedList[n+m+1];
			for(int j = 1; j<=(n+m); j++) {
				list[j] = new LinkedList<Integer>();
			}
			for(int x = 1; x<=n; x++) {
				for(int y = 1; y<=m; y++) {
					int c = x+y;
					list[c].add(1);
				}
			}
			int max = 0;
			ArrayList<Integer>arr = new ArrayList<>();
			for(int j = 1; j<=(n+m); j++) {
				if(list[j].size()>max) {
					arr = new ArrayList<>();
					max = list[j].size();
					arr.add(j);
				}
				else if(list[j].size()==max) {
					arr.add(j);
				}
			}
			Collections.sort(arr);
			System.out.print("#"+(i+1)+" ");
			for(int k : arr) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

	static void perm(int [] arr, int k) {
		if(k== arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}
	}
	
	
	
	
	
	
	
	
	

}
