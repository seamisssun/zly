package HM13;

public class Test {
	public static void main(String []args){
		Master master=new Master();
		Dog dog=new Dog("旺财");
		Cat cat=new Cat("小花");
		Bone bone=new Bone("鸡骨头");
		Fish fish=new Fish("鱼");
				
		master.FeedPetFood(dog,bone);
		System.out.println("~~~~~~~~~~~~~~~~");
		master.FeedPetFood(cat, bone);
		
	}
}
