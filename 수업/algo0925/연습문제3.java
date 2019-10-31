package algo0925;

import java.util.Scanner;

public class 연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {1,5,10,16};
		int[] dp = new int[101];
		for(int i = 1; i<101; i++) {
			dp[i] = dp[i-1] + coins[0];
		}
//		Scanner scn  = new Scanner(System.in);
//		int n = scn.nextInt();
//		int[] _1원 = new int[n+1];
//		int[] _5원 = new int[n+1];
//		int[] _10원 = new int[n+1];
//		int[] _16원 = new int[n+1];
//
//		for(int i = 0; i <= n; i++)
//			_1원[i] = i;
//		
//		for(int i = 0; i <= n; i++) {
//			if( i >= 5 )
//				_5원[i] = Math.min(_5원[i-5] + 1, _1원[i]);
//			else
//				_5원[i] = _1원[i];
//		}
//
//		for(int i = 0; i <= n; i++) {
//			if( i >= 10 )
//				_10원[i] = Math.min(_10원[i-10] + 1, _5원[i]);
//			else
//				_10원[i] = _5원[i];
//		}
//		
//		for(int i = 0; i <= n; i++) {
//			if( i >= 16 )
//				_16원[i] = Math.min(_16원[i-16] + 1, _10원[i]);
//			else
//				_16원[i] = _10원[i];
//		}
//		System.out.println(_16원[n]);
	}

}
