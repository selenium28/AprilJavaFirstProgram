package polly;

public class CatClass extends DogClass{
	
	// Inheritance ---> It is inheriting the properties of parent class into child class is known as Inheritance
	// When same method is present in parent class as well as in child class with the same 
	// no of parameters is known as method overriding.
	
	public void sleep() {
		System.out.println("CatClass--> sleep");
	}

	public void nonVeg() {
		System.out.println("CatClass--> Non-veg");
	}

}
