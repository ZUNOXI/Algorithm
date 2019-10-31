package algo1010;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class 섬의개수테스트 {
    static int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
    static int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            if (x == 0 && y == 0) {
                break;
            }
            int[][] arr = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int res = 0;
            Queue<SSNode> q = new LinkedList<>();
            int cnt = 2;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 1) {
                        arr[i][j] = cnt;
                        q.add(new SSNode(i, j, cnt));
                        while (!q.isEmpty()) {
                            SSNode node = q.poll();
                            for (int k = 0; k < 8; k++) {
                                int nx = dx[k] + node.x;
                                int ny = dy[k] + node.y;
                                if (nx >= 0 && nx < x && ny >= 0 && ny < y) {
                                    if (arr[nx][ny] == 1) {
                                        arr[nx][ny] = cnt;
                                        q.add(new SSNode(nx, ny, cnt));
                                    }
                                }
                            }
                        }
                        cnt++;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (res < arr[i][j]) {
                        res = arr[i][j];
                    }
                }
            }
            if(res==0) {
                System.out.println(res);
            }else {
                System.out.println(res-1);
            }
            
        }
    }
}
class SSNode {
    int x, y, cnt;
    public SSNode(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}