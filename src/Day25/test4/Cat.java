package Day25.test4;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Cat extends Animal {
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
        return super.toString()+
                ",habit='" + habit  ;
    }



    @Override
    public void eat() {
        System.out.println("吃鱼 ");
    }


}
