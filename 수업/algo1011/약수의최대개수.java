package algo1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수의최대개수 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = Integer.parseInt(s);
		for(int i = 0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int max = 0;
			int maxidx = 0;
			for(int j = 1; j<=n; j++) {
				int cnt = 0;
				int c = j;
				for(int x = 1; x<=c; x++) {
					if(c%x==0) {
						cnt++;
					}
				}
				if(cnt>max) {
					max = cnt;
					maxidx = c;
				}
				else if(cnt==max) {
					maxidx = c;
				}
			}
			System.out.println("#"+(i+1)+" "+maxidx);
		}
	}

}
