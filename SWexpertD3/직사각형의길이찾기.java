package D3;

import java.util.ArrayList;
import java.util.Scanner;

public class 직사각형의길이찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			ArrayList<Integer> arr = new ArrayList<>();
			int result = 0;
			for(int j = 0; j<3; j++) {
				arr.add(scn.nextInt());
			}
			for(int j = 0; j<3; j++) {
				int x = arr.get(j);
				int cnt = 0;
				for(int z = 0; z<3; z++) {
					if(arr.get(z)==x) {
						cnt++;
					}
				}
				if(cnt==1||cnt==3) {
					result = x;
				}
			}
			System.out.println("#"+(i+1)+" "+result);
			
			
		}
	}

}
