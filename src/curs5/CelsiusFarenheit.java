package curs5;

import java.util.Scanner;

public class CelsiusFarenheit {

	public static void main(String[] args) {
		
				
			Scanner scan = new Scanner(System.in);
			System.out.println("Cate temperaturi doriti sa convertiti?" );
			int number = scan.nextInt();
						
			for(int i=1; i <= number; i++) {
				
				
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Introduceti temperatura in grade Celsius " + i + ":" );
				double temp = scan2.nextDouble();
				
				double fTemp = temp * 9/5 + 32;
				
				System.out.println("Temperatura Celsius de " + temp + " grade este in Farenheit " + fTemp + " grade ");
				
			}
	}

}
