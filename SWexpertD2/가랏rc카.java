package SWexpertD2;

import java.util.Scanner;


public class 가랏rc카 {
	
	static class Case{
		int con;
		int acc;
		public Case(int con,int acc) {
			this.con = con;		 // 컨트롤(감속2, 가속1)
			this.acc = acc;		 // 가속의 정도
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int n = scn.nextInt();
			int vel = 0;
			int dis = 0;
			for(int j = 0; j<n; j++) {
				int con = scn.nextInt();
				int acc;
				if(con==0) {
					acc = 0;
				}
				else {
					acc = scn.nextInt();
				}
				Case c = new Case(con,acc);
				switch(c.con) {
					case 1:
						vel = vel+c.acc;
						dis = dis+vel;
						break;
					case 2:
						vel = vel-c.acc;
						if(vel<0) {
							vel=0;
						}
						dis = dis+vel;
						break;
					case 0:
						dis = dis+vel;
						break;
				}
			}
			System.out.println("#"+(i+1)+" "+dis);
			
			
		}
	}

}
