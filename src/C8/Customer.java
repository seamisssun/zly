package C8;

public class Customer {

	/**
	 * @param args
	 */
	String name;
	int age;
	String sex;

	public void shop() {
		System.out.println("����");

	}
	public void cash(){
		
	}

	public void show() {
		System.out.println("����" + name + "����" + age + "�Ա�" + sex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.name = "zhangsan";
		c.age = 25;
		c.sex = "��";

	}

}
