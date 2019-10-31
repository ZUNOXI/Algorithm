package algo0729;

import java.util.Scanner;
import java.util.Stack;

public class 후위계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("계산하고자하는 문자열을 입력하시오.");
		String input = scn.next();
		int result = 0;
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i)=='+') {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b+a);
			}
			else if(input.charAt(i)=='-') {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b-a);
			}
			else if(input.charAt(i)=='*') {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b*a);
			}
			else if(input.charAt(i)=='/') {
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b/a);
			}
			else {
				stack.push(input.charAt(i)-'0');
			}
		}
		result = stack.pop();
		System.out.println(result);
	}

}
