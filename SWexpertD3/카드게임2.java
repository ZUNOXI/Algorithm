package SWexpertD3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class 카드게임2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			LinkedList<Integer>[]arr = new LinkedList[(n*m)+1];
			for(int j = 1; j<=n+m; j++) {
				arr[j]  = new LinkedList<Integer>();
			}		
			
			for(int x = 1; x<=n; x++) {
				for(int y = 1; y<=m; y++) {
					arr[x+y].add(1);
				}
			}
			int max = 0;
			ArrayList<Integer> narr = new ArrayList<>();
			for(int j = 1; j<=n+m; j++) {
				if(arr[j].size()>max) {
					narr = new ArrayList<>();
					max = arr[j].size();
					narr.add(j);
				}
				else if(arr[j].size()==max) {
					narr.add(j);
				}
			}
			Collections.sort(narr);
			System.out.print("#"+(i+1)+" ");
			for(int c : narr) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
