package njustz.basiclib.IO;

import java.io.File;

/**
 * @author njustz
 * @date 2020/3/22
 */
public class FileTest {
    public static void main(String[] args) {
        File file1 = new File("E:\\workCrazyJava\\src\\njustz\\basiclib\\IO\\hello.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

        File file2 = new File("E:\\workCrazyJava\\src\\njustz");
        String[] strings = file2.list();
        for(String str : strings){
            System.out.println(str);
        }

        File[] files = file2.listFiles();
        for (File file : files){
            System.out.println(file);
        }
    }
}
