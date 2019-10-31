package algo0729;

import java.util.Scanner;

public class 괄호짝짓기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(int x = 0; x<1; x++) {
			int N = scn.nextInt();
			int cnt1 = 0; // {
			int cnt2 = 0; // [
			int cnt3 = 0; // (
			int cnt4 = 0; // <
			char[]arr = new char[N];
			String s = scn.next();
			for(int i = 0; i<N; i++) {
				if(s.charAt(i)=='{') {
					cnt1++;
				}
				else if(s.charAt(i)=='[') {
					cnt2++;
				}
				else if(s.charAt(i)=='(') {
					cnt3++;
				}
				else if(s.charAt(i)=='<') {
					cnt4++;
				}
				else if(s.charAt(i)=='}') {
					cnt1--;
				}
				else if(s.charAt(i)==']') {
					cnt2--;
				}
				else if(s.charAt(i)==')') {
					cnt3--;
				}
				else if(s.charAt(i)=='>') {
					cnt4--;
				}
			}
			if(cnt1==0 && cnt2==0 && cnt3==0 && cnt4==0) {
				System.out.println("#"+(x+1)+" "+1);
			}
			else {
				System.out.println("#"+(x+1)+" "+0);
			}
		}
	}

}
