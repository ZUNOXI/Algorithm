package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		String b1 = br.readLine();
		int b = Integer.parseInt(b1);
		int c1 = a*Integer.parseInt(b1.substring(2, 3));
		int c10 = a*Integer.parseInt(b1.substring(1, 2));
		int c100 = a*Integer.parseInt(b1.substring(0, 1));
		int res = a*b;
		System.out.println(c1+"\n"+c10+"\n"+c100+"\n"+res);
		
	}
}
