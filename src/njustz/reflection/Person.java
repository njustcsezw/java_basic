package njustz.reflection;


/**
 * @author njustz
 * @date 2020/3/26
 */
public class Person {
    private int age;
    private String name;
    private int id;

    public Person() {
    }

    public Person(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        System.out.println("Person.toString has been used");
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
