package curs8;
/*
 * Intrebam userul un calificativ
 * in functie de raspuns printam urmatoarele:
 * A-> Felicitari!
 * B-> Destul de bine
 * C-> Suficient!
 * D-> Insuficient!
 * Pentru orice alt calificativ printam calificativ invalid
 * Diferenta intre if-else, switch si enhanced switch
 */

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		System.out.println("Introdu un calificativ: ");
		Scanner scan = new Scanner(System.in);
		String calificativ = scan.next().toUpperCase();
		
		//if-else
		if(calificativ.equals("A") || calificativ.equals("a")) {
			System.out.println("Felicitari!");
		}else if (calificativ.equalsIgnoreCase("B")) {
			System.out.println("Destul de bine!");
		}else if (calificativ.equals("C")) {
			System.out.println("Suficient!");
		}else if (calificativ.equals("D")) {
			System.out.println("Insuficient!");
		}else {
			System.out.println("Calificativ invalid!");
		}
		
		
		System.out.println("----------------------");
		
		//switch
		switch(calificativ) {
			case "A" :
				System.out.println("Felicitari!");
				break;
			case "B" :
				System.out.println("Destul de bine!");
				break;
			case "C" :	
				System.out.println("Suficient!");
				break;
			case "D" :	
				System.out.println("Insuficient!");
				break;
			default:
				System.out.println("Calificativ invalid!");
		}
		
		System.out.println("----------------------");
		
		//enhanced switch
		//e mai nou, se scoate break
		// se executa doar ce se afla dupa sageata
		
		switch(calificativ) {
			case "A" -> System.out.println("Felicitari!");
			case "B" -> System.out.println("Destul de bine!");
			case "C" -> System.out.println("Suficient!");
			case "D" -> System.out.println("Insuficient!");
			default ->  System.out.println("Calificativ invalid!");
		}
		
	}
			
}	
		
		

