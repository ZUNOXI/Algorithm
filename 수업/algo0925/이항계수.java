package algo0925;

public class 이항계수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		memo = new long[101][51];
		System.out.println(bino(100,50));
	}
	
	static long bino_dp(int n, int k) {
		long[][]dp = new long[n+1][k+1];
		
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<=k; j++) {
				if(j==0||j==1) {
					dp[i][j] = 1;
				}
				else {
					dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
				}
			}
		}
		return dp[n][k];
	}
	static long [][] memo;
	static long bino(int n, int k) {
		if(memo[n][k]!=0) {
			return memo[n][k];
		}
		if(k==0) {
			return 1;
		}
		if(k==n) {
			return 1;
		}
		memo[n][k] =bino(n-1,k-1)+bino(n-1,k);
		return memo[n][k];
	}
}
