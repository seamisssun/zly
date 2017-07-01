package HM13;

public class Master {
	private String name;
	private Pet pet;
	private Food food;

	

	public Master() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Master(String name, Pet pet, Food food) {
		super();
		
		this.pet = pet;
		this.food = food;
	}






	public Pet getPet() {
		return pet;
	}



	public void setPet(Pet pet) {
		this.pet = pet;
	}



	public Food getFood() {
		return food;
	}



	public void setFood(Food food) {
		this.food = food;
	}



	/*
	 * public (String pet, String food) { //super(); //Pet = pet; //Food = food;
	 * }
	 */
	public void FeedPetFood(Pet pet, Food food) {
		System.out.println( "Ð¡Ã÷ÔÚÎ¹" + pet.toString() + "³Ô"
				+food.getKind());
		pet.eat(food);
	}

}
