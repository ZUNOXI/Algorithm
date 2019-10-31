package SWexpertD2;

import java.util.Scanner;

public class 준환이의운동관리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int l = scn.nextInt();
			int u = scn.nextInt();
			int x = scn.nextInt();
			
			if(x>=l && x<=u) {
				System.out.println("#"+(i+1)+" "+0);
			}
			else if(x>u) {
				System.out.println("#"+(i+1)+" "+(-1));
			}
			else {
				int plu = l-x;
				System.out.println("#"+(i+1)+" "+plu);
			}
		}
		}
}
