package curs10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {

 

     public static void main(String[] args) {

           Map <String, Integer> catalog = new HashMap<>(); 
          
           Scanner scanner = new Scanner(System.in);
                  

           catalog.put("Andrei Luca", 9);       
           catalog.put("Preda Maria", 10);      
           catalog.put("Enache Rares", 8); 
           catalog.put("Florea Elena", 7); 
         
           System.out.println("Introdu numele elevului: "); 
           String nume = scanner.nextLine();

           System.out.println("Introdu nota elevului: ");
           int nota = scanner.nextInt();
          

           System.out.println("Catalog inainte :" + catalog); 

           //initializez o varibila pentru nota care exista in catalog pentru a compara 
           //cu nota introdusa de la tastatura

           int  notaExistenta = 0;

          
           //caut in catalog daca exista numele, pun in variabila de mai sus notaExistenta

           
           if(catalog.containsKey(nume)) {

                notaExistenta = catalog.get(nume);

          
           //daca nu exista numele -scriu direct numele si nota 

           }else {

                catalog.put(nume, nota);

                System.out.println("Nu aveai nota, ti-am trecut acum!");

           }

           //compar nota introdusa cu nota existenta, daca este mai mica sau egala

           //nu fac update

           if(nota <= notaExistenta) {

                System.out.println("Nu ai nevoie de alta nota");

           //daca nota introdusa este mai mare decat cea existenta, fac update    

           } else if (nota > notaExistenta) {

                catalog.replace(nume, nota);

           }

          

    

           System.out.println("Catalog dupa " + catalog); 

          

           }

}