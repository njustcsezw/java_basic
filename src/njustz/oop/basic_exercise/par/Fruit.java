package njustz.oop.basic_exercise.par;

public class Fruit
{
    protected double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void info()
    {
        System.out.println("我是一个水果！重"
                + weight + "g！");
    }
}