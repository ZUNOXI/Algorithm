package algo0807;

import java.util.Scanner;

public class 날짜계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int tc = scn.nextInt();
		for(int i = 0; i<tc; i++) {
			int fm = scn.nextInt();
			int fd = scn.nextInt();
			int lm = scn.nextInt();
			int ld = scn.nextInt();
			int result = 0;
			int sum = 0;
			if(fm == lm) {
				result = ld - fd + 1 ;
			}
			else {
				while(true) {
					if(fm!=lm) {
						if(lm-1 == 1 || lm-1 == 3 || lm-1 == 5 || lm-1 == 7 ||
								lm-1 == 8 || lm-1 == 10 || lm-1 == 12) {
							sum+=31;
							lm--;
						}
						else if(lm-1 == 4 || lm-1 == 6 || lm-1 == 9 || lm-1 == 11) {
							sum+=30;
							lm--;
						}
						else {
							sum+=28;
							lm--;
						}
					}
					else {
						sum = sum + ld - fd + 1;
						result = sum;
						break;
					}
				}
			}
			System.out.println("#"+(i+1)+" "+result);
		}
	}

}
