package algo0821;

import java.util.Scanner;

public class 거듭제곱 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = pow(2, 4);
//		System.out.println(n);
		pow(1, 5000);
		pow2(1,5000);
		System.out.println(cnt1);
		System.out.println(cnt2);
	}
	
	static int cnt1 = 0;
	static int cnt2 = 0;
	
	
	static int pow2(int a, int b) {
		cnt2++;
		if(b==1) {
			return a;
		}
		if(b==0) {
			return 1;
		}
		return a * pow2(a,b-1);
	}
	
	
	
	
	static int pow(int a, int b) {
		cnt1++;
		if(b==1) {
			return a;
		}
		if(b==0) {
			return 1;
		}
		
		int tmp = pow(a, b/2);
		
		if(b%2==1) { // b가 홀수라면
			return tmp*tmp*a;
		}
		else {
			return tmp*tmp;
		}
		
	}
}
