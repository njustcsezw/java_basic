package njustz.basiclib.Internet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 * 模拟客户端发信息
 * @author njustz
 * @date 2020/3/25
 */
public class ClientTest {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8899);
            os = socket.getOutputStream();
            os.write("hhhhh,can you see me".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(os!= null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
