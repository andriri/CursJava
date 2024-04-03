package curs9;

public class Vehicul {

	private String brand;
	private int nivelPoluare; 
	private int vitezaMedie;
	
	public String nume() {  
		return brand;
	}
	
	public String motorizare() {  
		return nivelPoluare;
	}
	
	public void vehicul() {
		System.out.println("Nivelul de poluare pentru masina " + brand + " este :" + nivelPoluare + 
				"si viteza medie atinsa este de " + vitezaMedie + " km/h");
	}
}
