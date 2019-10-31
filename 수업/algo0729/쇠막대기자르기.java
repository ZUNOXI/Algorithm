package algo0729;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기자르기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int x = 0; x<T; x++) {
			String s = scn.next();
			Stack<Character> stack = new Stack<Character>();
			int cnt = 0;
			s = " "+s;
			for(int i = 0; i<s.length(); i++) {
				if(s.charAt(i)=='(') {
					try {
					if(s.charAt(i-1)==')') {
						stack.push('(');
						cnt = cnt + stack.size();
					}
					else {
						stack.push('(');
						cnt++;}
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("문자열을 다시 입력해주세요!");
					}
				}
				else if(s.charAt(i)==')') {
					if(s.charAt(i-1)==')') {
						stack.pop();
						cnt++;
					}
					else {
						stack.pop();
						cnt--;
					}					
				}
			}
			System.out.println("#"+(x+1)+" "+cnt);
		}
	}
}
