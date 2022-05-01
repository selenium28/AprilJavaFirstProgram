package intface;

public class ShineBike implements Bike{

	@Override
	public void start() {
		System.out.println("ShineBike -- start");
		
	}

	@Override
	public void stop() {
		System.out.println("ShineBike -- stop");
		
	}

	@Override
	public void helmet() {
		System.out.println("ShineBike -- helmet");
		
	}

}
