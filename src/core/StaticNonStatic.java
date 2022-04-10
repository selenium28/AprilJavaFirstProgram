package core;

public class StaticNonStatic {
	
	// Static method directly access from class area. No need to create the object.
	// NonStatic method: We have to create object of that particular class (class name) 

	public static void main(String[] args) {
		StaticNonStatic objStaticNonStatic = new StaticNonStatic();
		objStaticNonStatic.first();
		objStaticNonStatic.multiply();
		int j = sum(50, 100);
		System.out.println(j);
		int k = StaticNonStatic.divide(50, 5);
		System.out.println(k);

	}
	
	public void first() {
		System.out.println("First NonStatic Method ");
	}
	
	// static: keyword --> method, variable and block
	public static int sum(int m, int n) {
		int c = m+n;
		System.out.println("Sum Static method ");
		return c;
	}
	
	public void multiply() {
		int d = 10;
		int e = 5;
		int i = d*e;
		System.out.println("Multilpy NonStatic Method"+i);
	}
	
	public static int divide(int x, int y) {
		int a =x/y;
		System.out.println("Divide static method");
		return a;
	}
	
	

}
