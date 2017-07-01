package Day20.Person;

/**
 * Created by Administrator on 2017/6/15.
 */
public class Student extends Person {
    private int id;
    private  int score;

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public Student(int age, String name, int id, int score) {
        super(age, name);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "id=" + id +
                ", score=" + score +
                '}';
    }
}
