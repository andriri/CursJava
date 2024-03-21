package curs6;

import java.util.Scanner;

/* program care calculeaza salariul pe o saptamana
 * intrebam userul cate ore a lucrat
 * calculam doar daca a lucrat minim 1 ora sau maxim 40 de ore
 * daca introduce numar invalid <1h sau >40 
 * salariul il calculam cu formular
 * oreLucrate *ratePerHour
 * ratePerHour =25
 */


public class CalculSalariuSaptamanal {

	public static void main(String[] args) {
		
		int ratePerHour = 25;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introdu numarul de ore: ");
		int nrOreLucrate = scan.nextInt();
		
		while (nrOreLucrate < 1 || nrOreLucrate>40) {
			System.out.println("Numar invalid de ore. Introdu un numar intre 1 si 40: ");
			System.out.println("Introdu numarul de ore valid: ");
			nrOreLucrate = scan.nextInt();
		
		}
		
		int salariu = nrOreLucrate *ratePerHour;
		System.out.println("Salariul tau este: " + salariu);
	}

}
