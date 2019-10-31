package algo1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
public class 키순서테스트 {
   static int arr[][];
   static int N;
   static int M;
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer stk;
       int T=Integer.parseInt(br.readLine());
       for (int i = 0; i < T; i++) {
           N=Integer.parseInt(br.readLine());
           M=Integer.parseInt(br.readLine());
           arr = new int[N+1][N+1];
           for (int j = 0; j < M; j++) {
               stk=new StringTokenizer(br.readLine());
               int a=Integer.parseInt(stk.nextToken());
               int b=Integer.parseInt(stk.nextToken());
               arr[a][b]=1;
           }
           int cnt=0;
           for (int j = 1; j <= N; j++) {
               int k=bfs1(j,0)+bfs2(j,0);
               if(k==N-1)
                   cnt++;
           }
           System.out.println("#"+(i+1)+" "+cnt);
       }
   }
   private static int bfs2(int j, int i) {
       Queue<Integer> q = new LinkedList<>();
       int visited[] = new int[N+1];
       int k=i;
       q.add(j);
       visited[j]=1;
       while(!q.isEmpty()) {
           int k3 = q.poll();
           for (int k2 = 1; k2 <= N; k2++) {
               if(arr[k3][k2]==1 && visited[k2]==0) {
                   q.add(k2);
                   visited[k2]=1;
                   k++;
               }
           };
       }
       return k;
   }
   private static int bfs1(int j, int i) {
       Queue<Integer> q = new LinkedList<>();
       int visited[] = new int[N+1];
       int k=i;
       q.add(j);
       visited[j]=1;
       while(!q.isEmpty()) {
           int k3 = q.poll();
           for (int k2 = 1; k2 <= N; k2++) {
               if(arr[k2][k3]==1 && visited[k2]==0) {
                   q.add(k2);
                   visited[k2]=1;
                   k++;
               }
           };
       }
       return k;
   }
}