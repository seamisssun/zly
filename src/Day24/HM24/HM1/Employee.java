package Day24.HM24.HM1;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Employee implements Serializable {
    private int number;
    protected String name;

    private double salary;

    public Employee() {
    }

    public Employee(int number, String name, double salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
