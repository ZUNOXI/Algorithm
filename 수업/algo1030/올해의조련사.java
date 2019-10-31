package algo1030;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 올해의조련사 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
//		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
//			int n = scn.nextInt();
			ArrayList<Character>list = new ArrayList<>();
			for(int j = 0; j<n; j++) {
				String s = br.readLine();
				char c = s.charAt(0);
				list.add(c);
			}
			String result = ""; 
			while(true) {
				if(list.size()==1) {
					result = result + list.get(0);
					list.remove(0);
					break;
				}
//				System.out.println(list.size());
				if(list.get(0)==list.get(list.size()-1)) {
					int x = 1;
					while(true) {
//						System.out.println(list.size()+"/"+x);
						if(x==(list.size()/2+1)) {
							result = result + list.get(0);
//							System.out.println(result);
							list.remove(0);
							break;
						}
						if(list.get(x)<(list.get(list.size()-x-1))){
							result = result + list.get(0);
//							System.out.println(result);
							list.remove(0);
							break;
						}
						else if(list.get(x)>(list.get(list.size()-x-1))){
							result = result + list.get(list.size()-1);
							list.remove(list.size()-1);
//							System.out.println(result);
							break;
						}
						x++;
					}
				}
				else if(list.get(0)<(list.get(list.size()-1))){
					result = result + list.get(0);
//					System.out.println(result + "@");
					list.remove(0);
				}
				else if(list.get(0)>(list.get(list.size()-1))){
					result = result + list.get(list.size()-1);
//					System.out.println(result + "!!");
					list.remove(list.size()-1);
				}
			}
			bw.write("#"+(i+1)+" "+result+"\n");
			bw.flush();
//			System.out.println("#"+(i+1)+" "+result);
		}
		
		bw.close();
	}

}
/*
1
7
A
G
T
J
T
G
F
*/
