package 백준;

import java.util.LinkedList;
import java.util.Scanner;

public class 스위치켜고끄기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int len = scn.nextInt();
		int [] arr = new int[len+1];
		for(int i = 1; i<=len; i++) {
			arr[i]=scn.nextInt();
		}
		int n = scn.nextInt();
		LinkedList<Person>list = new LinkedList<>();
		for(int i = 0; i<n; i++) {
			int gen = scn.nextInt();
			int nu = scn.nextInt();
			Person p = new Person(gen, nu);
			list.add(p);
		}
		
		for(int i = 0; i<n; i++) {
			if(list.get(i).gender==1) {  // 남학생인 경우
				for(int j = 1; j<=len; j++) {
					if(j%(list.get(i).num)==0) {
						if(arr[j]==0) {
							arr[j]=1;
						}
						else {
							arr[j]=0;
						}
					}
				}
			}
			else {
				if(arr[list.get(i).num]==0) {
					arr[list.get(i).num]=1;
				}
				else{
					arr[list.get(i).num]=0;
				}
				int z = list.get(i).num;
				int x = 1;
				while(z-x>0 && z+x<len+1) {
					if(arr[z-x]==arr[z+x]) {
						if(arr[z-x]==1) {
							arr[z-x]=0;
							arr[z+x]=0;
						}
						else {
							arr[z-x]=1;
							arr[z+x]=1;
						}
					}
					else {
						break;
					}
					x++;
				}
			}
		}
		for(int i = 1; i<=len; i++) {
			System.out.print(arr[i]+" ");
			if(i%20==0) {
				System.out.println();
			}
		}
	}
	
	public static class Person{
		int gender;
		int num;
		public Person(int a, int b) {
			this.gender = a;
			this.num = b;
		}
	}

}
