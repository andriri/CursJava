package curs8;

import java.util.Scanner;

public class NumberDaysInMonth {

	public static void main(String[] args) {
		
		System.out.println("Introdu luna : ");
		String luna = scan.next().toLowerCase();
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu anul : ");
		int an = scan.nextInt();
	    
		
		   switch(luna) {

           case "ianuarie", "martie", "mai", "iulie", "august", "octombrie", "decembrie" ->  System.out.println("Luna " + luna + " din anul " + an + " are 31 de zile");

 

           case "aprilie","iunie", "septembrie", "noiembrie" -> System.out.println("Luna " + luna + " din anul " + an + " are 30 de zile"); 

                

           case "februarie"-> {

                if ((an % 4 == 0 && an % 100 != 0) || (an % 400 == 0)) {

                     System.out.println("Luna " + luna + " din anul " + an + " are 29 de zile");

             } else {

                System.out.println("Luna " + luna + " din anul " + an + " are 28 de zile");

             }}

           default->System.out.println("Luna introdusă nu este validă."); 

           }
	
			
		//scan.close();
	
}

}
