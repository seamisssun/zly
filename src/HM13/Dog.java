package HM13;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void eat(Food food){
		if(food.getKind().equals("����ͷ")){
		System.out.println(this.name+"...�ڳ�...����ͷ");
	}
		else{
		System.out.println(this.name+"...����...��");
	}
	}
}