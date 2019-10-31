package algo0729;

import java.util.Scanner;

public class 연월일달력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T  = scn.nextInt();
		int result = -1;
		for(int i = 0; i<T; i++) {
			String s = scn.next();
			String year = s.substring(0, 4);
//			System.out.println(year);
			String month = s.substring(4, 6);
//			System.out.println(month);
			String day = s.substring(6,8);
//			System.out.println(day);
			if(month.equals("01")||month.equals("03")||month.equals("05")||month.equals("07")
					||month.equals("08")||month.equals("10")||month.equals("12")) {
				if(Integer.parseInt(day)>31) {
					System.out.println("#"+(i+1)+" "+result);
				}
				else {
					System.out.println("#"+(i+1)+" "+year+"/"+month+"/"+day);	
				}
			}
			else if(month.equals("04")||month.equals("06")||month.equals("09")||month.equals("11")) {
				if(Integer.parseInt(day)>30) {
					System.out.println("#"+(i+1)+" "+result);
				}
				else {
					System.out.println("#"+(i+1)+" "+year+"/"+month+"/"+day);	
				}
			}
			else if(month.equals("02")) {
				if(Integer.parseInt(day)>28) {
					System.out.println("#"+(i+1)+" "+result);
				}
				else {
					System.out.println("#"+(i+1)+" "+year+"/"+month+"/"+day);	
				}
			}
			else {
				System.out.println("#"+(i+1)+" "+result);
			}
			
		}
		}
	}