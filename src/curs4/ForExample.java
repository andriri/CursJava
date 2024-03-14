package curs4;

public class ForExample {

	public static void main(String[] args) {
		
		//in paranteza in ordinea asta
		//initializarea se executa o singura data, conditie, iterator
		for (int i=0; i < 10; i++) {
			
			System.out.println("Valoarea lui i este " + i);
		}		
		System.out.println("------------------");
		
		for (int i = 0; i < 10; i++) {
			
			if (i ==5) {
				//break; //intrerupe executia buclei
				continue; //face skip la bucla in care se afla
			}
			System.out.println(i);
		}

	}

}
