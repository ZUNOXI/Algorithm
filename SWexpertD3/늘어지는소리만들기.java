package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 늘어지는소리만들기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			String s = scn.next();
//			LinkedList<Digit>list = new LinkedList<>();
			String [] sarr = new String[s.length()+1];
			sarr[0] = "";
			for(int j = 1; j<sarr.length; j++) {
				String sc = s.substring(j-1,j);
				sarr[j] = sc;
			}
			int n = scn.nextInt();
			int [] narr = new int[s.length()+1];
			for(int j = 0; j<n; j++) {
				int z = scn.nextInt();
				narr[z]++;
			}
			System.out.print("#"+(i+1)+" ");
			for(int j = 0; j<s.length()+1; j++) {
				System.out.print(sarr[j]);
				for(int x = 0; x<narr[j]; x++) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

}
