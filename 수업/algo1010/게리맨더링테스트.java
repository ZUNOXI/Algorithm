package algo1010;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 게리맨더링테스트 {
    public static int N, sum, INF = 987654321, min = INF;
    public static int[] pp, w, tf = {0,1};
    public static boolean[] v;
    public static int[][] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        N = Integer.parseInt(br.readLine());
        pp = new int[N];
        w = new int[N];
        arr = new int[N][N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {    //인구수 받기
            pp[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int tmp = Integer.parseInt(st.nextToken());    //인접한 구역의 수
            for(int k = 0; k<tmp; k++) {
                int j = Integer.parseInt(st.nextToken()) - 1;
                arr[i][j] = 1;
            }
        }
        permcomb(0);    //중복순열 이용해 파워셋 구현
        if(min == INF)
            System.out.println(-1);
        else
            System.out.println(min);
    }
    
    public static void permcomb(int cnt) {
        if(cnt == N) {
            v = new boolean[N];
            int wg1 = 0, wg2 = 0;
            
            //지역구  1
            for(int i = 0; i<N; i++) {
                if(w[i] == 0 && !v[i]) {
                    sum = 0;
                    gary(i);
                    wg1 = sum;
                    break;
                }
            }

            //지역구 2
            for(int i = 0; i<N; i++) {
                if(w[i] == 1 &&!v[i]) {
                    sum = 0;
                    gary(i);
                    wg2 = sum;
                    break;
                }
            }
            for(int i = 0; i<N; i++) {
                if(!v[i])    //두 구역으로 나눠지지 않는 경우 리턴
                    return;
            }
            
            int x = Math.abs(wg1 - wg2);
            min = min<x?min:x;
            return;
        }
        for(int i = 0; i<tf.length; i++) {
            w[cnt] = tf[i];
            permcomb(cnt+1);
        }
    }
    public static void gary(int now) {
        v[now] = true;
        sum += pp[now];
        for(int i = 0; i<N; i++) {
            if(!v[i] && w[i] == w[now] && arr[i][now] == 1) {
                gary(i);
            }
        }

    }
}