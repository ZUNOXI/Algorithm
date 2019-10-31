package algo0729;

import java.util.Scanner;

public class 초심자의회문검사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			String s = scn.next();
			int j = 0;
			int end = s.length()-1;
			int length = s.length()-1;
			int good = 0;
			int cnt = 0;
			while(j<end){
				if(s.charAt(j)==s.charAt(end)){
					cnt++;
//					System.out.println(s.charAt(j));
				}
				if(cnt==length/2) {
					good = 1;
				}
				j++;
				end--;
//				System.out.println(cnt);
			}
			System.out.println("#"+(i+1)+" "+good);
		}
	}

}
