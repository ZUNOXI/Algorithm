package algo1004;

import java.util.Arrays;

public class 조합 {
	public static void main(String[] args) {
		combination(0, 0);
	}
	static int[] arr = {1,3,5};
	static int[] sel = new int[2];
	static void combination(int idx, int s_idx) {
		if( s_idx == 2 ) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		if( idx == 3 )
			return;
		sel[s_idx] = arr[idx];
		combination(idx+1, s_idx+1);
		combination(idx+1, s_idx);
	}
}
