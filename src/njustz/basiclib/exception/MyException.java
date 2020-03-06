package njustz.basiclib.exception;

/**
 * @author njustz
 * @date 2020/3/6
 */
public class MyException extends Exception {

    static final long serialVersionUID = -3387516993124229948L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
