package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 회의실배정 {
	//각 회의는 시작시간, 종료시간 두개의 정수로 이뤄진 정보. 이를 담기위한 구조체를 설계
	static class Meeting implements Comparable<Meeting>{
		int startTime;
		int endTime;
		Meeting(int s, int e){
			startTime = s;
			endTime = e;
		}
		@Override
		public int compareTo(Meeting o) {
			// TODO Auto-generated method stub
			if( this.endTime == o.endTime ) {
				return this.startTime - o.startTime;
			}
			return this.endTime - o.endTime;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//회의의 수 N(1 ≤ N ≤ 100,000)
		Meeting[] meetings = new Meeting[N];
		for(int i = 0; i < N; i++) {
			meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(meetings);
		int lastFinishedTime = 0;
		int meetingCnt = 0;
		for(int i = 0; i < N; i++) {
			if( lastFinishedTime <= meetings[i].startTime ) {
				meetingCnt++;
				lastFinishedTime = meetings[i].endTime;
			}
		}
		System.out.println(meetingCnt);
	}
}













