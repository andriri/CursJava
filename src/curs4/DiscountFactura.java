package curs4;

//Program care aplica discount unei facturi

import java.util.Scanner;

public class DiscountFactura {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduceti valoarea facturii: ");
		double valoare = scan.nextDouble();
		
		double discount = valoare > 100 ? 0.1*valoare : 0.05*valoare;
		double valoareCuDiscount = valoare - discount;
		
		

		System.out.println("Introduceti valoarea facturii: " + valoare);
	    System.out.println("Valoarea facturii cu discount este: " + valoareCuDiscount);
	
	//scanner.close();
}
	
}