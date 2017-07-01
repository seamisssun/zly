package Day20.Person;

/**
 * Created by Administrator on 2017/6/15.
 */
public class Teacher extends Person {
      private String level;

    public Teacher(String level) {
        this.level = level;
    }

    public Teacher(int age, String name, String level) {
        super(age, name);
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
        return "Teacher{" +super.toString()+
                "level='" + level + '\'' +
                '}';
    }
}
