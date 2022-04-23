package encap;

public class EncapsulationClass {
	
	//Hiding the actual implementation from outside the class.
	
	private int dob;
	private String name;
	private double salary;
	
	//public getter and public setter methods.
	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		EncapsulationClass obj = new EncapsulationClass();
		obj.setSalary(50000.21);
		obj.setDob(11032022);
		obj.setName("Pooja");
		
		System.out.println("Salary of emp = " +obj.getSalary());
		System.out.println("DOB= " +obj.getDob());
		System.out.println("Name of the emp= "+obj.getName());

	}

}
