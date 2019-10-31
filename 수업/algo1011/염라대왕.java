package algo1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class 염라대왕{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = Integer.parseInt(s);
		// 같은거 찾아내서 제거하기
		// 글자 길이순으로 배열 따로 만들기
		// 배열안에 알파벳순으로 정렬
		for(int i = 0; i<t; i++) {
			s = br.readLine();
			int n = Integer.parseInt(s);
//			ArrayList<String>tmp = new ArrayList<>();
			Set<String>tmp = new HashSet<>();
			for(int j = 0; j<n; j++) {
				String str = br.readLine();
				tmp.add(str);
			}
			ArrayList<String>arr = new ArrayList<>();
//			for(int j = 0; j<tmp.size(); j++) {
//				arr.add(tmp.iterator().next());
//			}
			arr.addAll(tmp);
			Collections.sort(arr,new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					  if (o1.length() == o2.length()) {                    
				        	 return o1.compareTo(o2);
				         }
						return o1.length()-o2.length();
				}
			});
			System.out.println("#"+(i+1)+" ");
			for(int k = 0; k<arr.size(); k++) {
					System.out.println(arr.get(k));
				}
			}
		}
}
