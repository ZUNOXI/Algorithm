package algo1016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class 경비원 {
    
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());
        int n = Integer.parseInt(br.readLine());
        ArrayList<mart> arrl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());  int d = Integer.parseInt(stk.nextToken());
            int dist = Integer.parseInt(stk.nextToken());   arrl.add(new mart(d, dist));
        }
        stk = new StringTokenizer(br.readLine());   int st = Integer.parseInt(stk.nextToken());  int std = Integer.parseInt(stk.nextToken());
        int result = 0;
        for (int i = 0; i < arrl.size(); i++) {
            mart s = arrl.get(i);
            if (st == 1) {
                if (s.d == 1) {
                    result+=Math.abs(s.dist-std);
                } else if (s.d == 2) {
                    result+=N+Math.min(s.dist+std,2*M-s.dist-std);        
                } else if (s.d == 3) {
                    result+=s.dist+std;
                } else {
                    result+=M+s.dist-std;
                }
                
                
            } else if (st == 2) {
                if (s.d == 1) {
                    result+=N+Math.min(s.dist+std,2*M-s.dist-std);
                } else if (s.d == 2) {
                    result+=Math.abs(s.dist-std);
                } else if (s.d == 3) {
                    result+=N-s.dist+std;
                } else {
                    result+=N+M-s.dist-std;
                }
                
                
            } else if (st == 3) {
                if (s.d == 1) {
                    result+=s.dist+std;
                } else if (s.d == 2) {
                    result+=N+s.dist-std;
                } else if (s.d == 3) {
                    result+=Math.abs(s.dist-std);
                } else {
                    result+=M+Math.min(s.dist+std,2*N-s.dist-std);
                }
                
                
            } else {
                if (s.d == 1) {
                    result+=M-s.dist+std;
                } else if (s.d == 2) {
                    result+=N+M-s.dist-std;
                } else if (s.d == 3) {
                    result+=M+Math.min(s.dist+std,2*N-s.dist-std);
                } else {
                    result+=Math.abs(s.dist-std);
                }
            }
        }
        System.out.println(result);
    }
    static class mart {
        int d, dist;
        public mart(int d, int dist) {
            super();
            this.d = d;
            this.dist = dist;
        }
    }
}