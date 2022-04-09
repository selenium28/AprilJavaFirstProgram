package basic;

public class ArrayConcepts {

	public static void main(String[] args) {
		//Array: To store similar datatypes vales in array variable
		//Array starts from zero
		//size : n-1
		
		// 1. int 
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
//		i[5] = 60;  // ArrayIndexOutOfBoundsException
		
//		System.out.println(i[0]);
//		System.out.println(i[4]);
		
		for (int j =0; j< i.length; j++) {
			System.out.println(i[j]);
		}
		
		double d[] = new double[10];
		d[0] = 10.33;
		d[1] = 33.33;
		d[2] = 44.33;
		d[3] = 55.33;
		   
		System.out.println(d[2]);
		
		Object obj[] = new Object[4];  // Object is a class ---> it is used to store diff. datatypes.
		
		obj[0] = "Vishal";
		obj[1] = 10;
		obj[2] = 33.33;
		obj[3] = true;
		
		
 	}

}
