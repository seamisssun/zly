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
		this.sex="��";
		this.major="Android";
		this.age=age;
		this.name=name;
	}

	public void introduce(){
		System.out.println("ѧ�������ֽУ�"+this.name);
		System.out.println("ѧ���������ǣ�"+this.age);
		System.out.println("ѧ�����Ա��ǣ�"+this.sex);
		System.out.println("ѧ����רҵ�ǣ�"+this.major);
		
	}
	
	public String toString(){
		return 
		"ѧ�������ֽУ�"+this.name+"\n"+
		"ѧ���������ǣ�"+this.age+"\n"+
		"ѧ�����Ա��ǣ�"+this.sex+"\n"+
		"ѧ����רҵ�ǣ�"+this.major;
		
	}
}
