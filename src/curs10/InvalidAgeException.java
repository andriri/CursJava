package curs10;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String mesaj) { //am creat propria exceptie care face parte din clasa mare Exception
		super(mesaj);
	}
	
}
