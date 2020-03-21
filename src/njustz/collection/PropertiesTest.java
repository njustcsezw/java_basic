package njustz.collection;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author njustz
 * @date 2020/3/21
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\workCrazyJava\\src\\njustz\\collection\\jdbc.properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String name = properties.getProperty("name");
        System.out.println(name);
        String password = properties.getProperty("password");
        System.out.println(password);
    }
}
