package algo1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class 입국심사 {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        	String s = br.readLine();
        	StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] time = new int[n];
            for (int j = 0; j < n; j++) {
                time[j] = Integer.parseInt(br.readLine());
            }
            long max = 0;
            for (int j = 0; j < time.length; j++) {
                if (max < time[j]) {
                    max = time[j];
                }
            }
            long tmp = 0; long mtp = max * m; long mid; long min = max * m;
 
            while (tmp <= mtp) {
 
                mid = (tmp + mtp) / 2;
                long answer = 0;
 
                for (int j = 0; j < n; j++) {
                    answer = answer + (mid / time[j]);
                }
 
                if (answer < m) {
                    tmp = mid + 1;
                } else {
                    if (min > mid)
                        min = mid;
                    mtp = mid - 1;
                }
            }
             
            System.out.println("#"+(i+1)+" "+min);
 
        }
    }
 
}