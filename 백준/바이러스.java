package 백준;

import java.util.ArrayList;
import java.util.Scanner;

class Link{
	int pc;
	int link;
	public Link(int pc, int link) {
		this.pc = pc;
		this.link = link;
	}
}

public class 바이러스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int conn = scn.nextInt();
		ArrayList<Integer>arr = new ArrayList<>();
		ArrayList<Integer>narr = new ArrayList<>();
		for(int i = 0; i<conn; i++) {
			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			Link pc1 = new Link(c1, c2);
			Link pc2 = new Link(c2, c1);
			if(c1==1) {
				if(!(arr.contains(1))){
					arr.add(1);
				}
				if(!(arr.contains(c2))) {
					arr.add(c2);
				}
			}
			else {
				if(arr.contains(c1) && !(arr.contains(c2))) {
					arr.add(c2);
				}
				if(arr.contains(c2) && !(arr.contains(c1))) {
					arr.add(c1);
				}
				if(!(arr.contains(c1)) && !(arr.contains(c2))) {
					narr.add(c1);
					narr.add(c2);
				}
			}
		}
		System.out.println(arr.size()-1);
	}

}
