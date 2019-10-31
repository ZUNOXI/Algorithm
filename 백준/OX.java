package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OX {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			String s = br.readLine();
			int score = 0;
			for(int j = 0; j<s.length();j++) {
				String s1 = s.substring(j,j+1);
				if(s1.equals("O")) {
					if(j==0) {
						score++;
					}
					else {
						for(int x = j; x>=0; x--) {
							String s2 = s.substring(x,x+1);
							if(s2.equals("O")) {
								score++;
							}
							else {
								break;
							}
						}
					}
				}
			}
			System.out.println(score);
		}
	}

}
