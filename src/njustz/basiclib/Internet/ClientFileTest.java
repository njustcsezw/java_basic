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
        OutputStream os = socket.getOutputStream();
        FileInputStream fileInputStream = new FileInputStream(new File("E:\\workCrazyJava\\src\\njustz\\basiclib\\IO\\photo.jpg"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1){
            os.write(bytes, 0 , len);
        }

        fileInputStream.close();
        os.close();
        socket.close();
    }
}
