package curs9;

public class TestVehicule {

	public static void main(String[] args) {
		
		//obiect al clasei copil unde setam valori pe constructor
        //acele valori vor ajunge in variabilele din clasa parinte
        //prin faptul ca in constructorul bicicleta avem acea referinta cu super

     Bicicleta bicicleta = new Bicicleta("Pegas", 0, 20);
     Vehicul masina = new Masina("Dacia", 5, 180);
     
     //apelul metodei de mai jos
     verificaMotorizarea(bicicleta);
     verificaMotorizarea(masina);
     
     
     //apelul metodei din clasa parinte
     bicicleta.detaliiVehicul();
     masina.detaliiVehicul();
     
     
		
     //metoda care primeste ca parametru un obiect de tip vehicul
     //si va printa valoarea din metodele suprascrise in clasele copil
     
	 public static void verificaMotorizarea(Vehicul vehicul) {
    	 System.out.println(vehicul.nume() + " : " + vehicul.motorizare());
	}

}
	
}
