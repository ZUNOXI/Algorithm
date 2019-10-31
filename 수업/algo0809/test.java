package algo0809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            //소켓객체를 생성 하므로
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Socket socket = new Socket("192.168.24.134",5000);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            new Thread(new ReceiverThread(br)).start();
            
            while(true) {
                bw.write(reader.readLine()+"\n");
                bw.flush();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}