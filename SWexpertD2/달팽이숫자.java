package SWexpertD2;

import java.util.Scanner;
 
public class 달팽이숫자 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
         
        for(int i = 0; i<T ; i++) {
            int N = scn.nextInt();
            int Square = N*N;
            int[][]dal=new int[N][N];
            int cnt = 0;
            int x = 0;
            int y = 0;
            int height = 0;
            for(int j =0; j<N; j++) {
                for(int z = 0; z<N; z++) {
                    dal[j][z]=0;    
                }
            }
            while(true) {
                while(cnt!=Square-1) {  // 오른쪽으로 달리자
                    cnt++;
                    dal[x][y]=cnt;
                    y++;
                    if(y>N-1||dal[x][y]!=0) {
                        y--;
                        cnt--;
                        break;
                    }
                }
                while(cnt!=Square-1) {  // 아래로 달리자
                    cnt++;
                    dal[x][y]=cnt;
                    x++;
                    if(x>N-1||dal[x][y]!=0) {
                        x--;
                        cnt--;
                        break;
                    }
                }
                while(cnt!=Square-1) {  // 왼쪽로 달리자
                    cnt++;
                    dal[x][y]=cnt;
                    y--;
                    if(y<0||dal[x][y]!=0) {
                        y++;
                        cnt--;
                        break;
                    }
                }
                while(cnt!=Square-1) {  // 위로 달리자
                    cnt++;
                    dal[x][y]=cnt;
                    x--;
                    if(x<0||dal[x][y]!=0) {
                        x++;
                        cnt--;
                        break;
                    }
                }
                if(cnt==Square-1) {
                    for(int j =0; j<N; j++) {
                        for(int z = 0; z<N; z++) {
                            if(dal[j][z]==0) {
                                dal[j][z]=cnt+1;
                            }
                        }
                    }
                    break;
                    }
                }
            System.out.println("#"+(i+1));
            for(int j =0; j<N; j++) {
                for(int z = 0; z<N; z++) {
                    System.out.print(dal[j][z]+" ");    
                }
                System.out.println();
            }
            }
        }
    }