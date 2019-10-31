package SWexpertD2;

import java.util.Scanner;

public class 수도요금경쟁 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int resulta = 0;
			int resultb = 0;
			int p = scn.nextInt();
			int q = scn.nextInt();
			int r = scn.nextInt();
			int s = scn.nextInt();
			int w = scn.nextInt();
			int modb = 0;
			int choice = 0;
			
			if(w>r) {
				modb = (w-r)*s;
			}
			resulta = p * w;
			resultb = q + modb;
			
			if(resulta > resultb) {
				choice = resultb;
			}
			else {
				choice = resulta;
			}
			
			System.out.println("#"+(i+1)+" "+choice);
			
		}
	}

}
