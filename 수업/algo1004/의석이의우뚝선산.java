package algo1004;

import java.io.IOException;
import java.util.Scanner;

public class 의석이의우뚝선산 {
	 static int n;
	    static int[] arr;
	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        int tc = sc.nextInt();
	        for(int i=1;i<=tc;i++) {
	            n = sc.nextInt();
	            arr = new int[n];
	            for(int j=0;j<n;j++) {
	                arr[j] = sc.nextInt();
	            }
	            int res = find();
	            System.out.println("#"+i+" "+res);
	        }
	    }
	    
	    private static int find() {
	        int result = 0;
	        for(int j=0;j<n;) {
	            int num = arr[j];
	            boolean flag = true;
	            int up = 1,down = 0;
	            for(int k=j+1;k<n;k++) {
	                if(flag) {
	                    if(num<arr[k]) {
	                        num = arr[k];
	                        up++;
	                    }else {
	                        flag = false;
	                        num = arr[k];
	                        up--;
	                        down++;
	                    }
	                }else {
	                    if(num>arr[k]) {
	                        down++;
	                        num = arr[k];
	                    }else {
	                        break;
	                    }
	                }
	            }
	            result += (up*down);
	            j += up+down;
	        }
	        return result;
	    }
    }
