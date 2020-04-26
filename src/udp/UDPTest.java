package udp;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPTest {
    EchoClient client;
 
    public void setup() throws SocketException, UnknownHostException{
//        new EchoServer().start();
//        client = new EchoClient();
        new MuseOscServer().init();
    }
 
    public void whenCanSendAndReceivePacket_thenCorrect() throws IOException, InterruptedException {
//        String echo = client.sendEcho("hello server");
//        System.out.println(echo);
//        echo = client.sendEcho("server is working");
//        System.out.println(echo);
//        while(true) {
//            long millis = System.currentTimeMillis();
//            client.sendOSCMessage("OSC /hello 123");
//            Thread.sleep(1000 - millis % 1000);
//        }
    }
 
    public void tearDown() throws IOException {
        client.sendEcho("end");
        client.close();
    }
}
