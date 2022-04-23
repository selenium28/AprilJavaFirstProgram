package polly;

public class RunClass {

	public static void main(String[] args) {
		
		//Static polymorphism--- compile time polymorphism
		CatClass objCatClass = new CatClass();
		objCatClass.eat();
		objCatClass.veg();
		objCatClass.nonVeg();
		objCatClass.sleep();
		
		System.out.println("******************");
		DogClass objDogClass = new DogClass();
		objDogClass.eat();
		objDogClass.sleep();
		objDogClass.veg();
	}

}
