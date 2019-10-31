package SWexpertD3;

import java.util.ArrayList;
import java.util.Scanner;

public class 비밀번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			int n = scn.nextInt();
			String s = scn.next();
			ArrayList<String>arr = new ArrayList<>();
			ArrayList<String>narr = new ArrayList<>();
			for(int j = 0; j<n; j++) {
				arr.add(s.substring(j,j+1));
			}
			while(true) {
				int cnt = 0;
				for(int j = 0; j<arr.size(); j++) {
					if(j+1<arr.size() && arr.get(j).equals(arr.get(j+1))) {
						arr.remove(j);
						arr.remove(j);
						cnt++;
						break;
					}
				}
				if(cnt==0) {
					break;
				}
			}
			
			System.out.print("#"+(i+1)+" ");
			for(int j = 0; j<arr.size(); j++) {
				System.out.print(arr.get(j));
			}
			System.out.println();
		}
	}

}
