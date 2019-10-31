package D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 카드놀이2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			int m = scn.nextInt();
			int [] arr = new int [n*m];
			int max = 0;
			ArrayList<Integer> maxa = new ArrayList<>();
			for(int x = 1; x<=n; x++) {
				for(int y = 1; y<=m; y++) {
					int c = x+y;
					arr[c]++;
				}
			}
			for(int x = 2; x<=n*m; x++) {
					if(arr[x]>max) {
						maxa = new ArrayList<>();
						max = arr[x];
						maxa.add(x);
					}
					else if(arr[x]==max){
						maxa.add(x);
					}
				}
			Collections.sort(maxa);
			
			for(int z = 0; z<maxa.size(); z++) {
				System.out.print(maxa.get(z));
			}
			
		}
	}

}
