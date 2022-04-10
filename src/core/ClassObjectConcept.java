package core;

public class ClassObjectConcept {
	
	// Class: Class is a template for creating objects in program.
	// Object: Object is an instance of a class

	public static void main(String[] args) {
		System.out.println("Main MEthod");
		ClassObjectConcept objClassObjectConcept = new ClassObjectConcept();
//		objClassObjectConcept.sum();
		display();
	}
	
	public void sum() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		
	}
	
	public static void display() {
		int a = 50;
		int b = 20;
		System.out.println("50-20: " +(a-b));
		
	}

}
