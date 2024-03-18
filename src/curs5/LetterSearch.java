package curs5;

import java.util.Scanner;

//facem un program care citeste un text de la tastatura
//si cauta in textul respectiv litera A
//daca nu o gasim, printam: litera A exista in text
//daca nu o gasim, printam: Litera A nu exista in text


public class LetterSearch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = scan.next();
		
		// radar text cu lungimea 5 (5 caractere)
		// 01234 pozitii
		// daca caracter de pe pozitia 0 este egal cu "A" daca nu
		//trec la urmatorul caracter adica pozitia 1 si verific daca este egal cu "A"
		// text == radar radar.lenght()
		
		//boolean existaA = false;
		int counter = 0;
		for (int i=0; i< text.length(); i++) {
			
			if (text.charAt(i) == 'a') {
	    //			System.out.println("Litera A exista in text");
		//   	existaA = true;
				counter ++;
				//break;
		//	} else {
			//	System.out.println("Litera A nu exista in text");
			}
			
			//System.out.println(text.charAt(i));
			
		}
		
		if (counter > 0) {
			System.out.println("Litera A exista in text de " + counter + " ori");
		}else {
			System.out.println("Litera A nu exista in text");
		}
	}

}
