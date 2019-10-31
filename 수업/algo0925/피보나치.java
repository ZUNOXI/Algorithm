package algo0925;

public class 피보나치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		memo = new int[100];
		System.out.println(fibo(9));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	static int fibo_dp(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i<=n; i++) {
			dp[i] = dp[i-1] +dp[i-2];
		}
		return dp[n];
	}
	
	static int [] memo;
	static int fibo(int n) { // 하향식 디피
		if(memo[n]!=0) {
			return memo[n];
		}
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		memo[n] = fibo(n-1)+fibo(n-2);
		return memo[n];
	}

}
