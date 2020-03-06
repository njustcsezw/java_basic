package njustz.basiclib.exception;

import javax.sound.midi.SoundbankResource;

/**
 * @author njustz
 * @date 2020/3/6
 */
public class EcmDef {

    public static void main(String[] args) {

        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            int result =  ecm(i, j);
            System.out.println(result);
        } catch (EcDef ecDef) {
            ecDef.getMessage();
        }catch (NumberFormatException e){
            System.out.println("缺少命令行参数");
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }catch (ArithmeticException e){
            e.getMessage();
        }


    }

    public static int ecm(int i, int j) throws EcDef{
        if(i<0 || j<0)
            throw new EcDef("输入的数不能小于零~");
        return i/j;
    }

}
