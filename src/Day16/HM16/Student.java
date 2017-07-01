package Day16.HM16;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Student{
    private int id;
    private String name;
    private String sex;
    private int age;

    public Student(int age, int id, String name, String sex) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    public void setName(String mane) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Studentmanger{" +
                "age=" + age +
                ", id=" + id +
                ", name=" + name +
                ", sex='" + sex + '\'' +
                '}';
    }
    public int compareTo(Student o){
        return Integer.valueOf(this.age).compareTo(o.age);
    }

}
