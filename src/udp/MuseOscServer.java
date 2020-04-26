package udp;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import netP5.NetAddress;
import oscP5.*;

public class MuseOscServer {

	static MuseOscServer museOscServer;
	
	OscP5 museServer;
	EchoClient echoClient;
	static int recvPort = 7000;
    NetAddress myRemoteLocation;
    
    private byte[] buf;

	public void init() throws SocketException, UnknownHostException {
		museOscServer = new MuseOscServer();
		museOscServer.museServer = new OscP5(museOscServer, recvPort);
        myRemoteLocation = new NetAddress("127.0.0.1",7002);
	}
	
	void oscEvent(OscMessage msg) throws IOException {
		OscMessage myMessage = null;
   	 	float value = 0;
	if (msg.checkAddrPattern("Person0/elements/alpha_relative")==true) {  
		myMessage = new OscMessage("/alpha");
		value = (float)msg.get(1).doubleValue();
	} 
	if (msg.checkAddrPattern("Person0/elements/beta_relative")==true) {  
			myMessage = new OscMessage("/beta");
			value = (float)msg.get(1).doubleValue();
	} 

	if (msg.checkAddrPattern("Person0/elements/gamma_relative")==true) {  
			myMessage = new OscMessage("/gamma");
			value = (float)msg.get(1).doubleValue();
	} 

	if (msg.checkAddrPattern("Person0/elements/delta_relative")==true) {  
			myMessage = new OscMessage("/delta");
			value = (float)msg.get(1).doubleValue();
	} 
	if (msg.checkAddrPattern("Person0/elements/theta_relative")==true) {  
			myMessage = new OscMessage("/theta");
			value = (float)msg.get(1).doubleValue();
	} 
		if(myMessage==null) return;
		myMessage.add(value);
		museServer.send(myMessage, new NetAddress("127.0.0.1",7002)); 

		
		
		
	}

	
}