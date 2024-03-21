package curs6;

import java.util.Scanner;

/*simulam o retragere de la un bancomat
 * avem un sold initial = 1500
 * intreb userul cat vrea sa retraga si verific daca suma nu este mai mare soldul
 * daca suma este mai mare, ii printez fonduri insuficiente si il rog sa incerce din nou
 * la final printez: Retragere cu succes! si noul sold 
 * 
 */

public class RetragereAtm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sold = 1500;
		
		System.out.println("Ce suma vrei sa retragi?: ");
		int suma = scan.nextInt();
		
		while(suma>sold || suma <=0) {
			System.out.println("Fonduri insuficiente: ");
			System.out.println("Ce suma vrei sa retragi?: ");
			suma = scan.nextInt();
		}
		
		sold = sold -suma;
		System.out.println("Retragere cu succes! Noul sold este: " + sold);
	}

}
