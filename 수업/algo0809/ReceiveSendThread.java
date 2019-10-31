package algo0809;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class ReceiveSendThread implements Runnable{
	private BufferedReader br;
	private BufferedWriter bw;
	public ReceiveSendThread(BufferedReader br) {
		this.br =br;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub		
		try {
			String msg = null;
			while((msg = br.readLine())!=null) {
				bw.write(msg+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
