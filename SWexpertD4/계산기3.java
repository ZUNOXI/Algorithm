package SWexpertD4;

import java.util.Scanner;
import java.util.Stack;
public class 계산기3 {
     
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stk = new Stack<Character>();
        String s;
        StringBuilder sb = new StringBuilder();
        char c;
        for(int x = 0; x<10; x++) {
        	int n = sc.nextInt();
        	s = sc.next();
        	for(int i = 0; i<s.length(); i++) {
        		c = s.charAt(i);
        		if(Character.isDigit(c)) {
        			sb.append(c);
        		}
        		else if(c=='+'){
        			if(stk.size()==0) {
        				stk.push(c);
        			}
        			else {
        				while(stk.size()>0&& stk.peek()!='(') {
        					sb.append(stk.pop());
        				}
        				stk.push(c);
        			}
        		}
        	}
        	
        	while(stk.size()>0) {
        		sb.append(stk.pop());
        	}
        	
        	Stack<Integer> stack = new Stack<>();
        	StringBuilder input = sb;
        	int result = 0;
        	for(int j = 0; j<input.length(); j++) {
        		if(input.charAt(j)=='+') {
        			int a = stack.pop();
        			int b = stack.pop();
        			stack.push(a+b);
        		}
        		else {
        			stack.push(input.charAt(j)-'0');
        		}
        	}
        	result = stack.pop();
            System.out.println("#"+(x+1)+" "+result);
    }
}
}