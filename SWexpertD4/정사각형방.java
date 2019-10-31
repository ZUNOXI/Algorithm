package SWexpertD4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 정사각형방 {
	static int cnt, cntt, n, result;
	static int [][] arr;
	static ArrayList<Integer>narr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			n = scn.nextInt();
			arr = new int[n][n];
			for(int x = 0; x<n; x++) {
				for(int y = 0; y<n; y++) {
					arr[x][y] = scn.nextInt();
				}
			}
			cnt = 1;
			result = 1001;
			for(int x = 0; x<n; x++) {
				for(int y = 0; y<n; y++) {
					int p = arr[x][y];
					cntt = 1;
					Search(x,y,p,cntt);
//					System.out.print(cntt);
				}
			}
			System.out.println("#"+(i+1)+" "+result+" "+cnt);
		}
	}
	
	public static void Search(int x, int y, int p, int cntt) {
		int temp = 0;
		if(y-1>=0 && (arr[x][y-1] == arr[x][y]+1)) { // 왼쪽
			Search(x,y-1,p,++cntt);
			temp++;
		}
		else if(y+1<n && (arr[x][y+1] == arr[x][y]+1)) { // 오른쪽
			Search(x,y+1,p,++cntt);
//			System.out.println(cntt);
			temp++;
		}
		else if(x-1>=0 && (arr[x-1][y] == arr[x][y]+1)) { // 상
			Search(x-1,y,p,++cntt);
			temp++;
		}
		else if(x+1<n && (arr[x+1][y] == arr[x][y]+1)) { // 하
			Search(x+1,y,p,++cntt);
			temp++;
		}
//		System.out.println(temp+"/"+cntt);
		if(temp==0) {
			if(cntt>cnt) {
				narr = new ArrayList<>();
//				System.out.println(cntt+" / "+ cnt);
				cnt = cntt;
//				System.out.println(p+"/"+cnt);
				narr.add(p);
				Collections.sort(narr);
				result = narr.get(0);
			}
			else if((cntt!=1) && (cntt==cnt)) {
				narr.add(p);
				Collections.sort(narr);
				result = narr.get(0);
			}
			return;
		}
	}

}
