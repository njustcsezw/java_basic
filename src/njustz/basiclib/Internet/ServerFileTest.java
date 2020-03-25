package njustz.basiclib.Internet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author njustz
 * @date 2020/3/25
 */
public class ServerFileTest {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\workCrazyJava\\src\\njustz\\basiclib\\IO\\photoServer.jpg"));
        ss = new ServerSocket(8899);
        socket = ss.accept();
        is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1){
            fileOutputStream.write(bytes, 0, len);
        }
        fileOutputStream.close();
        is.close();
        socket.close();
        ss.close();
    }
}
