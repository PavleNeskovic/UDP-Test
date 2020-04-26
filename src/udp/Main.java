package udp;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {
	
	
	public static void main(String args[]) throws InterruptedException {
		UDPTest test = new UDPTest();
		try {
			test.setup();
//			new Presentation();
			test.whenCanSendAndReceivePacket_thenCorrect();
//			test.tearDown();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
