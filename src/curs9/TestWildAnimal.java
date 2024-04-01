package curs9;

/*
 * Method override - suprascrierea metodei
 * -implica relatia de mostenire pt ca suprascrierea 
 * se face in clasa copil (subclasa),si presupune
 * scrierea identica a metodei din clasa parinte (superclasa),
 * DAR cu o alta implementare
 * -este best practice ca metoda suprascrisa sa aiba
 * adnotarea @override
 * 
 */

public class TestWildAnimal {

	public static void main(String[] args) {
	
		
		Lion simba = new Lion();
		simba.makeSound(); //metoda suprascrisa override
		simba.whereDoesItLIves(); //metoda mostenita pe care nu o suprascriu
		simba.eatMeat(); //metoda doar in clasa copil
		
		System.out.println("--------------------------");
		
		Dear bambi = new Dear(); 
		bambi.makeSound();  //method override
		bambi.whereDoesItLIves();
		bambi.eatGrass();

	}

}
