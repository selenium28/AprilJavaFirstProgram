package core;

public class ConstructorConcept {
	
	// Rules:
	//1. Constructor does not have return type.
	//2. Constructor name should be have same as class name
	//3. Constructor will call automatically when the objects are created.
	//4. Constructor should be declare in the public section, private and protected but scope within the class and package.
	//5. Constructor cannot be abstract, final and static.

	public static void main(String[] args) {
		System.out.println("Main Method");
		ConstructorConcept obj = new ConstructorConcept();

	}
	
	public ConstructorConcept() {  // Constructor
		System.out.println("Constructor");
	}

}
