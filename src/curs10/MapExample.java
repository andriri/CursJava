package curs10;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		/*pereche cheie-valoare - ne ajuta sa tinem Test Data
		 *  user = test
		 *  sau json { clientId = 12345}
		 */
		
		Map <String, String> map = new HashMap<>(); //pot adauga si sterge din alt obiect
		
		System.out.println(map.size());
		
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester"); //punem valori la map
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("PO", "Product Owner");
		
		System.out.println("------------------");
		
		System.out.println(map.size());
		
		System.out.println(map.isEmpty()); //zice daca map e gol sau nu true sau false
		
		System.out.println("------------------");
		
		System.out.println(map); // va printa T=Tester D=Developer, M=Manager, PO=Product Owner
		
		System.out.println(map.get("PO"));
		
		System.out.println("------------------");
		
		map.put("D", "Director");  //va suprascrie valoarea D, cheia nu poate fi duplicata
		System.out.println(map);
		
		map.replace("D", "Developer"); //inlocuieste D de la Director cu D de la Developer
		System.out.println(map);
		
		
		System.out.println("------------------");
		
		for (String key : map.keySet()) {
			System.out.println(key + "  ");
		}
		
		System.out.println(map.values());
		
		System.out.println("\n------------------");
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("\n------------------");
		
	//	map.containsKey(map);  //putem vedea daca avem o anumita valoare intr-un sir
		
		boolean checkKey = map.containsKey("X");
		System.out.println(checkKey);
	//	if (map.containsKey("X")) {}
		
		boolean checkValue = map.containsValue("SRE");
		System.out.println(checkValue);
		
		
		System.out.println("\n------------------");
		
		map.remove("M"); //stergem cheia si valoarea
		
		System.out.println(map);
		
		map.clear(); //sterge tot map-ul
		
		System.out.println("Printuri dupa clear map");
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
	}

}
