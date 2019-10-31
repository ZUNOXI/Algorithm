package algo0729;

public class MyStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		try {
			System.out.println(stack.pop());
		}
		catch(MyStackEmptyException e) {
			System.out.println("스택 비었어ㅜㅜ");
		}
	}

}
