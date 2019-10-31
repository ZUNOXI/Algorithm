package SWexpertD3;

import java.util.Scanner;

public class 상호의배틀필드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i = 0; i<t; i++) {
			int h = scn.nextInt();
			int w = scn.nextInt();
			String [][] arr = new String[h][w];
			int fx = 0,fy = 0;
			for(int x = 0; x<h; x++) {
				String s = scn.next();
				for(int y = 0; y<w; y++) {
					String c = s.substring(y,y+1);
					arr[x][y] = c;
					if(c.equals("<")||c.equals(">")||c.equals("^")||c.equals("v")) {
						fx = x; fy = y;
					}
				}
			}
			int len = scn.nextInt();
			String com = scn.next();
			for(int j = 0; j<com.length(); j++) {
				String coma = com.substring(j, j+1);
				if(coma.equals("S")) {
					if(arr[fx][fy].equals("<")) {
						for(int z = fy; z>=0; z--) {
							if(arr[fx][z].equals("*")) {
								arr[fx][z] = ".";
								break;
							}
							else if(arr[fx][z].equals("#")) {
								break;
							}
						}
					}
					else if(arr[fx][fy].equals(">")) {
						for(int z = fy; z<=w-1; z++) {
							if(arr[fx][z].equals("*")) {
								arr[fx][z] = ".";
								break;
							}
							else if(arr[fx][z].equals("#")) {
								break;
							}
						}
					}
					else if(arr[fx][fy].equals("^")) {
						for(int z = fx; z>=0; z--) {
							if(arr[z][fy].equals("*")) {
								arr[z][fy] = ".";
								break;
							}
							else if(arr[z][fy].equals("#")) {
								break;
							}
						}
					}
					else if(arr[fx][fy].equals("v")) {
						for(int z = fx; z<=h-1; z++) {
							if(arr[z][fy].equals("*")) {
								arr[z][fy] = ".";
								break;
							}
							else if(arr[z][fy].equals("#")) {
								break;
							}
						}
					}
				}
				else if(coma.equals("U")) {
					arr[fx][fy] = "^";
					for(int z = fx-1; z>=0; z--) {
						if(arr[z][fy].equals(".")) {
							arr[z][fy] = "^";
							arr[z+1][fy] = ".";
							fx = z;
							break;
						}
						else {
							fx = z+1;
							break;
						}
					}
				}
				else if(coma.equals("D")) {
					arr[fx][fy] = "v";
					for(int z = fx+1; z<=h-1; z++) {
						if(arr[z][fy].equals(".")) {
							arr[z][fy] = "v";
							arr[z-1][fy] = ".";
							fx = z;
							break;
						}
						else {
							fx = z-1;
							break;
						}
					}
				}
				else if(coma.equals("L")) {
					arr[fx][fy] = "<";
					for(int z = fy-1; z>=0; z--) {
						if(arr[fx][z].equals(".")) {
							arr[fx][z] = "<";
							arr[fx][z+1] = ".";
							fy = z;
							break;
						}
						else {
							fy = z+1;
							break;
						}
					}
				}
				else if(coma.equals("R")) {
					arr[fx][fy] = ">";
					for(int z = fy+1; z<=w-1; z++) {
						if(arr[fx][z].equals(".")) {
							arr[fx][z] = ">";
							arr[fx][z-1] = ".";
							fy = z;
							break;
						}
						else {
							fy = z-1;
							break;
						}
					}
				}
			}
			System.out.print("#"+(i+1)+" ");
			for(int x = 0; x<h; x++) {
				for(int y = 0; y<w; y++) {
					System.out.print(arr[x][y]);
				}
				System.out.println();
			}
		}
	}

}
