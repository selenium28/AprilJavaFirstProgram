package intface;

public class ExecuteClass {

	public static void main(String[] args) {
		ShineBike shineObj = new ShineBike();
		shineObj.start();
		shineObj.stop();
		shineObj.helmet();
		
//		 Bike objBike = new Bike();  //  We can't create object of interface.
		
		Bike objBike = new ShineBike();  // Dynamic Polymorphism -- casting 
		objBike.start();
		objBike.stop();
		objBike.helmet();
		
//		WebDriver driver = new ChromeDriver();

	}

}
