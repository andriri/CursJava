package curs7;

import java.util.Scanner;

/* un program care valideaza o parola pe baza unor reguli
 * Regulile sunt:
 * 1. parola trebuie sa fie minim 10 caractere
 * 2. parola trebuie sa contina cel putin un upper case
 * 3. parola nu trebuie sa fie la fel ca username
 * 
 * La rulare:
 * -informam care sunt regulile parolei
 * -intrebam utilizatorul un username si o parola
 *  * 
 * Daca parola este valida atunci printam "Parola valida"
 * Daca nu, il informam care dintre reguli nu au fost respectate
 * si il tinem in loop pana cand parola este valida
 * 
 * 1.o metoda care printeaza regulile parolei
 * 2.o metoda pentru user
 * 3.o metoda care cere parola
 * 4.o metoda pentru validarea parolei
 */

public class PasswordValidator {
	
	Scanner scan = new Scanner(System.in);
	String username;
	String parola;
	boolean isValid; //o variabila booleana e False by default
	
	public void printPasswordRules() {
		
		System.out.println("Regulile parolei sunt: ");
		System.out.println("1. parola trebuie sa fie minim 10 caractere ");
		System.out.println("2. parola trebuie sa contina cel putin un upper case");
		System.out.println("3. parola nu trebuie sa fie la fel ca username");
	}
	
	public void getUsername() {
		System.out.println("Introdu un username: ");
		username = scan.next();
	}

	public void getPassword() {
		System.out.println("Introdu o parola: ");
		parola = scan.next();
	}
	
	public void checkPasswordRules() {
		isValid = true;
		
		if(parola.length() < 10) {
			System.out.println("1. parola trebuie sa fie minim 10 caractere ");
			isValid = false;
		}
		 
		//Masina123-> il transform in lowwercase si il compar cu valoarea initiala
		// valoare initial = Masina123
		// valoarea transformata = masina123
		// valoareInitiala.equals(valoareTransformata)
		if(parola.equals(parola.toLowerCase())) {	
			System.out.println("2. parola trebuie sa contina cel putin un upper case");
			isValid = false;
		}
		
		if(parola.equals(username)) {
			System.out.println("3. parola nu trebuie sa fie la fel ca username");
			//parola.contains("123");
			isValid = false;
		}
	}
	
	public void validatePassword() {
		
		do {
			getPassword();
			checkPasswordRules();
			
		}while(!isValid); //isValid == false
		System.out.println("Parola valida ");
	}
	
}
