package HM13;

public class Test {
	public static void main(String []args){
		Master master=new Master();
		Dog dog=new Dog("����");
		Cat cat=new Cat("С��");
		Bone bone=new Bone("����ͷ");
		Fish fish=new Fish("��");
				
		master.FeedPetFood(dog,bone);
		System.out.println("~~~~~~~~~~~~~~~~");
		master.FeedPetFood(cat, bone);
		
	}
}
