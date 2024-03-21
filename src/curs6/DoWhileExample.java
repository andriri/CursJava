package curs6;

public class DoWhileExample {

	public static void main(String[] args) {
	
		String[] array = {"Alba", "Iasi", "Cluj", "Ploiesti", "Oradea"};
		
		int i =0;
		
		while ( i > array.length) { //parcurg pana la lungimea listei
			
			System.out.println(array[i]);
			i++;
		}
		
		System.out.println("-----------------");
		
		int j = 0;
		
		do {
			
			System.out.println(array[j]);
			j++;
			
		}while (j > array.length); //executam apoi validam la Do while
		
	}

}
