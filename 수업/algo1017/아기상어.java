package algo1017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 아기상어 {
	static boolean[] visited = new boolean[400];
	static int[][] map = new int[20][20];
	static ArrayList<Item> fishes = new ArrayList<Item>();
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static int N, cnt, targetX, targetY, targetSize = 2, time = 0;
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	 
	    for (int i = 0; i < N; i++) {
	        String[] c = sc.readLine().split(" ");
	        int size = c.length;
	 
	        for (int j = 0; j < size; j++) {
	            map[i][j] = Integer.parseInt(c[j]);
	            if (map[i][j] == 9) {
	                targetX = j;
	                targetY = i;
	            }
	        }
	    }
	 
	    while (true) {
	        Queue<Item> q = new LinkedList<Item>();
	        ArrayList<Item> fishes = new ArrayList<Item>();
	        visited = new boolean[400];
	 
	        q.add(new Item(targetX, targetY, 0));
	        visited[targetY * N + targetX] = true;
	 
	        int found = -1;
	        while (!q.isEmpty()) {
	            Item item = q.poll();
	            int r = item.n / N;
	            int c = item.n % N;
	            int move = item.move;
	            if (found == move) {
	                break;
	            }
	 
	            for (int k = 0; k < 4; k++) {
	                int nx = c + dx[k];
	                int ny = r + dy[k];
	                int next = ny * N + nx;
	 
	                if (0 <= nx && nx < N && 0 <= ny && ny < N) {
	                    if (visited[next]) {
	                        continue;
	                    }
	                    visited[next] = true;
	                    if (targetSize >= map[ny][nx]) {
	                        if (map[ny][nx] > 0 && targetSize > map[ny][nx]) {
	                            found = move + 1;
	                            fishes.add(new Item(nx, ny, move + 1));
	                        }
	                        q.add(new Item(nx, ny, move + 1));
	                    }
	                }
	            }
	        }
	        if (found == -1) {
	            break;
	        } else {
	            if (fishes.size() > 1) {
	                Collections.sort(fishes, new ySort());
	            }
	        }
	 
	        Item fish = fishes.get(0);
	        if (found != -1) {
	            time += found;
	            map[targetY][targetX] = 0;
	            targetX = fish.x;
	            targetY = fish.y;
	            map[targetY][targetX] = 9;
	            if (targetSize == ++cnt) {
	                targetSize++;
	                cnt = 0;
	            }
	        }
	 
	    }
	    System.out.println(time);
	}
	 
	static class ySort implements Comparator<Item> {
	    public int compare(Item i1, Item i2) {
	        if (i1.y < i2.y) {
	            return -1;
	        } else if (i1.y == i2.y) {
	            if (i1.x < i2.x) {
	                return -1;
	            } else if (i1.x == i2.x) {
	                return 0;
	            }
	            return 1;
	        } else {
	            return 1;
	        }
	    }
	}
	 
	static class Item {
	    int x;
	    int y;
	    int n;
	    int move;
	 
	    Item(int x, int y, int move) {
	        this.x = x;
	        this.y = y;
	        this.n = this.y * N + this.x;
	        this.move = move;
	    }
	}
}
