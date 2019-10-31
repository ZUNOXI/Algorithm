package 백준;


import java.util.Scanner;
public class asd {
   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       int[][] arr = new int[100][100];
       for (int j = 0; j < arr.length; j++) {
           for (int j2 = 0; j2 < arr.length; j2++) {
               arr[j][j2] = 0;
           }
       }
       for (int i = 0; i < t; i++) {
           int y = sc.nextInt();
           int x = sc.nextInt();
           for (int j = y; j < y + 10; j++) {
               for (int j2 = x; j2 < x + 10; j2++) {
                       arr[j2][j] = 1;
               }
           }
       }
       int cnt = 0;
       for (int i = 0; i < 100; i++) {
           for (int j = 0; j < 100; j++) {
               if(arr[i][j]==1) {
                   if(i==0||i==99||j==0||j==99) {
                       arr[i][j]=2;
                       cnt++;
                   }
                   else if(arr[i-1][j]==0||arr[i+1][j]==0||arr[i][j-1]==0||arr[i][j+1]==0) {
                       arr[i][j]=2;
                       cnt++;
                   }
               }
           }
       }
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               if(arr[i][j]==2) {
                   if(i==0) {
                       if(arr[i+1][j]==2&&arr[i][j-1]==2) {
                           cnt++;
                       }else if(arr[i+1][j]==2&&arr[i][j+1]==2) {
                           cnt++;
                       }
                   }
                   else if(i==99) {
                       if(arr[i-1][j]==2&&arr[i][j-1]==2) {
                           cnt++;
                       }else if(arr[i-1][j]==2&&arr[i][j+1]==2) {
                           cnt++;
                       }
                   }
                   else if(j==0) {
                       if(arr[i][j+1]==2&&arr[i-1][j]==2) {
                           cnt++;
                       }else if(arr[i][j+1]==2&&arr[i+1][j]==2) {
                           cnt++;
                       }
                   }
                   else if(j==99) {
                       if(arr[i][j-1]==2&&arr[i-1][j]==2) {
                           cnt++;
                       }else if(arr[i][j-1]==2&&arr[i+1][j]==2) {
                           cnt++;
                       }
                   }
                   else if(arr[i+1][j]==2&&arr[i][j-1]==2) {
                       cnt++;
                   }else if(arr[i+1][j]==2&&arr[i][j+1]==2) {
                       cnt++;
                   }else if(arr[i-1][j]==2&&arr[i][j-1]==2) {
                       cnt++;
                   }else if(arr[i-1][j]==2&&arr[i][j+1]==2) {
                       cnt++;
                   }
               }
           }
       }
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               System.out.print(arr[i][j]);
           }
           System.out.println();
       }
       System.out.println(cnt);
   }
}