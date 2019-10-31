package D3;

import java.util.Scanner;

public class StringSW {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(int t = 0; t<10; t++) {
			int n = scn.nextInt();
			String s = scn.next();
			String sw = scn.next();
			int cnt = 0;
			int i = 0;
			while(true) {
				String c = sw.substring(i,s.length()+i);
				i++;
				if(c.equals(s)) {
					cnt++;
				}				
				if(i+s.length()>sw.length()) {
					break;
				}
			}
			
			System.out.println("#"+(i+1)+" "+cnt);
		}
	}

}
