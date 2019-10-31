package SWexpertD2;

import java.util.ArrayList;
import java.util.Scanner;

public class 새로운불면증치료법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			ArrayList<String>arr = new ArrayList<>();
			int n = scn.nextInt();
			int cnt = 1;
			String num = Integer.toString(n);
//			System.out.println(num);
			while(true) {
				ArrayList<String>tem = new ArrayList<>();
				for(int j = 0; j < num.length(); j++) {
					tem.add(num.substring(j, j+1));
				}
				for(int j = 0; j<tem.size(); j++) {
					if (!(arr.contains(tem.get(j)))) {
						arr.add(tem.get(j));
						}
					}
				if(arr.size()==10) {
					break;
				}
				else {
					cnt++;
					num = Integer.toString(n * cnt);
				}
			}
			System.out.println("#"+(i+1)+" "+num);
			
			}
		}
}