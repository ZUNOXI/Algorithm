package SWexpertD3;

import java.util.Arrays;
import java.util.Scanner;

public class 진기의최고급붕어빵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt(); // 손님수
			int m = scn.nextInt(); // 제조시간
			int k = scn.nextInt(); // 갯수
			
			int [] arr = new int [n];
			for(int j = 0; j<n; j++) {
				arr[j] = scn.nextInt();
			}
			
			Arrays.sort(arr);
			System.out.print("#"+(i+1)+" ");
			if(arr[0]==0) {
				System.out.println("Impossible");
			}
			else {
				boolean p = true;
				int c = 0;
				int x = 0; // 첫번째 손님
				int curk = 0; // 현재붕어빵
				while(c<=arr[n-1]) {
					c++;
					if(c%m==0) {
						curk = curk + k;
					}
					if(arr[x]==c) {
						curk = curk - 1;
						if(curk<0) {
							p = false;
							break;
						}
						else if(x==n-1) {
							break;
						}
						else {
							x++;
						}
					}
				}
				if(p) {
					System.out.println("Possible");
				}
				else {
					System.out.println("Impossible");
				}
			} 
		}
		
		
	}

}
