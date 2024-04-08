package curs11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<>(); //pentru date unice fara duplicate, spre deosebire de lista
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		set.add("alb");
		set.add("mov");
		set.add("rosu");
		set.add("negru");
		set.add("galben");
		set.add("roz");
		
		for(String culoare : set) {
			System.out.println(culoare); //le printeaza neordonate
		}
		
		System.out.println(set);
		System.out.println(set.size());
		set.add("rosu");
		System.out.println(set);
		System.out.println(set.size());
		
		System.out.println(set.contains("verde")); //false nu exista in lista
		System.out.println(set.contains("mov"));
		set.add("Rosu"); //e case senzitive, il va adauga si pe Rosu pe langa rosu
		System.out.println(set);
		
		System.out.println("--------------------------");
		
		set.remove("Rosu");
		System.out.println(set);
		
		
	}

}
