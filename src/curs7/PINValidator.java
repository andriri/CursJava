package curs7;

import java.util.Scanner;

public class PINValidator {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int defaultPin  = 2244;
	int enteredPin;
	int maxAttempts = 3;
//	int attempts = 0;
	boolean isValidPin; 
	
		
	for (int attempts = 0; attempts < maxAttempts; attempts++ ); {
		System.out.println("Introdu codul PIN: ");
		int enteredPin = scan.nextInt();
	}
	
	if(enteredPin == defaultPin) {
			System.out.println("Acces granted");
			break;
			
	}else {
		System.out.println("Wrong PIN ");
//      attempts = attempts +1;
	}
		
	if(attempts < maxAttempts -1 ) {
			
		System.out.println("Mai incercati ");
	}
		
	
	if (attempts == maxAttempts -1) {
		System.out.println("Maximum attempts reached. Card blocked ");
		}
    }
	scann.close();
}


