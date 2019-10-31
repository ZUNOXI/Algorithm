package algo0729;

import java.util.Scanner;
import java.util.Stack;

public class 괄호검사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i<s.length(); i++) {
			if(')'==s.charAt(i)) {
				if(stack.empty()) {
					System.out.println("잘못된 괄호입니다.");
				}
				else {
					stack.pop();
				}
			}else if('('==s.charAt(i)) {
				stack.push('(');
			}
		}
		if(stack.empty()) {
			System.out.println("정상적인 괄호입니다.");
		}
		else {
			System.out.println("잘못된 괄호입니다.");
		}
		
	}

}
