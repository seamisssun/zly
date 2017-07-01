package Day25.test11;

/**
 * Created by Administrator on 2017/6/26.
 */
public class Cat extends Aminal {
    private String habit;

    public Cat(String habit) {
        this.habit = habit;
    }

    public Cat(int id, String name, int age, String habit) {
        super(id, name, age);
        this.habit = habit;
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit;
    }

    @Override
    public String toString() {
        return "Cat{" +"id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                "habit='" + habit + '\'' +
                '}';
    }

    @Override
    public void eat() {
        super.eat();
    }
}
