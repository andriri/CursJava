package curs3;

import java.util.Scanner;

/*
 * Program care verifica daca un numar este par sau impar
 * Daca numarul este par, atunci printeaza "Numar is even!"
 * Daca numarul este impar, atunci printeaza "Number is odd!"
 * Numarul il citim de la tastatura
 */

public class CheckOddOrEven {

	int numar; //default are valoarea zero
	
	public void askTheUserForANumber() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
	}
	
    public void checkNumberIsOddOrEven() {
	
    	if( numar % 2 == 0 ) {
    		System.out.println("Number is even!");
    		
    	} else {
    		System.out.println("Number is odd!");
    	}
	
}
}
