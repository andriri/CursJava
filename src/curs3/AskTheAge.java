package curs3;

import java.util.Scanner;

public class AskTheAge {

	int age;
	
	public void askTheUserAge() {
		
		System.out.println("Please enter your age: ");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
	}
	
	public void checkAge() {
		askTheUserAge();
		if (age <18 ) {
			System.out.println("Esti minor");
		} else if (age >= 18 && age <= 65) {
			System.out.println("Esti adult");
		} else if (age > 65){
			System.out.println("Esti batran");
		} else if (age < 0 ) {
    		System.out.println("Introdu o varsta valida mai mare decat zero");
    	}
	}
}

