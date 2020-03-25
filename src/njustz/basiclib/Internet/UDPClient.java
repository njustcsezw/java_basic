package njustz.basiclib.Internet;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author njustz
 * @date 2020/3/25
 */
public class UDPClient{
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String str = "message from UDP packet";
        byte[] bytes = str.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0 , bytes.length, InetAddress.getLocalHost(), 9090);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
