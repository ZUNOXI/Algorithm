package SWexpertD4;

import java.util.ArrayList;
import java.util.Scanner;

public class 수지의수지맞는여행 {
	static String [][] arr;
	static int cnt, max;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int r = scn.nextInt();
			int c = scn.nextInt();
			arr = new String [r+2][c+2];
			
			for(int x = 0; x<r+2; x++) {
				for(int y = 0; y<c+2; y++) {
					arr[x][y] = "a";
				}
			}
			
			for(int x = 1; x<r+1; x++) {
				String s = scn.next();
				for(int y = 1; y<c+1; y++) {
					arr[x][y]= s.substring(y-1,y);
				}
			}
			max = 1;
			cnt = 1;
			ArrayList<String>sarr = new ArrayList<>();
			sarr.add(arr[1][1]);
			
			
			search(1,1,1, sarr);
			
			System.out.println("#"+(i+1)+" "+max);
			
			
		}
	}
	
	public static void search(int x, int y, int cnt, ArrayList<String>sarr) {
		if(sarr.size()>=26) {
			return;
		}
		int temp = 0;
//		System.out.println("try");
		int [] dx = {-1,1,0,0};
		int [] dy = {0,0,1,-1};
		for(int i = 0; i<4; i++) {
			int nx = dx[i];
			int ny = dy[i];
			if(!(arr[x+nx][y+ny].equals("a")) && !(arr[x][y].equals(arr[x+nx][y+ny]))) {
				int check = 0;
				for(int j = 0; j<sarr.size(); j++) {
					if(sarr.get(j).equals(arr[x+nx][y+ny])){
						check++;
					}
				}
				if(check==0) {
//					System.out.println(sarr.size()+" / "+arr[x+nx][y+ny]+"/"+cnt);
					sarr.add(arr[x+nx][y+ny]);
					search(x+nx,y+ny,cnt++,sarr);
				}
			}
		}
		if(sarr.size()>max) {
			max = sarr.size();
		}
		int p = 0;
		for(int i = 0; i<sarr.size(); i++) {
			if(sarr.get(i).equals(arr[x][y])){
				p = i;
			}
		}
		sarr.remove(p);
	}

}
