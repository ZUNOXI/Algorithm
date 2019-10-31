package SWexpertD2;

import java.util.Scanner;

public class 초심자의회문검사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			String s = scn.next();
			int end = s.length();
			int mid = (s.length())/2;
			int start = 0;
			int cnt = 0;
			int c = 0;
			if(end%2==0) {
				c = 1;
			}
			while(true) {
				if(start>=end) {
					break;
				}
//				System.out.println("?");?
				if(s.substring(start, start+1).equals(s.substring(end-1, end))) {
					cnt++;
//					System.out.print("? ");
				}
				start++;
				end --;
			}
			if(c!=1) {
				cnt--;
			}
//			System.out.println(cnt);
//			System.out.println(mid);
			if(cnt==mid) {
				System.out.println("#"+(i+1)+" "+1);
			}
			else {
				System.out.println("#"+(i+1)+" "+0);
			}
		}
	}

}
