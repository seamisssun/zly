package C8;

public class Customer {

	/**
	 * @param args
	 */
	String name;
	int age;
	String sex;

	public void shop() {
		System.out.println("买东西");

	}
	public void cash(){
		
	}

	public void show() {
		System.out.println("姓名" + name + "年龄" + age + "性别" + sex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.name = "zhangsan";
		c.age = 25;
		c.sex = "男";

	}

}
