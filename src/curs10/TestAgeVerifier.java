package curs10;

public class TestAgeVerifier {

	public static void main(String[] args) {
	
		AgeVerifier obj = new AgeVerifier(); //hoover pe AgeVerifier si ne da sugestii: am ales a 2 a cu try-catch
		
		try {
			obj.checkAgeLimit(6);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
