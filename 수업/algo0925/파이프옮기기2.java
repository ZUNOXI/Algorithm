package algo0925;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class 파이프옮기기2 {
    static int N;
    static long cnt;
    static int[][] arr;
    static boolean [][] visited;
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+2][N+2];
        for(int x = 1; x<N+1; x++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for(int y = 1; y<N+1; y++) {
                int c = Integer.parseInt(st.nextToken());
                if(c==0) {
                    arr[x][y]=2;
                }
                else {
                    arr[x][y]=c;
                }
            }
        }
        arr[1][1]=5; arr[1][2]=5; // 처음 파이프는 가로로 누워있다. 
        
        cnt = 0;
        int x = 1; int y = 2; // 가로의 오른쪽칸에서 출발
        
        dfs(x,y);
        
        System.out.println(cnt);
        
        }
        
        public static void dfs(int x,int y) {
            if(x==N && y==N) {
                cnt++;
                return;
            }
            else {
                if(arr[x][y-1]==5) { // 가로일때
                    if(arr[x][y+1]==2 ) { // 가로확인
                        arr[x][y-1]=2; arr[x][y+1]=5;
                        dfs(x,y+1);
                        arr[x][y-1]=5; arr[x][y+1]=2;
                    }
                    if(arr[x+1][y+1]==2 && arr[x][y+1]!=1 && arr[x+1][y]!=1) { // 대각선 확인
                        arr[x][y-1]=2; arr[x+1][y+1]=5;
                        dfs(x+1,y+1);
                        arr[x][y-1]=5; arr[x+1][y+1]=2;
                    }
                }
                else if(arr[x-1][y]==5) { // 세로일때
                    if(arr[x+1][y]==2) { // 세로확인
                        arr[x-1][y]=2; arr[x+1][y]=5;
                        dfs(x+1,y);
                        arr[x-1][y]=5; arr[x+1][y]=2;
                    }
                    if(arr[x+1][y+1]==2 && arr[x][y+1]!=1 && arr[x+1][y]!=1) { // 대각선 확인
                        arr[x-1][y]=2; arr[x+1][y+1]=5;
                        dfs(x+1,y+1);
                        arr[x-1][y]=5; arr[x+1][y+1]=2;
                    }
                }
                else if(arr[x-1][y-1]==5) {
                    if(arr[x][y+1]==2) { // 가로확인
                        arr[x-1][y-1]=2; arr[x][y+1]=5;
                        dfs(x,y+1);
                        arr[x-1][y-1]=5; arr[x][y+1]=2;
                    }
                    if(arr[x+1][y]==2) { // 세로확인
                        arr[x-1][y-1]=2; arr[x+1][y]=5;
                        dfs(x+1,y);
                        arr[x-1][y-1]=5; arr[x+1][y]=2;
                    }
                    if(arr[x+1][y+1]==2 && arr[x][y+1]!=1 && arr[x+1][y]!=1) { // 대각선 확인
                        arr[x-1][y-1]=2; arr[x+1][y+1]=5;
                        dfs(x+1,y+1);
                        arr[x-1][y-1]=5; arr[x+1][y+1]=2;
                    }
                }
            }
        }
    }