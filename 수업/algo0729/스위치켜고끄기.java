package algo0729;

import java.util.Scanner;

public class 스위치켜고끄기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[]arr = new int[N+1];
		for(int i = 1; i<N+1; i++) {
			arr[i]=scn.nextInt();
		}
		int snum = scn.nextInt();
		int []sarr = new int[snum];
		int []narr = new int[snum];
		for(int i = 0; i<snum; i++) {
			sarr[i]=scn.nextInt();
			narr[i]=scn.nextInt();
		}
		for(int i = 0; i<snum; i++) {
			if(sarr[i]==1) {
				for(int j = narr[i]; j<N+2; j = j+narr[i]) {
						if(arr[j]==0) {
							arr[j]=1;
						}
						else if(arr[j]==1) {
							arr[j]=0;
						}
				}
			}
			else if(sarr[i]==2) {
				int c = narr[i]; //2
				int x=1;
				int cnt = 0;
				while(true) {
					if(c==1) {
						if(arr[c]==1) {
							arr[c]=0;
							if(arr[c+1]==0) {
								arr[c+1]=1;
							}
							else if(arr[c+1]==1) {
								arr[c+1]=0;
							}
							break;
						}
						else if(arr[c]==0) {
							arr[c]=1;
							break;
						}
					}
					else if(c-x<1) {
						if(arr[c]==1) {
							arr[c]=0;
							break;
						}
						else if(arr[c]==0) {
							arr[c]=1;
							break;
						}
					}
					else if(arr[c-x]==arr[c+x] && c+x<N) {
						cnt++;
						if(arr[c-x]==0) {
							arr[c+x]=1;
							arr[c-x]=1;
						}
						else if(arr[c-x]==1) {
							arr[c+x]=0;
							arr[c-x]=0;
						}
					}
					x++;
					}
			}
		}
		int cnt1 = 0;
		for(int i = 1; i<N++; i++) {
			System.out.print(arr[i]+" ");
			cnt1++;
			if(cnt1==20) {
				System.out.println();
				cnt1=cnt1-20;
			}
		}
	}
}
