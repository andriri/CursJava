package curs8;

public class TestMostenire {

	public static void main(String[] args) {
	
		//Angajat --> Tester --> TesterAutomat
		//2 var   --> 2 var  --> 1 var
		//cu mostenire avem:
		//2 var   --> 4 var --> 5 var
		
		
		TesterAutomat tester = new TesterAutomat();
		
		tester.setProgramingLanguage("Java"); //din clasa TesteAutomat()
		tester.setSeniority("Senior"); //din clasa Tester()
		tester.setDepartament("QA"); //din clasa Tester()
		tester.setEmail("ion@ion.com"); //din clasa Angajat()
		tester.setNume("Ion"); //clasa Angajat()
		tester.setAngajatId(124); //clasa Angajat()

	}

}
