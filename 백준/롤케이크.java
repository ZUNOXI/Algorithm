package 백준;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 롤케이크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int l = scn.nextInt();
		int[] arr = new int[l + 1];
		int maxfirst = 0;
		ArrayList<Integer> maxst = null;
		int maxfinal = 0;
		ArrayList<Integer> maxal = null;
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			int a = scn.nextInt();
			int b = scn.nextInt();
			if ((b - a + 1) > maxfirst) {
				maxst = new ArrayList<>();
				maxst.add(i);
				maxfirst = (b - a + 1);
			} else if ((b - a + 1) == maxfirst) {
				maxst.add(i);
			}
			for (int x = a; x <= b; x++) {
				if (arr[x] == 0) {
					arr[x] = i;
					cnt++;
				}
			}
			if (cnt > maxfinal) {
				maxal = new ArrayList<>();
				maxal.add(i);
				maxfinal = cnt;
			} else if (cnt == maxfinal) {
				maxal.add(i);
			}
		}
//		System.out.println(maxfirst);
//		System.out.println(maxfinal);
		Collections.sort(maxst);
		Collections.sort(maxal);
		System.out.println(maxst.get(0));
		System.out.println(maxal.get(0));
	}

}
