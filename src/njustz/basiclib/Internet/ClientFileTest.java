package njustz.basiclib.Internet;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author njustz
 * @date 2020/3/25
 */
public class ClientFileTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8899);

        //发送文件到服务器端
        OutputStream os = socket.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream(new File("E:\\workCrazyJava\\src\\njustz\\basiclib\\IO\\photo.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1){
            os.write(bytes, 0 , len);
        }
        socket.shutdownOutput();

        //接收来自服务器端的消息
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes1 = new byte[1024];
        int len1;
        while ((len1 = inputStream.read(bytes1)) != -1){
            baos.write(bytes1, 0, len1);
        }
        System.out.println(baos.toString());

        baos.close();
        inputStream.close();
        fileInputStream.close();
        os.close();
        socket.close();
    }
}
