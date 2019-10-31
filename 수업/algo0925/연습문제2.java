package algo0925;

public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[][] = new int[10][10];
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                    arr[i][4]=5;
	                    arr[i][5]=5;
	                    arr[i][6]=5;
	                if(i==9 || i==8)
	                    arr[i][j]=5;
	            }
	        }
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length; j++) {
	                System.out.print(arr[i][j]);
	            }
	            System.out.println();
	        }
	}
}
