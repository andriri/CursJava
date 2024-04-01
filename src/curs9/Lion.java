package curs9;

public class Lion extends WildAnimal{
	
	@Override 
	public void makeSound() {
		
		System.out.println("Roar!"); //leul face un sunet specific fata de alte animale
		
	}
	
	public void eatMeat() {
		System.out.println("I eat meat and I like it!");
	}

}
