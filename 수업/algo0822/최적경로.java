package algo0822;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 최적경로 {
	static int distancesum,distance, cnt;
	static int min;
	static int n;
	static LinkedList<Integer>[]list;
	static boolean [] visited;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			n = scn.nextInt();
			distance = 0;
			distancesum = 0;
			list = new LinkedList[n+3];
			for(int j = 1; j<=n+2; j++) {
				list[j] = new LinkedList<>();
			}
			list[1].add(scn.nextInt());
			list[1].add(scn.nextInt());
			list[n+2].add(scn.nextInt());
			list[n+2].add(scn.nextInt());
			
			for(int j = 2; j<n+2; j++) {
				list[j].add(scn.nextInt());
				list[j].add(scn.nextInt());
			}
			
			visited = new boolean[n+2];
			cnt = 0;
			min = 10000;
			findLoot(list,2);
			System.out.println("#"+(i+1)+" "+min);
		}
		
	}
	
	public static void findLoot(LinkedList<Integer>[] list, int k) {

		if(k == n+1) {
			distance = 0;
			for(int i = 1; i<n+2; i++) {
				distance = distance + (Math.abs(list[i].get(0)-list[i+1].get(0)) + Math.abs(list[i].get(1)-list[i+1].get(1)));
			}
			if(min>distance) {
				min = distance;
			}
			return;
		}
		else {
			for(int i = k ; i<n+2; i++) {
				swap(list, i, k);
				findLoot(list, k+1);
				swap(list, i, k);
			}
		}
	}
	
	public static void swap(LinkedList<Integer>[] list ,int i, int k) {
		LinkedList<Integer>temp = list[i];
		list[i] = list[k];
		list[k] = temp;
	}
}



//if(cnt==n) {
//distancesum = distance + (Math.abs(list[x].get(0)-list[n+2].get(0)) + Math.abs(list[x].get(1)-list[n+2].get(1)));
//if(min>distancesum) {
//	min = distancesum;
//	distancesum = distancesum - (Math.abs(list[x].get(0)-list[n+2].get(0)) + Math.abs(list[x].get(1)-list[n+2].get(1)));
//}
//}
//else {
//for(int i = 2; i<n+2; i++) {
//	if(visited[i]) {
//		continue;
//	}
//	else {
//		visited[i] = true;
//		distancesum = distance + (Math.abs(list[x].get(0)-list[i].get(0)) + Math.abs(list[x].get(1)-list[i].get(1)));
//		findLoot(i,cnt+1,distancesum);
////		distancesum = distancesum - distance;
//		visited[i] = false;
//	}
//}
//}
//visited[x-1]