package D3;


import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 단순2진암호코드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scn = new Scanner(System.in);
		        int t = scn.nextInt();
		        for(int i = 0; i<t; i++) {
		            int N = scn.nextInt();
		            int M = scn.nextInt();
		            String [] arr = new String[N];
		            String a0 = "0001101";
		            String a1 = "0011001";
		            String a2 = "0010011";
		            String a3 = "0111101";
		            String a4 = "0100011";
		            String a5 = "0110001";
		            String a6 = "0101111";
		            String a7 = "0111011";
		            String a8 = "0110111";
		            String a9 = "0001011";
		            int result = 0;
		            for(int x = 0; x<N; x++) {
		                arr[x] = scn.next();
		            }
		            ArrayList<Integer>countarr = new ArrayList<>();
		            for(int x = 0; x<N; x++) {
		                ArrayList<Integer>narr = new ArrayList<>();
		                int y = M-1;
		                String s = arr[x];
		                while(y-7>0) {
		                    String s1= s.substring(y-7, y);
//		                  System.out.print(s1+" ");
		                    if(narr.size()==8) {
		                        break;
		                    }
		                    if(s1.equals(a0)) {
		                        narr.add(0);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a1)) {
		                        narr.add(1);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a2)) {
		                        narr.add(2);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a3)) {
		                        narr.add(3);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a4)) {
		                        narr.add(4);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a5)) {
		                        narr.add(5);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a6)) {
		                        narr.add(6);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a7)) {
		                        narr.add(7);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a8)) {
		                        narr.add(8);
		                        y = y-7;
		                    }
		                    else if(s1.equals(a9)) {
		                        narr.add(9);
		                        y = y-7;
		                    }
		                    else {
		                        y--;
		                        }
		                }
		             
		            if(narr.size()==8) {
		                ArrayList<Integer>revarr = new ArrayList<>();
		                for(int z = 8; z>0; z--) {
		                    revarr.add(narr.get(z-1));
		                }
		                int hsum = 0;
		                int jsum = 0;
		                int check = 0;
		                for(int j = 1; j<9;j++) {
		                    if(j==1||j==3||j==5||j==7) {
		                        hsum = hsum + revarr.get(j-1);
		                    }
		                    else if(j==8) {
		                        check = revarr.get(7);
		                    }
		                    else {
		                        jsum = jsum + revarr.get(j-1);
		                        }
		                    }
		                int checksum = hsum*3+jsum+check;
		                if(checksum%10==0) {
		                    countarr.add(jsum+hsum+check);
		                    }
		                }
		            }
		            if(countarr.size()==0) {
		                result = 0;
		            }
		            else {
		                result = countarr.get(countarr.size()-1);
		            }
		             
		            System.out.println("#"+(i+1)+" "+result);
		        }
		    }
		 
	}
