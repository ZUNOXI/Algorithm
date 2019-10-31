package algo0729;

import java.util.ArrayList;
import java.util.Scanner;

public class 스택 {

	public static void main(String[] args) throws Arayyerro  {
		// TODO Auto-generated method stub
		int[]stack = new int[5];
		// 스택에 저장될 자료를 담을 공간을 준비 -> 1차원 배열
		int top = -1;
		// 마지막에 삽입된 원소의 위치를 기억하는 변수 -1은 공백상태
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Push(입력 예: 1 10)\n2. Pop(입력 예 :2)\n0.종료");
			int input = sc.nextInt();
			if(input==0) {
				break;
			}
			
			if(input==1) {
				int n = sc.nextInt();
				if(n!=0) {
//					if(top>stack.length-1) {
//						throw new Arayyerro("스택이 넘쳐여!!");
//					}
					try {
						stack[top+1]=n;
						top++;
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("error");
					}
				}
			}
			else if(input==2) {
				try{
					System.out.println(stack[top-1]);
					top--;
				}catch(ArrayIndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			}
		}

	}

}





//try {
//	ObjectInputStream oi = new ObjectInputStream(new FileInputStream("data.dat"));
//	stack = (Mystack)oi.readObject;
//	oi.close();   읽거나 쓸 자료형에 serialization 미리 만들어 둘것.
	
//}
