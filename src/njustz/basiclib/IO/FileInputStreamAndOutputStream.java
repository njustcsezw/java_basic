package njustz.basiclib.IO;

import java.io.*;

/**
 * @author njustz
 * @date 2020/3/23
 */
public class FileInputStreamAndOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\workCrazyJava\\src\\njustz\\basiclib\\IO\\photo.jpg");
        File file1 = new File("E:\\workCrazyJava\\src\\njustz\\basiclib\\IO\\photo1.jpg");

        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);

        byte[] buffer = new byte[5];
        int len;
        while ( (len = fileInputStream.read(buffer))!= -1){
            fileOutputStream.write(buffer, 0, len);
        }

        fileInputStream.close();
        fileOutputStream.close();

    }
}
