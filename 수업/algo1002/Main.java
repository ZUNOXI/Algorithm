package algo1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int r,c,s;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0; i<tc; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			String [] parr = new String[p];
			String [] qarr = new String[q];
			for(int j = 0; j<p; j++) {
				String str = br.readLine();
				parr[j] = str;
			}
			for(int j = 0; j<q; j++) {
				String str = br.readLine();
				qarr[j] = str;
			}
//			System.out.println(Arrays.toString(parr));
//			System.out.println(Arrays.toString(qarr));
			String stemp = null;
			for(int j = 0; j<p; j++) {
				s = parr[j];
				int a = 0, b=0, c=0;
				for(int x = 0; x<s.length(); x++) {
					String s1 = s.substring(x,x+1);
					if(s1.equals(".")) {
						
					}
					else if(s1.equals("(")) {
						a++;
					}
					else if(s1.equals("{")) {
						b++;
					}
					else if(s1.equals("[")) {
						c++;
					}
					else if(s1.equals(")")) {
						a--;
					}
					else if(s1.equals("}")) {
						b--;
					}
					else if(s1.equals("]")) {
						c--;
					}
				}
				
			}
		}
	}

}
