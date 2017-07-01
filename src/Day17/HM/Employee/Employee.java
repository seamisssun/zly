package Day17.HM.Employee;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Employee {
    private int id;
    private String name;
    private String sex;
    private String birthday;
    private int workage;
    private  String education;
    private String job;
    private String address;
    private int phone;

    public Employee(String address, String birthday, String education, int id, String job, String name, int phone, String sex, int workage) {
        this.address = address;
        this.birthday = birthday;
        this.education = education;
        this.id = id;
        this.job = job;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.workage = workage;
    }

    public Employee() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWorkage() {
        return workage;
    }

    public void setWorkage(int workage) {
        this.workage = workage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", workage=" + workage +
                ", education='" + education + '\'' +
                ", job='" + job + '\'' +
                ", phone=" + phone +
                '}';
    }
}
