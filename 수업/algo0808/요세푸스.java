package algo0808;

import java.util.ArrayList;
import java.util.Scanner;

public class 요세푸스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		ArrayList<Integer> arr = new ArrayList<>();
		int N = scn.nextInt();
		int k = scn.nextInt();
//		for(int i = 1; i<N+1; i++) {
//			arr.add(i);
//		}
//		while(true) {
//			System.out.println(arr.get(k-1));
//			arr.remove(k-1);
//			k=k+k;
//			if(k>arr.size()) {
//				k=arr.size()%3+1;
//			}
//		}
		int[]arr = new int[N];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		int idx = 0;
		int cnt = 0;
		int outputCnt = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(true) {
			if(arr[idx % N]!=-1) {
				cnt++;
				
			}
			if(cnt==k) {
				sb.append(arr[idx%N]).append(", ");
//				System.out.println(arr[idx%N]);
				cnt = 0;
				outputCnt++;
				arr[idx%N] =-1;
				if(outputCnt == N) {
					break;
					}
				}
			idx++;
			}
		sb.delete(sb.length()-2, sb.length());
		sb.append(">");
		System.out.println(sb.toString());
		}
	}