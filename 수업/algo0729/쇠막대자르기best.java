package algo0729;

import java.util.Scanner;

public class 쇠막대자르기best {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in) ;
		int T = scn.nextInt();
		int stick = 0;
		int result = 0;
		for(int tc = 1; tc<=T; tc++) {
			String str = scn.next();
			for(int i = 0; i<str.length(); i++) {
				char c = str.charAt(i);
				
				
				if(c=='(') {
					//내가 열림일때
					char next_char = str.charAt(i+1);
					if(next_char == '(') {
						//i 위치에서 막대기 시작
						stick++;
					}
				}
				
				else if(c==')') {
					char pre_char = str.charAt(i-1);
					if(pre_char == '(') {
						//i 위치에서 레이저 떨어짐
						result += stick;
					}
					else if(pre_char == ')') {
						stick--;
						result++;
					}
				}
			}
			System.out.println("#"+tc+" "+result);
		}
	}

}
