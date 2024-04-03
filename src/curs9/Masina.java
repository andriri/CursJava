package curs9;

public class Masina extends Vehicul{

	//constructor
	public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
	
		@Override
	    public String nume() {
	        return "Masina " + nume();
	    }

	    @Override
	    public String motorizare() {
	        return "Motorizare: " + motorizare();
		
	}
}
