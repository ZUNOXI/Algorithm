package D3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 원재의메모리구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int i = 0; i<T; i++) {
        	String s = scn.next();
        	int [] arr = new int[s.length()];
        	int cnt = 0;
        	for(int j = 0; j<arr.length; j++) {
        		arr[j] = Integer.parseInt(s.substring(j, j+1));
        	}
        	int [] narr = new int[arr.length];
        	for(int j = 0; j<arr.length; j++) {
        		if(arr[j]==narr[j]) {
        			continue;
        		}
        		else {
        			if(arr[j]==1) {
        				for(int x = j; x<narr.length; x++) {
        					narr[x]=1;
        				}
        			}
        			else if(arr[j]==0) {
        				for(int x = j; x<narr.length; x++) {
        					narr[x]=0;
        				}
        			}
        			cnt++;
        		}
        	}
        	
        	System.out.println("#"+(i+1)+" "+cnt);
        }
	}

}
