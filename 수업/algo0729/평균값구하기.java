package algo0729;

import java.util.Scanner;

public class 평균값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T  = scn.nextInt();
		int s = 0;
		double newavg = 0;
		for(int i = 0; i<T; i++) {
			double sum = 0.0;
			double avg = 0.0;
			for(int j = 0; j<10; j++) {
				double a = (double) scn.nextInt();
				sum = sum + a ;
				}
			avg = (double) (sum/10);
			newavg = avg%1;
			if(newavg >= 0.5) {
				newavg = 1;
				s = (int) (avg + newavg);
			}else{
				s = (int)avg ;
			}
			System.out.println("#"+(i+1)+" "+s);
			
		}
	}
}
