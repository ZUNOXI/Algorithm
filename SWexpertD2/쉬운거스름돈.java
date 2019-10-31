package SWexpertD2;

import java.util.Scanner;

public class 쉬운거스름돈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int N = scn.nextInt();
			int oman = 0;
			int man = 0;
			int ochun = 0;
			int chun = 0;
			int obak = 0;
			int bak = 0;
			int osib = 0;
			int sib = 0;
			oman = N / 50000;
			N = N % 50000;
			man = N / 10000;
			N = N % 10000;
			ochun = N / 5000;
			N = N % 5000;
			chun = N / 1000;
			N = N % 1000;
			obak = N / 500;
			N = N % 500;
			bak = N / 100;
			N = N % 100;
			osib = N / 50;
			N = N % 50;
			sib = N / 10;
			N = N % 10;
			
			System.out.println("#"+(i+1));
			System.out.println(oman+" "+man+" "+ochun+" "+chun+" "+
					obak+" "+bak+" "+osib+" "+sib);
		}
	}

}
