package curs2;

public class  {
	
	private String nume = "Ion";
	private int varsta = 33;

	public void afiseazaDetaliiTester() {
		
		System.out.println("Numele testerului este " + nume  + " si are varsta " + varsta);
	}
	
	//constructor default = fara parametrii (se poate sa nu il scriem deoarece Java il pune default)
	//public Tester () {
		
	
	
	public Tester(String name, int age) {
		nume = name;
		varsta = age;
	}
}
