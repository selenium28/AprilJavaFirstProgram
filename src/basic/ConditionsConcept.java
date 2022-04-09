package basic;

public class ConditionsConcept {
	
	// Return type of If Else: boolean -->true or false.
	// Diff between = and == ?
	// Main method --> starting point
	public static void main(String[] args) {

		int a = 10;
		int b = 100;

		if(a>b) {
			System.out.println("Test Passed and A is greather than B");
		} else {
			System.out.println("Test Failed");
		}

		// = means assign operator
		int m = 20;
		int n = 50;
		
		// == means Content comparison  
		if(m==n) {
			System.out.println("m & n both are equals");
		}else {
			System.out.println("m & n both are not equals");
		}

	}

}
