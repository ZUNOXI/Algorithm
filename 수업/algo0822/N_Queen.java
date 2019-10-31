
import java.util.Arrays;
import java.util.Scanner;

public class N_Queen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//체스판의 크기이자 퀸의 수
		int[][] map = new int[N][N];
		cnt = 0;
		backtrack(map, 0);
		System.out.println(cnt);
		
//		System.out.println("재귀호출 횟수 : " + callCnt);
	}
	static int cnt = 0;
	
//	static int callCnt = 0;
	static void backtrack(int[][] map, int idx) {
//		callCnt++;
		//모든 행을 다 검사했음
		if( idx == map.length ) {
			cnt++;
			return;
		}
		//해당 행의 열의 갯수만큼 반복하며 해당 열에 퀸을 배치하고 다음 행 재귀호출
		for(int i = 0; i < map[idx].length; i++) {
			
			if( canBeNQueen(map, idx, i) ) {
				map[idx][i] = 1;
				backtrack(map, idx+1);
				map[idx][i] = 0;
			}
		}
	}
	static boolean canBeNQueen(int[][] map, int r, int c) {
		//일단. 위로 올라가면서 또다른 퀸을 만나면 리턴 펄스
		for(int i = r - 1; i >= 0; i--) {
			if( map[i][c] == 1 )
				return false;
		}
		//좌상으로 올라가면서 또다른 퀸을 만나면 리턴 펄스!	
		for(int i = r-1, j = c-1; i >= 0 && j >= 0; i--, j--) {
			if(map[i][j] == 1)
				return false;
		}
		//우상으로 올라가면서 또다른 퀸을 만나면 리턴 펄스!
		for(int i = r-1, j = c+1; i >= 0 && j < map[i].length; i--, j++) {
			if(map[i][j] == 1)
				return false;
		}
		return true;
	}
}








