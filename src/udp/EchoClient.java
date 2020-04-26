package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import netP5.NetAddress;
import oscP5.OscMessage;
import oscP5.OscP5;

public class EchoClient {
    private DatagramSocket socket;
    private InetAddress address;
 
    private byte[] buf;
    OscP5 sender;
    NetAddress myRemoteLocation;
 
    public EchoClient() throws SocketException, UnknownHostException {
        socket = new DatagramSocket();
        address = InetAddress.getByName("localhost");
        sender = new OscP5(this, 7002);
        myRemoteLocation = new NetAddress("127.0.0.1",7002);
    }
 
    public String sendEcho(String msg) throws IOException {
    	buf = msg.getBytes();
        DatagramPacket packet 
          = new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 7002);
        System.out.println("sending...");
        socket.send(packet);
        System.out.println("sent");
//        packet = new DatagramPacket(buf, buf.length);
//        socket.receive(packet);
//        String received = new String(
//          packet.getData(), 0, packet.getLength());
        return "received";
    }
    
    void sendOSCMessage(String msg) {
    	 OscMessage myMessage = new OscMessage("/test");
    	  
    	  myMessage.add(123); /* add an int to the osc message */

    	  /* send the message */
    	  sender.send(myMessage, myRemoteLocation); 
    }
 
    public void close() {
        socket.close();
    }
}
