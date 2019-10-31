package algo0809;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 퍼펙트셔플 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			LinkedList<String>originalq = new LinkedList<>();
			LinkedList<String>firstq = new LinkedList<>();
			LinkedList<String>Secondq = new LinkedList<>();
			int n = scn.nextInt();
			for(int j = 0; j<n; j++) {
				originalq.add(scn.next());
			}
			int len = originalq.size();
			if(n%2==0) {
				for(int x = 0; x<n/2; x++) {
					firstq.add(originalq.poll());
				}
				for(int x = 0; x<n/2; x++) {
					Secondq.add(originalq.poll());
				}
				System.out.print("#"+(i+1)+" ");
				for(int x = 0; x<len/2; x++) {
					System.out.print(firstq.poll()+" ");
					System.out.print(Secondq.poll()+" ");
				}
			}
			else {
				for(int x = 0; x<n/2+1; x++) {
					firstq.add(originalq.poll());
				}
				for(int x = 0; x<n/2; x++) {
					Secondq.add(originalq.poll());
				}
				System.out.print("#"+(i+1)+" ");
				for(int x = 0; x<len/2; x++) {
					System.out.print(firstq.poll()+" ");
					System.out.print(Secondq.poll()+" ");
				}
				System.out.print(firstq.poll()+" ");
			}
			System.out.println();
		}
	}

}
