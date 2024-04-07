package curs9;

public class Vehicul {

	private String brand;
	private int nivelPoluare; 
	private int vitezaMedie;
	
	//constructor care ne ajuta sa setam valori in variabilele clasei

    public Vehicul(String brand, int nivelPoluare, int vitezaMedie) {

        this.brand = brand;
        this.nivelPoluare = nivelPoluare;
        this.vitezaMedie = vitezaMedie;
	
	//metoda care intoarce o implementare generica
    //implementarea pentru fiecare obiect de tip vehicul (masina, bicicleta, etc)
    //se face in clasa copil, care extide vehicul
	public String nume() {  
		return "Nume generic";
	}
	
	//metoda care intoarce o implementare generica la fel ca mai sus
	public String motorizare() {  
		return "Motorizare generica";
	}
	
	
	//metoda care Nu returneaza nimic, dar ne ajuta sa printam detalii despre vehicul
	public void vehicul() {
		System.out.println("Nivelul de poluare pentru masina " + this.brand + " este :" + this.nivelPoluare + 
				"si viteza medie atinsa este de " + this.vitezaMedie + " km/h");
	}
}
