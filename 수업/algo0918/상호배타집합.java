package algo0918;

import java.util.Arrays;

public class 상호배타집합 {
	static int[] parents;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parents = new int[10];
		for (int i = 0; i<parents.length ;i++) {
			makeSet(i);
		}
		union(0,1); printSet();
		union(2,3); printSet();
		union(0,3); printSet();
		union(4,5); printSet();
		union(6,7); printSet();
		union(4,7); printSet();
		union(3,5); printSet();
		union(1,8); printSet();
		union(0,9); printSet();
	}	
	
	static void printSet() {
//		System.out.println(Arrays.toString(parents));
		for(int i = 0; i< parents.length; i++) {
			System.out.print(findSet(i)+" ");
		}
		System.out.println();
	}
	
	static void makeSet(int x) {
		parents[x] = x; 
	}
	
	static int findSet(int x) {
		if(x == parents[x]) {
			return x;
		}
		parents[x] = findSet(parents[x]);
		return findSet(parents[x]);
	}
	
	static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);
		parents[px] = py;
	}
}
