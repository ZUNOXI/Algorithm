package algo0809;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 파생스레드는 가각 자신의 수행내역서를  run 함수로 전달받습니다.
		System.out.println("해야될일...");
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스레드란? 명령처리 흐름.
		System.out.println("Hello");
		
		System.out.println("world");
		
		// 메인함수는 메인스레드의 수행내역확인
		Thread t = new Thread(new MyRunnable());
		t.start();
		
		//Thread클래스의 객체를 만들면서 원하는 수행내역서가 구현되있는  Runnable객체를
		//넘겨주고 start 함수를 호출하면 파생스레드가 주어진 수행내역서를 수행
	}

}
