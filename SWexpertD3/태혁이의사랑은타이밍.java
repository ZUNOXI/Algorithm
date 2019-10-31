package SWexpertD3;

import java.util.Scanner;

public class 태혁이의사랑은타이밍 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int result = 0;
			int d = scn.nextInt();
			int h = scn.nextInt();
			int m = scn.nextInt();
			int cnt = (d-11)*60*24+(h-11)*60+(m-11);
			if(cnt>0) {
				result = cnt;
			}
			else if(cnt==0) {
				result = 0;
			}
			else {
				result = -1;
			}
			System.out.println("#"+(i+1)+" "+result);
		}
	}

}
