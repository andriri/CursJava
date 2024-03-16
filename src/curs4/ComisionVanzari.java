package curs4;

public class ComisionVanzari {

	public static void main(String[] args) {
		 int comision;
		 int vanzari = 3500;
		 
		 if (vanzari > 2500) {
				comision=  vanzari*5/100;
			} else {
				comision=  0;
			}
			
			
//		String print = (vanzari>2500) ? "vanzari*5/100" : "0";
//		System.out.println(print);
		System.out.println("Comisionul tau este:" + comision);
	}

}
