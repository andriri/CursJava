package curs2;

public class ExempluVariabile {
	// variabila de instanta poate fi folosita doar pe obiectul clasei
	int varsta;
	String prenume;
	
	public static void main(String[] args) {
		// declarare si initializare
		String nume = "Bob";
		//declarare variabila (variabila age are valoarea default pentru data type init)
        int age;
        
        ExempluVariabile obiect = new ExempluVariabile();
        
        System.out.println(nume);
        System.out.println(obiect.varsta);
        System.out.println(obiect.prenume);
		//System.out.println(obiect.prenume.length());
		
	}

}
