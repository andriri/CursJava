package curs6;

import java.util.Scanner;

public class SumaCifreNumar {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Inntrodu numarul : ");
		
		int numar =  scan.nextInt();
		int suma =0;
		
		while(numar != 0) {
			int cifra = numar % 10;
			suma = suma+cifra;
			numar = numar/10;
		}
			
		System.out.println("Suma numerelor este : " + suma);
			
		scan.close();
	}
	
}