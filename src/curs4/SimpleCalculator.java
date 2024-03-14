package curs4;

//  Program care simuleaza un basic calculator
//  Avem operatiile de baza: + (adunare) -(scadere) *(inmultire) aditional folosim si x
// (impartire) aditional folosim si :
//	intrebam userul numarul1, operatorul matematic, numarul 2 si printam 
//	Ex: Result: 2+ 2 = 4
// 
import java.util.Scanner;

public class SimpleCalculator {

	int nr1, nr2, result;
	char operator;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		nr1= scan.nextInt();
		System.out.println("Please enter the math operator: ");
		operator = scan.next().charAt(0);
		System.out.println("Please enter second number: ");
		nr2= scan.nextInt();
		scan.close();
	}
	
	public void calculator() {
		askTheUser();
		if (operator == '+') {
			result = nr1 + nr2;
			System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
		} else if (operator == '-') {
			result = nr1 - nr2;
			System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
		} else if (operator == '*' || operator == 'x') {
			result = nr1 / nr2;
			System.out.println(nr1 + " " + operator + " " + nr2 + " = " + result);
		} else {
			System.out.println("Unknown operator");
		}
			
		
		
	}
	 
}
