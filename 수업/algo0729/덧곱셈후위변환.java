package algo0729;

import java.util.Scanner;
import java.util.Stack;
public class 덧곱셈후위변환 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        for(int x = 0; x<1; x++){
        	StringBuilder sb= new StringBuilder();
        	int N = sc.nextInt();
        	String sel = sc.next();
	        for(int i=0;i<sel.length();i++) {
	            char c = sel.charAt(i);
	            if (c == '+') {
	                if(st.size() == 0) {
	                    st.push(c);
	                }else {
	                    for(int j = 0; j < st.size()+1; j++) {
	                        sb.append(st.pop());
	                    }
	                    st.push(c);
	                }
	                
	            }else if(c=='*') {
	                if(!(st.isEmpty()) && st.peek()=='+') {
	                    st.push(c);
	                }else {
	                    for (int j = 0; j < st.size()+1; j++) {
	                        if(!(st.isEmpty()) && st.peek()=='+') {
	                            break;
	                        }
	                        if(!(st.isEmpty()))
	                       	sb.append(st.pop());                        
	                    }
	                    st.push(c);
	                }
	            }
	            else if(c=='(') {
	            	 if(!(st.isEmpty()) && st.peek()=='+') {
		                    st.push(c);
		                }else {
		                    for (int j = 0; j < st.size()+1; j++) {
		                        if(!(st.isEmpty()) && st.peek()=='+') {
		                            break;
		                        }
		                        if(!(st.isEmpty()))
		                       	sb.append(st.pop());                        
		                    }
		                    st.push(c);
		                }
	            }
	            else {
	            	sb.append(c);
	            }
	        }
	        for (int i = 0; i < st.size()+1; i++) {
	            sb.append(st.pop());
	        }
	        
	        Stack<Integer> stack = new Stack<Integer>();
	        StringBuilder input = sb;
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
			System.out.println("#"+(x+1)+" "+result);
        }
        
    }
}