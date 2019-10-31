package algo0809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		try {
			// 소켓객체를 생성함으로써 연결요청을 보냄.
//			Socket socket = new Socket("192.168.24.235",7001);
			Socket socket = new Socket("192.168.24.134",5000);
			BufferedWriter bw = new BufferedWriter
					(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader br = new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
			//연결이 되면 서버가 주는 웰컴메시지를 출력한 후 응답을 서버에게 보내자..
//			System.out.println(br.readLine());
			
			new Thread(new ReceiverThread(br)).start();
			
			while(true) {
				String a = scn.next();
				String x = a+"\n";
				bw.write(x);
				bw.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			
		
		}
	// bufferdReader로 부터 readline해서 모니터에 출력하기를 반복반복하는 코드를
	// run함수에 작성해서 파생스레드 보고 하라 그러고.. 우리 메인스레드는 Scanner 로 부터 입력받아서
	// bw에 출력하는 작업을 맡자..
	}
