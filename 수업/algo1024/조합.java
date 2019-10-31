package algo1024;

import java.io.*;
import java.util.*;
public class 조합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long [] fac = new long [1000001];
        fac[1] = 1;
        fac[2] = 2;
        for (int i = 3; i < fac.length; i++) 
            fac[i] = fac[i-1] * i % 1234567891;
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer nr = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(nr.nextToken());
            int R = Integer.parseInt(nr.nextToken());
            long over = fac[N];
            long under = fac[R]*fac[N-R];
            if(under>1234567891) under %= 1234567891; 
            over*= power(under, 1234567889);
            if(over>1234567891) over %= 1234567891; 
            sb.append("#"+tc+" "+over+"\n");
        }
        System.out.println(sb.toString());
    }
    static long power(long n, int cnt) {
        if(cnt==1) return n;
        long p = power(n, cnt/2);
        long res = p*p;
        if(res>1234567890) res %= 1234567891;
        res*=(cnt%2==1? n : 1);
        if(res>1234567890) res %= 1234567891;
        return res;
    }
}