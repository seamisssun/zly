package Day11;

public class Student {
	String name;
	int age;
	String sex;
	String major;
	public Student(String name,int age,String sex,String major){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.major=major;
	}
	public Student(){
		
	}
	public Student(String name,int age){
		this.sex="男";
		this.major="Android";
		this.age=age;
		this.name=name;
	}

	public void introduce(){
		System.out.println("学生的名字叫："+this.name);
		System.out.println("学生的年龄是："+this.age);
		System.out.println("学生的性别是："+this.sex);
		System.out.println("学生的专业是："+this.major);
		
	}
	
	public String toString(){
		return 
		"学生的名字叫："+this.name+"\n"+
		"学生的年龄是："+this.age+"\n"+
		"学生的性别是："+this.sex+"\n"+
		"学生的专业是："+this.major;
		
	}
}
