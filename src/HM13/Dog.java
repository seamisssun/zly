package HM13;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void eat(Food food){
		if(food.getKind().equals("鸡骨头")){
		System.out.println(this.name+"...在吃...鸡骨头");
	}
		else{
		System.out.println(this.name+"...不吃...鱼");
	}
	}
}