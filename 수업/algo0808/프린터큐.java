package algo0808;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 프린터큐 {
	static class Obj{
		int num;
		int priority;
		int index;
		public Obj(int n, int p, int m) {
			num = n;
			priority =p;
			index = m;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int Tc = scn.nextInt();
		for(int i = 0; i<Tc; i++) {
			int nnum = 1;
			LinkedList<Obj> queue = new LinkedList<>();
			int N = scn.nextInt();
			int M = scn.nextInt();
			int cntx = 0;
			for(int j = 0; j<N; j++) {
				if(cntx == M) {
					queue.add(new Obj(nnum++,scn.nextInt(),M));
					cntx++;
					
				}
				else {
					queue.add(new Obj(nnum++,scn.nextInt(),100));
					cntx++;
				}
			}
			int cnto = 0;
			if(queue.size()==1) {
				System.out.println("1");
			}
			else {
				while(queue.size()!=0) {
					LinkedList<Obj> tempq = (LinkedList<Obj>) queue.clone();
					Obj tempo = tempq.peek();
					int cnt = 0;
					for(int j = 0; j<queue.size(); j++) {
						Obj temp = tempq.poll();
						if(tempo.priority>=temp.priority) {
						}
						else {
							cnt++;
						}
					}
					
					if(cnt==0) {
						Obj result = queue.peek();
						cnto++;
						queue.poll();
						if(result.index == M) {
							System.out.println(cnto);
						}
						
						
					}
					else {
						queue.add(queue.poll());
					}
				}
			}
		}
	}

}
