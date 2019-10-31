package 기초100제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s,"[], ");
		ArrayList<Integer>arr = new ArrayList<>();
		while(st.hasMoreTokens()) {
			int sc = Integer.parseInt(st.nextToken());
			arr.add(sc);
		}
		
		LinkedList<point>list = new LinkedList<>();
		
		
		for(int i = 1; i<6; i=i+2) {
			int z = arr.get(i-1);
			int z1 = arr.get(i);
			point p = new point(z, z1);
			list.add(p);
		}
		
		
		ArrayList<Integer>arrx = new ArrayList<>();
		ArrayList<Integer>arrx1 = new ArrayList<>();
		int alx = 0;
		int aly = 0;
		
		for(int i = 0; i<3; i++) {
			int z = list.get(i).x;
			int cnt = 0;
			for(int j = 0; j<3; j++) {
				if(z==list.get(j).x) {
					cnt++;
				}
			}
			if(cnt==1) {
				alx = list.get(i).x;
			}
		}
		
		for(int i = 0; i<3; i++) {
			int z = list.get(i).y;
			int cnt = 0;
			for(int j = 0; j<3; j++) {
				if(z==list.get(j).y) {
					cnt++;
				}
			}
			if(cnt==1) {
				aly = list.get(i).y;
			}
		}
		
		String result = "["+alx+", "+aly+"]";
		
		System.out.println(result);
		
	}
	
	static class point{
		int x;
		int y;
		public point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
