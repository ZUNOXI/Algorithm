package algo0809;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MessengerClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		DataOutputStream dos = null;
		while(true) {
			Socket sc = new Socket("localhost",7000);
			dos = new DataOutputStream
					(new BufferedOutputStream(sc.getOutputStream()));
			System.out.println("보낼 메시지를 입력하시오.");
			dos.writeUTF(scn.next());
			dos.flush();
//			dos.close();
			
			DataInputStream dis =new DataInputStream
					(new BufferedInputStream(sc.getInputStream()));
			System.out.println(dis.readUTF());
//			osw.close();
			
			sc.close();
			dos.close();
			dis.close();
	}

}
