package njustz.basiclib.exception;

/**
 * @author njustz
 * @date 2020/3/6
 */
public class EcDef extends Exception {

    static final long serialVersionUID = -87516993124229948L;

    public EcDef() {
    }

    public EcDef(String message) {
        super(message);
    }
}
