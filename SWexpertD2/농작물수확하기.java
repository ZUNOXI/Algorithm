package SWexpertD2;

import java.util.Scanner;
 
public class 농작물수확하기 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int i = 0; i<T; i++) {
            int n = scn.nextInt();
            int [][] arr = new int[n][n];
            for(int x = 0; x<n; x++) {
                String s = scn.next();
                for(int y = 0; y<n; y++) {
                    arr[x][y] = Integer.parseInt(s.substring(y, y+1));
                }
            }
            int mid = (n-1)/2;
            int sum = 0;
            int x = 0;
            int y = mid;
            int side = -1;
            while(true) {
                if(n == 1) {
                    sum = arr[0][0];
                    break;
                    }
                else if(x==0) {
                    sum = sum + arr[x][y];
                    x++;
                }
                else if(x<mid+1) {
                    for(int j = side; j< side*(-1)+1; j++) {
                        sum = sum + arr[x][y+j];
                    }
                    side --;
                    if(y+side<0) {
                        side = side+2;
                        x++;
                    }
                    else {
                        x++;
                    }
                }
                else if(x==(n-1)) {
                    sum = sum + arr[x][y];
                    break;
                }
                else if(x>mid){
                    for(int j = side; j< side*(-1)+1; j++) {
                        sum = sum + arr[x][y+j];
                    }
                        side ++;
                        x++;
                    }
                 
                }
            System.out.println("#"+(i+1)+" "+sum);
            }
             
        }
    }