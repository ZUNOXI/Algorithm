package algo0925;

public class 동전거스름돈구하기 {
	static int cnt, min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cnt = 0;
		min = 10000;
		change(8);
	}
	
	public static int change(int n) {
		if(n==1) {
			if(cnt<min) {
				cnt = min;
			}
		}
	}

}
