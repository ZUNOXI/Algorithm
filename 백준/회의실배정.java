package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class 회의실배정 {
	static int n, cntall, max, result;
	static LinkedList<Meeting>list;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub	
		Scanner scn = new Scanner(System.in);
		n = Integer.parseInt(br.readLine());
		list = new LinkedList<>();
		max = 0;
		for(int i = 1; i<=n;i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			Meeting me = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));			
			list.add(me);
		}
		
		Collections.sort(list, new Comparator<Meeting>() {

			@Override
			public int compare(Meeting o1, Meeting o2) {
				// TODO Auto-generated method stub
				return o1.start-o2.start;
			}
		});
		
//		for(int i = 0; i<n; i++) {
//			System.out.print(list.get(i).start+" ");
//			System.out.print(list.get(i).end+"/");
//		}
//		System.out.println();
		
		for(int i = 0; i<n; i++) {
			cntall = 1;
			int x = list.get(i).end;
			check(i,x);
		}
//			System.out.print("#!"+cntall+" ");
		System.out.println(max);
		}
	
	public static void check(int index, int st) {
		if(st>=list.get(n-1).end) {
			result = cntall;
//			System.out.print("("+cntall+")");
			cntall = 1;
		}
		else {
			for(int i = index; i<n; i++) {
				if(i+1<n && st<=list.get(i+1).start) {
//					System.out.print("시도중"+list.get(i).start+" "+list.get(i).end+"/");
					cntall++;
					check(i,list.get(i+1).end);
				}
			}
		}
		if(result>max) {
			max = result;
		}
	}
	
	static class Meeting{
		int start;
		int end;
		public Meeting(int a, int b ) {
			// TODO Auto-generated constructor stub
			this.start = a;
			this.end = b;
		}
	}
}	

	
//	Collections.sort(list, new Comparator<LinkedList>() {	
//
//		
//		@Override
//		public int compare(LinkedList o1,LinkedList o2) {
//			// TODO Auto-generated method stub
//			
//			return o2.get(0)-o1.get(0);
//		} 
//	});
	
//	public int compareTo(LinkedList<Integer>) {
//		// TODO Auto-generated method stub
//		if( this.endTime == o.endTime ) {
//			return this.startTime - o.startTime;
//		}
//		return this.endTime - o.endTime;
//	}
	
	
	
//	for(int i = 1; i<=n; i++) {
//		System.out.print(list[i].get(0)+" ");
//		System.out.print(list[i].get(1)+"/");
//	}
//	System.out.println();
	
//while(true) {
//int cnt = 0;
//for(int i = 1; i<=n;i++) {
//	if(i!=n && list[i].get(0)>list[i+1].get(0)) {
//		LinkedList<Integer>temlist = list[i];
//		list[i] = list[i+1];
//		list[i+1] = temlist;
//		cnt++;
//	}
//}
//if(cnt==0) {
//	break;
//}
//}
