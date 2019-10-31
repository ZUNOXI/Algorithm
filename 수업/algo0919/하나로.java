package algo0919;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class 하나로 {
    
    static class V implements Comparable<V>{
        int det;
        double val;
        public V(int det, double e_val) {
            super();
            this.det = det;
            this.val = e_val;
        }
        @Override
        public int compareTo(V o) {
            // TODO Auto-generated method stub
            return Double.compare(this.val, o.val);
        }
        
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int arrx[]=new int[n];
            int arry[]=new int[n];
            StringTokenizer stk1 = new StringTokenizer(br.readLine());
            StringTokenizer stk2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arrx[j]=Integer.parseInt(stk1.nextToken());
                arry[j]=Integer.parseInt(stk2.nextToken());
            }
            double tax = Double.parseDouble(br.readLine());
            int E_cnt=0;//간선의 개수
            for (int j = 0; j < n; j++) {
                E_cnt+=j;
            }
            double E_val[] = new double[E_cnt];
            int tt=0;
            for (int j = 0; j < n-1; j++) {
                for (int j2 = j+1; j2 < n; j2++) {
                    E_val[tt]=(Math.pow(Math.abs(arrx[j]-arrx[j2]), 2)+Math.pow(Math.abs(arry[j]-arry[j2]), 2))*tax;
                            tt++;
                }
            }//입력 끝 프림 구현
            
            double result=0;
            
            ArrayList<V>[] arrv=new ArrayList[n];
            for (int j = 0; j < n; j++) {
                arrv[j]=new ArrayList<>();
            }
            tt=0;
            for (int j = 0; j < n; j++) {
                for (int j2 = j+1; j2 < n; j2++) {
                    arrv[j].add(new V(j2,E_val[tt]));
                    arrv[j2].add(new V(j,E_val[tt]));
                    tt++;
                }
            }//각 정점에 자신이 갈 수 있는 정점과 그 간선크기 저장
            boolean b[] = new boolean[n];
            b[0]=true;
            PriorityQueue<V> pq = new PriorityQueue<>();
            pq.addAll(arrv[0]);
            tt=1;
            while(tt!=n) {
                V v=pq.poll();
                if(b[v.det]) {
                    continue;
                }
                result+=v.val;
                b[v.det]=true;
                pq.addAll(arrv[v.det]);
                tt++;
            }
            System.out.println("#"+(i+1)+" "+Math.round(result));
        }
    }
}