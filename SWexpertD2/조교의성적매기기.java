package SWexpertD2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
	int mid;
	int fin;
	int mission;
	int ind;
	String grade;
	double score;
	Student(int mid, int fin, int mission, int Ind){
		this.mid = mid;
		this.fin = fin;
		this.mission = mission;
		this.ind = Ind;
		this.score = (mid*0.35) + (fin*0.45) + (mission*0.2) ; 
	}
	@Override
	public int compareTo(Student o) {
		if (this.score < o.score) {

			return 1;

		} else if (this.score == o.score) {

			return 0;

		} else {

			return -1;

		}
	}
	
}
public class 조교의성적매기기 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn  = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i = 0; i<T; i++) {
			int N = scn.nextInt();
			int index = scn.nextInt();
//			Student [] sarr = new Student[N]; 
			ArrayList<Student> scoarr = new ArrayList<>();
			for(int j = 0; j<N; j++) {
				Student s = new Student(scn.nextInt(), scn.nextInt(), scn.nextInt(),j+1);
				scoarr.add(s);
			}
		    Collections.sort(scoarr);
//		    String [] grade = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
		    String [] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		    int j = 0;
		    int z = 0;
		    while(j<N) {
		    	for(int x = 0; x<(N/10); x++) {
		    		scoarr.get(j).grade = grade[z];
		    		j++;
		    	}
		    	z++;
		    }
		    for(int x = 0; x<N; x++) {
		    	if(scoarr.get(x).ind == index) {
		    		System.out.println("#"+(i+1)+" "+scoarr.get(x).grade);
		    	}
		    }
		    int cnt = 0;
		    for(int x = 0; x<N; x++) {
		    	System.out.print(scoarr.get(x).grade+" "+scoarr.get(x).ind
		    			+" "+scoarr.get(x).score+"/");
		    	cnt++;
		    	if(cnt%9 == 0) {
		    		System.out.println();
		    	}
		    }
		}
	}

}
