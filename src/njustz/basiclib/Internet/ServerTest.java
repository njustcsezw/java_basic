package njustz.basiclib.Internet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟服务器端接收信息
 * @author njustz
 * @date 2020/3/25
 */
public class ServerTest {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket socket =null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            ss = new ServerSocket(8899);
            socket = ss.accept();
            is = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1){
                baos.write(bytes, 0, len);
            }

            System.out.println(baos.toString());
            System.out.println("accept messages from: " + socket.getInetAddress());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(baos != null){
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is != null){
                try {
                    is.close();
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
            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
