package algo0729;

import java.util.Scanner;

public class 큰놈작은놈같은놈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			if(a>b) {
				System.out.println("#"+(i+1)+" >");
			}
			else if(a<b){
				System.out.println("#"+(i+1)+" <");
			}
			else {
				System.out.println("#"+(i+1)+" =");
			}
		}
	}

}
