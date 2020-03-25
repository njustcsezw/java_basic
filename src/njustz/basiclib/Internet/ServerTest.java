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

            //1.创建服务器端的ServerSocket,指明自己的端口号
            ss = new ServerSocket(8899);

            //2.调用accept表示接收来自于客户端的socket
            socket = ss.accept();

            //3.获取输入流
            is = socket.getInputStream();

            //4.读入输出流中的数据
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

            //5.关闭流
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
