package basic;

public class StringConcatination {

	public static void main(String[] args) {
		
		// Concatenation Operator: +
		
		int a = 100;
		int b = 200;
		
		String str = "Java";
		String xyz = "Selenium";
		
		System.out.println(a+str); // 100Java
		System.out.println(a+b+str);  // 300Java
		System.out.println(b+str+a+xyz); // 200Java100Selenium
		System.out.println(b+str+a+b);  // 200Java100200 
		System.out.println(b+str+(a+b)); // 200Java300
	}

}
