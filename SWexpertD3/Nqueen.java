package D3;

import java.util.Scanner;

public class Nqueen {
	public static int [][] arr ;
	public static int cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = scn.nextInt();
			int result = 0;
			int cntall = 0;
			arr = new int[n][n];
			if(n==1) {
				cntall = 1;
			}
			else if(n==2) {
				cntall = 0;
			}
			else {
				int cnttmp = 1;
				cntall = 0;
				for(int j  = 0; j<n; j++) {
					System.out.println("시도 "+cnttmp);
					int x = 0;
					cnt = 0;
					for(int f = 0; f<n; f++) {
						int cntk = 0;
						arr[x][j]=1;
//						System.out.print("f:"+f+"//");
						System.out.print("set");
						checkN(x,f,n,cnt,cntall);
						result = result + cntall;
//						for(int k = 0; k<n; k++) {
//							for(int k1 = 0; k1<n; k1++) {
//								if(arr[k][k1]==1) {
//									cntk++;
//								}
//							}
//						}
//						if(cntk==n) {
//							cntall++;
////							System.out.print("/굿 "+f);
//						}
						arr = new int[n][n];
						System.out.println();
					}
					arr[x][j]=0;
					cnttmp++;
				}
			}
			System.out.println("최종결과"+result);
		}
	}
	
	public static void checkN(int x, int y, int n, int cnt, int cntall) {
		System.out.print("try"+x+" "+y+" "+cnt+"/");
		x = x+1;
//		System.out.print("y: "+y+"/");
		if(x>n-1) {
			return;
		}
		for(int z = 0; z<n; z++) {  // 가로 검사하기
			if(arr[x][z]==1) {
				return;
			}
		}
		for(int z = 0; z<n; z++) { // 세로 검사하기
			if(arr[z][y]==1) {
				return;
			}
		}
		
		int z = 1;
		while(x-z>-1&&y-z>-1) {
			if(arr[x-z][y-z]==1) {  // 좌측 상단 대각선
				return;
			}
			z++;
		}
		
		z = 1;
		while(x+z<n&&y-z>-1) {
			if(arr[x+z][y-z]==1) {  // 좌측 하단 대각선
				return;
			}
			z++;
		}
		
		z=1;
		while(x-z>-1&&y+z<n) {
			if(arr[x-z][y+z]==1) {  // 우측 상단 대각선
				return;
			}
			z++;
		}
		
		z=1;
		while(x+z<n&&y+z<n) {
			if(arr[x+z][y+z]==1) {  // 우측 상단 대각선
				return;
			}
			z++;
		}
		
		arr[x][y] =1;
		System.out.println("\""+x+":"+y+"\"");
		cnt++;
		if(x<n-1) {
			for(int tmp = 0; tmp<n; tmp++) {
				for(int z1 = x+1; z1<n; z1++) {
					for(int z2 = 0; z2<n; z2++) {
						arr[z1][z2] = 0;
					}
				}
				checkN(x,tmp,n, cnt, cntall);
				int cntk = 0;
				for(int k = 0; k<n; k++) {
					for(int k1 = 0; k1<n; k1++) {
						if(arr[k][k1]==1) {
							cntk++;
						}
					}
				}
//				if(cntk==n) {
//					cntall++;
//					System.out.println("cntall :" + cntall);
//				}
			}
		}
		if(cnt==n-1) {
			for(int e = 0; e<n; e++) {
				for(int c = 0; c<n; c++) {
					System.out.print(arr[e][c]);
				}
				System.out.println();
			}
		}
	}
}
