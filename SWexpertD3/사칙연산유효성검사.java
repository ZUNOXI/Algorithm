package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 사칙연산유효성검사 {
	public static String[] tree;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<10; i++) {
        	int N = Integer.parseInt(br.readLine());
        	tree = new String[N+1];
        	int result = 1;
        	for( int j = 0; j<N; j++) {
        		String x = br.readLine();
        		StringTokenizer st = new StringTokenizer(x, " ");
//        		System.out.println(st.countTokens());
        		if(st.countTokens()>3) {
        			int n = Integer.parseInt(st.nextToken());
        			String s = st.nextToken();
        			treeSetst(n, s);
        			String leftn = st.nextToken();
        			String rightn = st.nextToken();
        		}
        		else if(st.countTokens()==3) {
        			int n = Integer.parseInt(st.nextToken());
        			String s = st.nextToken();
        			treeSetst(n, s);
        			String leftn = st.nextToken();
        		}
        		else {
        			int n = Integer.parseInt(st.nextToken());
        			String s = st.nextToken();
        			treeSetst(n, s);
        			if(!(tree[n/2].equals("+"))&&!(tree[n/2].equals("-"))
        						&&!(tree[n/2].equals("*"))&&!(tree[n/2].equals("/"))) {
        					result = 0;
        				}
        			}
        		}
        	System.out.println("#"+(i+1)+" "+result);
        }
	}
	public static void treeSetst(int n, String n1) {
		tree[n] = n1;
	}
	
//	public static void treeSet(int n, int n1) {
//		tree[n] = Integer.toString(n1);
//	}
	
	public static void treeLeft(int n, int n1) {
		tree[2*n] = Integer.toString(n1);
	}
	
	public static void treeRight(int n, int n1) {
		tree[2*n+1] = Integer.toString(n1);
	}

}
