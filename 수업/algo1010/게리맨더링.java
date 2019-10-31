package algo1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 게리맨더링 {
	static int [][]arr;
	static int N, sum, min;
	static boolean[] visited;
	static int []temp;
	static int []test = {0,1};
	static int [] peo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		peo = new int[N];
		temp = new int[N];
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		for(int i = 0; i<N; i++) {
			peo[i] = Integer.parseInt(st.nextToken());
		}
		arr = new int[N][N];
		for(int i = 0; i<N; i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			int po = Integer.parseInt(st.nextToken());
			for(int j = 0; j<po; j++) {
				int token = Integer.parseInt(st.nextToken())-1;
				arr[i][token] = 1;
			}
		}
//		for(int i = 0; i<N; i++) {
//			for(int j = 0; j<N; j++) {
//			System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
		min = 987123451;
		perm(0);    //중복순열 이용해 파워셋 구현
        if(min == 987123451) {
            System.out.println(-1);
        }
        else {
            System.out.println(min);
        }
	}
	public static void perm(int cnt) {
        if(cnt == N) {
            visited = new boolean[N];
            int dist1 = 0;
            int dist2 = 0;
            for(int i = 0; i<N; i++) {
                if(temp[i] == 0 && !visited[i]) {
                    sum = 0;
                    garymen(i);
                    dist1 = sum;
                    break;
                }
            }
            for(int i = 0; i<N; i++) {
                if(temp[i] == 1 &&!visited[i]) {
                    sum = 0;
                    garymen(i);
                    dist2 = sum;
                    break;
                }
            }
            
            for(int i = 0; i<N; i++) {
                if(!visited[i]) {
//                	System.out.println("띠용");
                    return;
                }
            }
//            System.out.println("띠용2");
            int x = Math.abs(dist1 - dist2);
            if(min>x) {
//            	System.out.println("띠용3");
            	min = x;
            }
            return;
        }
        for(int i = 0; i<test.length; i++) {
            temp[cnt] = test[i];
            perm(cnt+1);
        }
    }
    public static void garymen(int num) {
        visited[num] = true;
        sum = sum + peo[num];
        for(int i = 0; i<N; i++) {
            if(!visited[i] && temp[i] == temp[num] && arr[i][num] == 1) {
                garymen(i);
            }
        }
    }
}
