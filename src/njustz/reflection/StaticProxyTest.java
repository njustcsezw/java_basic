package njustz.reflection;

/**
 * 静态代理
 * @author njustz
 * @date 2020/3/27
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(new HhhClothFactory());
        proxyClothFactory.produceCloth();
    }

}

interface ClothFactory{
    void produceCloth();
}

//被代理类
class HhhClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("HhhClothFactory action...");
    }
}

//代理类
class ProxyClothFactory implements ClothFactory{

    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("Proxy ready...");
        clothFactory.produceCloth();
        System.out.println("Proxy finish...");
    }
}