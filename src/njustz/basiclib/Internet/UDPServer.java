package njustz.basiclib.Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author njustz
 * @date 2020/3/25
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9090);
        byte[] bytes = new byte[100];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(),0 ,datagramPacket.getLength()));
        datagramSocket.close();
    }
}
