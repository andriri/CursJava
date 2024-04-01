package curs9;

public class Dear  extends WildAnimal{
	
	@Override  //adnotare daca gresim (typo)numele metodei
	public void makeSound() {
		System.out.println("Meeeee!");
	}

	public void eatGrass() {
		System.out.println("I eat grass!");
	}
}
