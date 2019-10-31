package 기초100제;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Double n = scn.nextDouble();
		int n1 = (int) (n/1);
		double n2 = (n%1);
		int n3 = (int) (n2*100000);
//		System.out.println(n);
//		String year = n.split("-")[0];
//		String month = n.split("-")[1];
		System.out.println(n1);
		System.out.println(n3);
	}	

}

1.446000
1.446666