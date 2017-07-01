package Day25.test4;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Animal implements IEat {
    private int id;
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age
                ;
    }


    @Override
    public void eat() {

    }
}
