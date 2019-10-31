package D3;

import java.util.LinkedList;
import java.util.Scanner;
 
public class 암호문3 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn  = new Scanner(System.in);
        for(int i = 0; i<10; i++) {
            int len = scn.nextInt();
            LinkedList<Integer>list = new LinkedList<>();
            for(int j = 0; j<len; j++) {
                list.add(scn.nextInt());
            }
            int cnum = scn.nextInt();  //  명령어의 개수
            for(int j = 0; j<cnum; j++) {
                String com = scn.next();
                if(com.equals("I")) {
                	int idx = scn.nextInt();
                    int adx = scn.nextInt();
                    for(int x = 0; x<adx; x++) {
                        list.add(idx, scn.nextInt());
                        idx++;
                    }
                }
                else if(com.equals("D")) {
                	int idx = scn.nextInt();
                    int delx = scn.nextInt();
                    for(int x = 0; x<delx; x++) {
                    	list.remove(idx);
                    }
                }
                
//                else if(com.equals("A")) {
//                	int idx = scn.nextInt();
//                    for(int x = 0; x<idx; x++) {
//                    	list.add(scn.nextInt());
//                    }
//                }                
            }
            
            
            System.out.print("#"+(i+1)+" ");
            for(int j = 0; j<10; j++) {
                System.out.print(list.poll()+" ");
            }
            System.out.println();
        }
    }
 
}
