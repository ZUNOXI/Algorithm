package algo0807;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 사람이 와서 줄슨다. 처음에는 1
// 줄에서 가장 앞에 놈의 갯수만큼 마이츄를 먹는다.
// 먹었으면 갯수를 하나 더 늘려서 뒤에 줄슨다.
// 새로운 사람이 와서 줄슨다.

// 각줄에는 고놈이 몇번사람이고, 몇개인지 에 대한 상태 정보가 필요!
public class 마이쮸시뮬레이션 {
	static class Person{
		int num;
		int cnt;
		int sum;
		Person(int n, int c){
			num=n; 
			cnt=c;
			}
		public String toString() {
			return num+"번 먹은 갯수 : " + sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int nextNu = 1;
		Queue<Person> queue = new LinkedList<>();
		
		int mychuCnt = scn.nextInt();
		Person p = null;
		while(true) {
			queue.add(new Person(nextNu++, 1));
			p = queue.poll();
			p.sum += (p.cnt > mychuCnt ? mychuCnt : p.cnt);
			mychuCnt -= p.cnt;
			p.cnt++;
			queue.add(p);
			if(mychuCnt <=0 ) {
				break;
			}
			
		}
		System.out.println(p.num);
		for(Person pp : queue) {
			System.out.println(pp);
		}
	}
}
		
		
//		Queue<Integer> queue = new LinkedList<>();
//		ArrayList<Integer> parr = new ArrayList<>();
//		ArrayList<Integer> carr = new ArrayList<>();
//		int n = scn.nextInt();
//		int num = 0;
//		int cnt = 1;
//		
//		for(int i = 1; i<n+1; i++) {
//			queue.add(1);
//		}
//		int c = 0;
//		int result = 0;
//		parr.add(num);
//		carr.add(cnt);
//		while(true) {
//			if(queue.size()==0) {
//				break;
//			}
//			for(int i = 0; i<carr.get(num); i++) {
//				queue.poll();
//				
//			}
//			
//		}
//			for(int j = 0; j<parr.size(); j++) {
//				for(int i = 0; i<carr.get(j); i++) {
//					queue.poll();
//					if(queue.size()==0) {
//						c = 1;
//						result = parr.get(j);
//						break;
//					}
//				}
//				if(c==1) {
//					break;
//				}
//				carr.set(j, carr.get(j)+1);
//			}
//			if(c==1) {
//				break;
//			}
//			num++;
//			parr.add(num);
//			carr.add(cnt);
//				
//		}
//		System.out.println(result);

