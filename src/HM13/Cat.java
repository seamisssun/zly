package HM13;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void eat(Food food){
		if(food.getKind().equals("����ͷ")){
		System.out.println(this.name+"...����...����ͷ");
	}
		else{
		System.out.println(this.name+"...�� ��...��");
	}
}
}