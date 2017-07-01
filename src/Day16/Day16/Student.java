package Day16.Day16;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Student /*implements Comparable<Student>*/{
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    //@Override
  /*  public int compareTo(Student o) {
        if(score-o.score<0){
            return 1;
        }else if(score-o.score>0) {
            return -1;
        }else{
            return 0;
        }


    }*/
}
