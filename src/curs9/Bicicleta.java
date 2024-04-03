package curs9;

public class Bicicleta extends Vehicul{
	
	//constructor
		public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
		
		}
		
		@Override
	    public String nume() {
	        return "Bicicleta " + nume();
	    }

	    @Override
	    public String motorizare() {
	        return "Bicicleta nu are motor";
	    }
}
