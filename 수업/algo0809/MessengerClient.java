package algo0809;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MessengerClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		DataOutputStream dos = null;
		Socket sc = new Socket("localhost",7000);
		dos = new DataOutputStream
				(new BufferedOutputStream(sc.getOutputStream()));
		DataInputStream dis =new DataInputStream
				(new BufferedInputStream(sc.getInputStream()));
		while(true) {
			
			System.out.println("보낼 메시지를 입력하시오.(한줄로)");
			dos.writeUTF(scn.next());
			dos.flush();
			
			System.out.println(dis.readUTF());
			
		}
//		osw.close();
//		sc.close();
	}

}
