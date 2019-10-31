package algo1017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int rest[][] = new int[N + 1][N + 1];
        int arr[][] = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                rest[i][j] = Integer.parseInt(st.nextToken());
                arr[i][j] = 5;
            }
        }
        Queue<tree> queue = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            queue.add(new tree(x, y, z));
        }
        
        for (int tc = 0; tc < K; tc++) {
            ArrayList<tree> tlist = new ArrayList<>();
            ArrayList<tree> list = new ArrayList<>();
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                tree t = queue.poll();
                if (arr[t.x][t.y] >= t.age) {
                    arr[t.x][t.y] -= t.age;
                    t.age += 1;
                    tlist.add(t);
                } else {
                    list.add(t);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                tree t = list.get(i);
                arr[t.x][t.y] += t.age / 2;
            }
            cnt = tlist.size();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    arr[i][j] += rest[i][j];
                }
            }
            Collections.sort(tlist, new Comparator<tree>() {
                @Override
                public int compare(tree o1, tree o2) {
                    // TODO Auto-generated method stub
                    return o1.age-o2.age;
                }
            });
            queue.addAll(tlist);
        }
        System.out.println(queue.size());
    }
    static int dx[] = { 0, 0, 1, 1, 1, -1, -1, -1 };
    static int dy[] = { 1, -1, 0, 1, -1, 0, 1, -1 };
    
    static class tree {
        int x, y, age;
        public tree(int x, int y, int age) {
            super();
            this.x = x;
            this.y = y;
            this.age = age;
        }
    }
}