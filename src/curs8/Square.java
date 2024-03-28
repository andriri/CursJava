package curs8;

public class Square extends Shape {
	
	String nume = "Cerc";
	String culoare = "Verde";
	
	
	public Square(String culoare, String nume) {
		super(culoare, nume);  //constructor cu cuvant cheie 'super'
				
	}
	
	public Square() {
		
		
	}
	
	public void printDetails() {
		
		System.out.println("Numele este: " + super.nume + " si culoarea este : " + super.culoare);
		
	}

	public void printNameLenght() {
		
		System.out.println("Lungimea numelui este: "  + nume.length());
	}
	
}
