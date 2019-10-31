package D3;

import java.util.Scanner;

public class 배틀필드2 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int x = 0; // 처음시작위치 x좌표
            int y = 0; // 처음시작위치 y좌표
            char[][] arr = new char[H][W];
            for (int i = 0; i < H; i++) {
                String tmp = sc.next();
                for (int j = 0; j < W; j++) {
                    arr[i][j] = tmp.charAt(j);
                    if (tmp.charAt(j) == '<' || tmp.charAt(j) == '>' 
                            || tmp.charAt(j) == 'v' || tmp.charAt(j) == '^') {
                        x = i;
                        y = j;
                    }
                }
            }
            int N = sc.nextInt();
            String str = sc.next(); //명령어
            int i = 0;
            while (i != str.length()) {
                if(str.charAt(i)=='U') {
                    arr[x][y]='^';
                    if(x-1>=0 && arr[x-1][y]=='.') {
                        arr[x][y]='.';
                        arr[x-1][y]='^';
                        x--;
                    }
                    
                }else if(str.charAt(i)=='D') {
                    arr[x][y]='v';
                    if(x+1<=(H-1) && arr[x+1][y]=='.') {
                        arr[x][y]='.';
                        arr[x+1][y]='v';
                        x++;
                    }
                    
                }else if(str.charAt(i)=='L') {
                    arr[x][y]='<';
                    if(y-1>=0 && arr[x][y-1]=='.') {
                        arr[x][y]='.';
                        arr[x][y-1]='<';
                        y--;
                    }
                }else if(str.charAt(i)=='R') {
                    arr[x][y]='>';
                    if(y+1<=(W-1) && arr[x][y+1]=='.') {
                        arr[x][y]='.';
                        arr[x][y+1]='>';
                        y++;
                    }
                    
                }else if(str.charAt(i)=='S') {
                    if(arr[x][y]=='>') {
                        for (int j = y; j < W; j++) {
                            if(arr[x][j]=='*') {
                                arr[x][j]='.';
                                break;
                            }else if(arr[x][j]=='#') {
                                break;
                            }
                        }
                        
                    }else if(arr[x][y] =='<') {
                        for (int j = y; j >= 0 ; j--) {
                            if(arr[x][j]=='*') {
                                arr[x][j]='.';
                                break;
                            }else if(arr[x][j]=='#') {
                                break;
                            }
                        }
                        
                        
                    }else if(arr[x][y] =='v') {
                        for (int j = x; j < H; j++) {
                            if(arr[j][y]=='*') {
                                arr[j][y]='.';
                                break;
                            }else if(arr[j][y]=='#') {
                                break;
                            }
                        }
                        
                        
                    }else if(arr[x][y] =='^') {
                        for (int j = x; j >= 0; j--) {
                            if(arr[j][y]=='*') {
                                arr[j][y]='.';
                                break;
                            }else if(arr[j][y]=='#') {
                                break;
                            }
                        }
                        
                        
                    }
                    
                }
                i++;
                
            }
            System.out.print("#"+ t + " " );
            for (int j = 0; j < H; j++) {
                for (int j2 = 0; j2 < W; j2++) {
                    System.out.print(arr[j][j2]);
                }
                System.out.println();
            }
        }
    }
}
