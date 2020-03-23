package njustz.basiclib.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流FileReader和FileWriter
 * @author njustz
 * @date 2020/3/23
 */

public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException {

        //实例化File类对象，指明要操作的文件
        File file1 = new File("E:\\workCrazyJava\\src\\njustz\\basiclib\\IO\\hello.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }

        //提供具体的流
        FileReader fileReader = new FileReader(file1);

        //读入数据
        int data = fileReader.read();
        while (data != -1){
            System.out.print((char)data + " ");
            data = fileReader.read();
        }

        //流的关闭
        fileReader.close();

    }
}
