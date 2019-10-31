package algo0729;

public class FIbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(memo);
		long start = System.currentTimeMillis();
//		System.out.println(fibo(42));
		fibo(1000);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
//		System.out.println(memo);
	}
	static int[] memo = new int[1000];
	static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(memo[n]==0) {
			memo[n]= fibo(n-1)+fibo(n-2);
			
	return memo[n];
	
	}
}
