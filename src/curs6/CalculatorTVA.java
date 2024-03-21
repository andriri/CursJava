package curs6;

/* un program care calculeaza TVA la o suma
 * TVA poate avea multiple valori
 * Vreau sa setez valoarea TVA pe obiect
 * Vreau sa afisez numarul total de calcule ale TVA pe care l-am facut
 * 
 */


public class CalculatorTVA {

		private double tvaDouble; //variabila de instanta a clasei, initialize un obiect
		private static int nrTotalDeCalcule;
		
		public CalculatorTVA(int tva) {
			this.tvaDouble = tva/100.0; //constructor impartit la 100.0 ca e double
						
		}
		public double adunaTVA(double suma) {
			nrTotalDeCalcule++;
			return suma * (1+ tvaDouble);
		}
		
		public static int getNrTotalDeCalcul() {
			return nrTotalDeCalcule;
		}
}
	

