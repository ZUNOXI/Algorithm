package SWexpertD2;

import java.util.Scanner;

public class 간단한소인수분해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int num = scn.nextInt();
			int cnt2 = 0;
			int cnt3 = 0;
			int cnt5 = 0;
			int cnt7 = 0;
			int cnt11 = 0;
			while(num%2==0) {
				num = num / 2;
				cnt2++;
			}
			while(num%3==0) {
				num = num / 3;
				cnt3++;
			}
			while(num%5==0) {
				num = num / 5;
				cnt5++;
			}
			while(num%7==0) {
				num = num / 7;
				cnt7++;
			}
			while(num%11==0) {
				num = num / 11;
				cnt11++;
			}
			
			System.out.println("#"+(i+1)+" "+cnt2+" "+cnt3+" "+cnt5+" "+cnt7+" "+cnt11);
			
		}
	}

}
