package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty()); //gasim aceleasi metode pe map si list
		
		list.add("Oana");
		list.add("Ion");
		list.add("Gabriel");
		list.add("Maria");

		System.out.println(list.size());
		System.out.println(list.isEmpty()); 
		
		System.out.println(list); //printeaza lista pt vizualizare
								  // [Oana, Ion, Gabriel, Maria]
								  //    0     1     2        3
		
		System.out.println("--------------------------");
		
		System.out.println("get element: " + list.get(0));
		
		for (String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("----------------------------------");
		
		list.add("Ioana");
		
		System.out.println(list); ///printeaza lista si cu Ioana adaugata la final
		
		// [Oana, Ion, Gabriel, Maria, Ioana]
		//    0     1     2        3	  4
		
		list.add(2, "Carmen");
		
		System.out.println(list);
		// [Oana, Ion, Carmen, Gabriel, Maria, Ioana]
		//    0     1     2        3	  4      5
		
		list.add(6, "Bogdan");  //putem adauga maxim index+1
		System.out.println(list);
		
		System.out.println("----------------------------------");
		
		System.out.println(list.size());
		list.remove(0); //stergem prima valoare de la index 0
		System.out.println(list.size());
		System.out.println(list);
		list.remove("Gabriel");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("----------------------------------");
		
		list.add("Maria"); //permite obiecte duplicate
		System.out.println(list);
		
		list.remove("Maria"); //sterge prima aparitie a cuvantului Maria
		System.out.println(list);
		
	//	list.removeAll(list); sterge toata lista = CLEAR
	//	list.clear();
		
	//	[Ion, Carmen, Ioana, Bogdan, Maria]
    //	   0     1     2        3	  4 
		
		list.subList(0, 3); //bucata din lista mea de la index 0 la 3
		System.out.println(list.subList(0, 3));
		
		System.out.println(list); //printeaza toata lista
		
		System.out.println("----------------------------------");
		
		System.out.println(list.contains("Alina")); //verifica daca contine pe Alina -false
		System.out.println(list.contains("Bogdan"));
		System.out.println(list.indexOf("Bogdan")); //printeaza indexul unui element
		
		System.out.println("----------------------------------");
		
//		[Ion, Carmen, Ioana, Bogdan, Maria]
//		  0     1       2       3	  4 
		
		list.set(3, "Oana"); //un fel de replace pe pozitia X un element
		System.out.println(list);
		
//		[Ion, Carmen, Ioana, Oana, Maria]  //A inlocuit Bogdan cu Oana
//		  0     1       2       3	  4 
		
		
		
	}

}
