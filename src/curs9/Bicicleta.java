package curs9;

public class Bicicleta extends Vehicul{
	
		public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
		
		//constructor care ne ajuta sa setam valori specifice pentru obiectul creat de tip bicicleta
		public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {

		    //referinta catre constructorul clasei parinte care seteaza valorile primite
		    //in cele 3 variabile de la nivelul clase
		    //pentru ca Bicicleta nu are variabilele, le folosim pe cele
		    //din clasa parinte

		super(brand, nivelPoluare, vitezaMedie);

		    }
			
		}
		
		//suprascrierea metodei din clasa parinte care avea implementare generica, astfel
	    //ca in clasa copil ii dam implementare specifica
		
		@Override
	    public String nume() {
	        return "Bicicleta " + nume();
	    }

		
		//suprascrierea metodei din clasa parinte care avea implementare generica, astfel
	    //ca in clasa copil ii dam implementare specifica
	    @Override
	    public String motorizare() {
	        return "Bicicleta nu are motor";
	    }
}
