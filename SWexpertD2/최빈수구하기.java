package SWexpertD2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Num{
	int num;
	int cnt;
	public Num(int num, int cnt) {
		this.num = num;
		this.cnt = cnt;
	}
}

public class 최빈수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int N  = scn.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int j = 0; j<1000; j++) {
				arr.add(scn.nextInt());
			}
			
			int cnt = 0;
			int max = 0;
			ArrayList<Num> narr = new ArrayList<>();
			for(int j = 0; j<1000; j++) {
				cnt = 0;
				for(int x = 0; x<1000; x++) {
					if(arr.get(j) == arr.get(x)) {
						cnt++;
					}
				}
				if(cnt>max) {
					Num n = new Num(arr.get(j),cnt);
					narr.add(n);
					max = cnt;
				}
			}
			
			ArrayList<Integer> resarr = new ArrayList<>();
			for(int j = 0; j<narr.size(); j++) {
				if(narr.get(j).cnt == max) {
					resarr.add(narr.get(j).num);
				}
			}
			Collections.sort(resarr);
			System.out.println("#"+(i+1)+" "+resarr.get(resarr.size()-1));
		}
	}

}
