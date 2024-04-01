package curs9;

public class OverloadExample {

	public static void main(String[] args) {
		
		System.out.println(multiply(2, 3));
		System.out.println(multiply(2, 5.5)); //Nu ne lasa pt ca 5.5 Nu e integer
		
		
		// OVERLOAD pe data type -> 4 metode cu acelas nume dar cu parametrii diferiti
		System.out.println(123); //integer
		System.out.println("123"); //string
		System.out.println('x'); //character
		System.out.println(true); //boolean
		
	}
	
	public static int  multiply(int a, int b) {
		return a*b;
	}

	public static double  multiply(double a, double b) {
		return a*b;
	}
	
	//obiect generic - daca nu stim ce tip este
	//public static <T> void printGeneric(T obj) {
	//	System.out.println(obj);
		
	//}
	
}
