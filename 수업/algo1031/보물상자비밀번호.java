package algo1031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 보물상자비밀번호 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i<t; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			String sen = br.readLine();
			int div = N/4;
			ArrayList<String>list = new ArrayList<>();
			for(int j = 0; j<N; j=j+div) {
				list.add(sen.substring(j, j+div));
			}
			while(true) {
				String sent=""+sen.charAt(sen.length()-1);
				for(int j = 0; j<sen.length()-1; j++) { // 한바쿠 돌리기
					sent = sent+sen.charAt(j);
				}
				int cnt = 0 ; // 들어가나 검사해보자
				for(int j = 0; j<N; j=j+div) {		//돌린거 다시 나누기
					String tmpsen = sent.substring(j, j+div);
					int cnt2 = 0;
					for(int x = 0; x<list.size(); x++) {
						if(!(list.get(x).equals(tmpsen))) {
							cnt2++;
						}
					}
					if(cnt2==list.size()){  // 중복값이 없는경우 넣자
						list.add(tmpsen);
					}
					else {   // tmpsen 이 이미 있다.
						cnt++;
					}
				}
				if(cnt==4) {  // 모든 자른 문장들이 다 들어있다.
					break;
				}
				sen = sent;
			}
			ArrayList<Integer>res = new ArrayList<>();
			for(int j = 0; j<list.size(); j++) {
				int trans = Integer.parseInt(list.get(j), 16);
				res.add(trans);
			}
			Collections.sort(res);
			System.out.println("#"+(i+1)+" "+res.get(res.size()-K));
		}
	}
}
