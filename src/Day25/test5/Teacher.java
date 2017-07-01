package Day25.test5;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Teacher extends Person{
    private String level;

    public Teacher(String level) {
        this.level = level;
    }

    public Teacher(String name, int age, String level) {
        super(name, age);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                '}';
    }
}
