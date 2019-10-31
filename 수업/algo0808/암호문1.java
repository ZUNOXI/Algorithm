package algo0808;

import java.util.LinkedList;
import java.util.Scanner;

public class 암호문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			int len = scn.nextInt();
			LinkedList<Integer>list = new LinkedList<>();
			for(int j = 0; j<len; j++) {
				list.add(scn.nextInt());
			}
			int com = scn.nextInt();  //  명령어의 개수
			for(int j = 0; j<com; j++) {
				String input = scn.next();  
				int idx = scn.nextInt();
				int adx = scn.nextInt();
				for(int x = 0; x<adx; x++) {
					list.add(idx, scn.nextInt());
					idx++;
				}
			}
			System.out.print("#"+(i+1)+" ");
			for(int j = 0; j<10; j++) {
				System.out.print(list.poll()+" ");
			}
			System.out.println();
		}
	}

}
