package excep;

public class Adv_ExceptionHandling {

	public static void main(String[] args) {
		
		// Exception is an event that interrupts the execution of program and distrubs the normal flow of the program execution.
		// we can handle this exception bu using try/catch block
		
		// Single try and multiple catch blocked is allowed
		// Multiple try and Single catch blocked is not allowed 
		// Multiple try and Multiple catch blocked is not allowed 
		// Try inside try block is allowed is called nested try catch block
		// Try without catch block is allowed but with Finally block
		// Finally is will execute if try block pass or fail.
		
		try {
			int a[] = new int[5];
			a[5] = 10/5;
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: ");
		} catch (Exception e) {
			System.out.println("Normal Flow");
		}
		
		System.out.println("Rest of code");

		int m= 10;
		int n = 0;
		
		System.out.println(m/n);
		try {
			
			System.out.println("Try with Finally");
		} finally {
			System.out.println("Finally Block");
			System.out.println();
		}
	}

}
