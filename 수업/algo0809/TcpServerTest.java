package algo0809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.zip.InflaterInputStream;

public class TcpServerTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket;
		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket socket = null;
		
		try {
			// port를 지정해서 ServerSocket을 생성하고 accept 대기.
			serverSocket = new ServerSocket(7000);
			while(true) {
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress());
			// socket객체로부터 입출력 스트림을 얻어서 원하는 형태로 가공
			bw = new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
			ServerThread.bwList.add(bw);
			new Thread(new ServerThread(br)).start();
			
//			for(int i = 0; i<barr.size(); i++) {
//				Thread rc = new Thread(new ReceiveSendThread(barr.get(barr.size()-1)));
//				rc.start();
//			}
//			bw.write("hello World welcome to hell\n");
//			bw.flush();
//			System.out.println(br.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} try {
			bw.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
