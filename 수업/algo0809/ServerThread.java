package algo0809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerThread implements Runnable {
	static List<BufferedWriter>bwList = new ArrayList<>();
	BufferedReader br; //자신이 읽기를 수행할 br창구
	
	public ServerThread(BufferedReader br) {
		this.br = br;		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String msg = null;
		try {
			while((msg = br.readLine())!=null) {
				for(BufferedWriter bw : bwList) {
					bw.write(msg+"\n");
					bw.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
