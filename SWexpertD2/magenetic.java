package SWexpertD2;

import java.util.ArrayList;
import java.util.Scanner;

public class magenetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i<1; i++) {
			int n = scn.nextInt();
			int [][] arr =new int [n][n];
			for(int x = 0; x<n; x++) {
				for(int y = 0; y<n; y++) {
					arr[x][y]=scn.nextInt();
				}
			}
			
			int cntall = 0;
			for(int y = 0; y<n; y++) {
				ArrayList<Integer>narr = new ArrayList<>();
				int cnt = 0;
				for(int x = 0; x<n; x++) {
					if(arr[x][y]!=0) {
						cnt++;
						narr.add(arr[x][y]);
					}	
				}
				
				if(cnt>1) {
					while(true) {
						int cnttmp1 = 0;
						if(narr.get(0)==2) {
							narr.remove(0);
							cnttmp1++;
						}
						if(narr.get(narr.size()-1)==1) {
							narr.remove(narr.size()-1);
							cnttmp1++;
						}
						if(cnttmp1==0) {
							break;
						}
					}
					
					System.out.println();
					System.out.print(n+"{");
					for(int tmp : narr) {
						System.out.print(tmp+" ");
					}
					System.out.print("}");
					
					int z = 0;
					int z1 =1;
					
					while(true) {
						if(narr.get(z)==1) {
							while(true) {
								if(narr.get(z1)==2) {
									cntall++;
									z=z1+1;
									z1=z+1;
									break;
									}
								z1++;
								if(z1>narr.size()-1) {
									break;
									}
								}
							}
						if(z>narr.size()-2) {
							break;
							}
						z++;
						}
					
					}
				}
			System.out.println("#"+(i+1)+" "+cntall);
			}
		}
	}
