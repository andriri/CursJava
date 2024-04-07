package curs10;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Catalog {

	public static void main(String[] args) {
		
		Map <String, Integer> catalog = new HashMap<>(); 
		
		Scanner scanner = new Scanner(System.in);
				
		catalog.put("Andrei Luca", 9); 
		
		catalog.put("Preda Maria", 10); 
		
		catalog.put("Enache Rares", 8); 
		
		catalog.put("Florea Elena", 7); 
		
		System.out.println(map.size());
		
		System.out.println(map.isEmpty());
		
		System.out.println("Introdu numele elevului: "); 
		String nume = scan.next().toUpperCase();
		
		System.out.println("Introdu nota elevului: ");
		int nota1 = scan.nextInt();
		int nota2 = scan.nextInt();
		
		System.out.println(map); 
		
		boolean checkValue = map.containsValue("Luca"); //cauta Luca in map
		System.out.println(checkValue);
		
		if (checkValue = false) {
			System.out.println("Nu aveai nota, ti-am trecut acum! "); 
		}else if (checkValue = true) {
			System.out.println("Nu ai nevoie de alta nota "); 
		}else 
			System.out.println("Nota invalida! "); 
		
		if (checkValue = true && nota2 > nota1) {
			map.replace("Elena", "8"); //inlocuieste nota Elenei de la 7 la 8
		}
		
	
		System.out.println(map); // printam catalogul avand fiecare elev cu nota lui
		
		}
}
