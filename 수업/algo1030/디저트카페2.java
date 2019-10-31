package algo1030;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class 디저트카페2 {
    static int n;
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for(int i=1;i<=tc;i++) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n][n];
            // 입력 받기
            for(int j=0;j<n;j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0;k<n;k++)
                    arr[j][k] = Integer.parseInt(st.nextToken());
            }
            // 방문 체크
            visited = new boolean[n][n];
            // 중복 숫자 체크(1~100)
            nVisited = new boolean[101];
            // result 초기화
            result = 0;
            // 50개 케이스 3초 n=20개 최대
            for(int j=0;j<n;j++) {
                for(int k=0;k<n;k++) {
                    startX = j;
                    startY = k;
                    visited[j][k] = true;
                    nVisited[arr[j][k]] = true;
                    // 왼쪽으로 도나 오른쪽으로 도나 똑같기 때문에 한 쪽 아래로만 돌면 된다.
                    solve(j,k,1,0);
                    visited[j][k] = false;
                    nVisited[arr[j][k]] = false;
                }
            }
            if(result<4) result = -1;
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.print(sb);
    }
    
    static int startX,startY,result;
    static boolean[] nVisited;
    static boolean[][] visited;
    static int[][] dir = {{1,1},{1,-1},{-1,-1},{-1,1}};
    private static void solve(int x,int y,int cnt,int d) {
        if(d==4) return;
        int tx = x+dir[d][0];
        int ty = y+dir[d][1];
        if(tx<0 || ty<0 || tx>=n || ty>=n) return;
        if(visited[tx][ty]||nVisited[arr[tx][ty]]) {
            // 이미 갔던 지점이 시작 점일 경우 개수 따지기
            if(tx==startX&&ty==startY) {
                result = Math.max(result, cnt);
            }
            return;
        }
        // 숫자 사용 & 방문 표시
        nVisited[arr[tx][ty]] = true;
        visited[tx][ty] = true;
        // 한 방향으로 쭉
        solve(tx,ty,cnt+1,d);
        // 그 때 그 때 다음 방향으로 틀기
        solve(tx,ty,cnt+1,d+1);
        visited[tx][ty] = false;
        nVisited[arr[tx][ty]] = false;
    }
}