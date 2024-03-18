package curs5;

import java.util.Scanner;

//facem un program care calculeaza impozitul global
//intrebam userul cate venituri are
//pentru fiecare venit in parte calculam impozit
//daca venitul <=50000 atunci impozit este 0.1 daca nu este 0.15
//la final printam impozitul total pe toate sursele de venit

public class CalculImpozitVenit {

	public static void main(String[] args) {
	
   Scanner scan = new Scanner(System.in);
   System.out.println("Cate surse de venit ai? ");
	int numarVenituri = scan.nextInt();
	double impozitTotal =0;
	
	for(int i=1; i <= numarVenituri; i++) {
		
		System.out.println("Introdu venitul nr " + i);
		double venit = scan.nextDouble();
		double impozit; 
		
		if (venit <= 50000) {
			impozit = venit *0.1;
		}else {
			impozit = venit *0.15;
		}
		impozitTotal = impozitTotal + impozit;
		//0= 0 +100000 --> iteratia 1
		//100 = 100 + 50 --> iteratia 2
		//impozitTotal +=impozit; --acelasi lucru cu linia 31
				
	}
	
	System.out.println("Impozitul total este : " + impozitTotal);
	}
	
		

}
