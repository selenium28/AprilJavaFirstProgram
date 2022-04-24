package excep;

public class ExceptionConcept {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 0;
		
		
		
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("10 divide by zero is not possible");
//			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Exception Handling");
		
		
		
		
		

	}

}
