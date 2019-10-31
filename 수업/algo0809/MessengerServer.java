package algo0809;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MessengerServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(7000);
		Socket sc ;
		sc = ss.accept();
		DataInputStream dis =new DataInputStream
				(new BufferedInputStream(sc.getInputStream()));
		DataOutputStream dos = new DataOutputStream
				(new BufferedOutputStream(sc.getOutputStream()));
		while(true) {
			
			System.out.println("서버는 대기중입니다...");
			String a = dis.readUTF();
			System.out.println(a);
			System.out.println("보낼메시지를 한줄로 입력하시오");
			dos.writeUTF(scn.next());
			dos.flush();
			
		}
//		sc.close();
		
	}

}
