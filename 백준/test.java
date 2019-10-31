package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int t = 1; t <= tc; t++) {
            int N = sc.nextInt();
            double M = sc.nextInt();
            double K = sc.nextInt();
            double []arr=new double [N];
            for (int i = 0; i < N; i++) {
                arr[i]=sc.nextDouble();
            }
            Arrays.sort(arr);
            
            double km = K/M;   //초당만들어내는 붕어빵
            boolean flg = false;
            if(arr[0]>=M) {
            	for(int x = 0; x<N; x++) {
            		if(x+1<=arr[x]*km) {
            			flg=true;
                	}
            		else {
            			flg=false;
            			break;
            		}
                }
            }
            
            if(flg) {
                System.out.println("#"+ t + " Possible");
            }else
                System.out.println("#"+ t + " Impossible");
            }
        }
}
