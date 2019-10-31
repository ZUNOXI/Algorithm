package 백준;

import java.util.Scanner;

public class 비밀이메일 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int len = s.length();
		int r = 0, c = len;
		int max = 0;
		for(int i = 1; i<len; i++) {
			if(len%i==0) {
				max = i;
			}
			if(max>r && max<c) {
				r=max;
				c=len/i;
			}
		}
		System.out.println(r+" "+c);
		String [][] arr = new String[r][c];
		int j = 0;
		for(int y = 0; y<c; y++) {
			for(int x = 0; x<r; x++) {
				arr[x][y]=s.substring(j,j+1);
				j++;
			}
		}
		
//		for(int x = 0; x<r; x++) {
//			for(int y = 0; y<c; y++) {
//				System.out.print(arr[x][y]);
//			}
//		}
		
	}

}
