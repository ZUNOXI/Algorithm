package algo0919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 하나로prim {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			int V = Integer.parseInt(br.readLine());
			double [][] arr = new double[V][2];
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			for(int j = 0; j<V; j++) {
				arr[j][0] = Integer.parseInt(st.nextToken());
			}
			s = br.readLine();
			st = new StringTokenizer(s);
			for(int j = 0; j<V; j++) {
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			
			
			double E = Double.parseDouble(br.readLine());
			int A = V*(V-1)/2;
			double [][] edges = new double[A][3];
			int idx = 0;
			for(int j = 0; j<V; j++){
				double x1 = arr[j][0];
				double y1 = arr[j][1];
				for(int k = j+1; k<V; k++) {
					double x2 = arr[k][0];
					double y2 = arr[k][1];
					double L = (Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2))*E;
					edges[idx][0] = j;
					edges[idx][1] = k;
					edges[idx][2] = L;
					idx++;
				}
			}
			
			Arrays.sort(edges, new Comparator<double[]>() {

				@Override
				public int compare(double[] o1, double[] o2) {
					// TODO Auto-generated method stub
					return Double.compare(o1[2], o2[2]);
				}
			});
		
		ArrayList<Double>seList = new ArrayList<>();
		
		boolean [] visited = new boolean[V];
		
		seList.add(edges[0][0]);
		visited[(int) edges[0][0]] = true;
		
		int result = 0;
		
		while(seList.size()<V) {
			int min = 95354321;
			int minV = -1;
			for(double v : seList) {
				for(int i = 0; )
			}
		}
		
		}
	}

}
