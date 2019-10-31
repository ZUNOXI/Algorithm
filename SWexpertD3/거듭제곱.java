package SWexpertD3;

import java.util.Scanner;

public class 거듭제곱 {
	public static int result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        for(int i = 0; i<10; i++) {
        	result = 1;
        	int n = scn.nextInt();
        	int x = scn.nextInt();
        	int y = scn.nextInt();
        	int a = xsquare(x,y);
        	System.out.println("#"+(i+1)+" "+a);
        	
        }
	}
	
	public static int xsquare(int x, int y) {
		if(y!=0) {
			result = result *x;
			y--;
			xsquare(x, y);
		}
		return result;
	}

}
