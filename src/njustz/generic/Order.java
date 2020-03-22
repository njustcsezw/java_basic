package njustz.generic;

/**
 * 自定义泛型类
 * @author njustz
 * @date 2020/3/22
 */
public class Order<T> {
    String name;
    int id;
    T orderT;

    public Order() {
    }

    public Order(String name, int age, T orderT) {
        this.name = name;
        this.id = age;
        this.orderT = orderT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }
}
