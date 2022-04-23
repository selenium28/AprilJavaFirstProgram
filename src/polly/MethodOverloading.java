package polly;

public class MethodOverloading {
	
	//MethodOverloading-->> When the method name is same with different input parameters within the same
	//class is known as MethodOverloading.
	//Duplicate methods are not allowed
	//Method inside method is not allowed in Java.
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.display();
		obj.display(10);
		obj.display(50, 100);
		obj.display(100.22);
	}

	public void display() {  // 0 input parameters
		System.out.println("0 input parameters");
	}

	public void display(int i) { // 1 input parameters
		System.out.println("1 input parameters");
		System.out.println(i);
	}
	
	public void display(int m, int n) { // 2 input parameters
		System.out.println("2 input parameters");
		System.out.println(m+n);
	}

	public void display(double d) { // 1 input parameters
		System.out.println("1 input parameters");
		System.out.println(d);
	}

}
