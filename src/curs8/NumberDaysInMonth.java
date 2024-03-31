package curs8;

import java.util.Scanner;

public class NumberDaysInMonth {

	public static void main(String[] args) {
		
		System.out.println("Introdu luna : ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu anul : ");
		
		//switch
		int an;
		String luna;
	    String luna = scan.next().toUpperCase();
		
		switch(luna) {
		case "Ianuarie" :
			System.out.println("Luna  " + luna + " din anul " + an +  " are 31 de zile !");
			break;
		case "Februarie" :
			if(an % 4 == 0 && an % 100 != 0) || (an % 400 == 0) { //un an este bisect dacă este divizibil cu 400, sau
																  //este divizibil cu 4, dar nu cu 100.
				System.out.println(an + "este an bisect. ");
			}else {
				System.out.println(an + "este an nebisect. ");
			}
			
			System.out.println("Luna  " + luna + " din anul " + an +  " are 29 de zile !");
			break;
		case "Martie" :	
			System.out.println("Luna " + luna + " din anul " + an +  " are 31 de zile !");
			break;
		case "Aprilie" :	
			System.out.println("Luna " + luna + " din anul " + an +  " are 30 de zile !");
			break;
		case "Mai" :	
			System.out.println("Luna " + luna +  " din anul " + an + " are 31 de zile !");
			break;
		case "Iunie" :	
			System.out.println("Luna " + luna + " din anul " + an +  " are 30 de zile !");
			break;
		case "Iulie" :	
			System.out.println("Luna " + luna + " din anul " + an +  " are 31 de zile !");
			break;
		case "August" :	
			System.out.println("Luna " + luna + " din anul " + an +  " are 31 de zile !");
			break;
		case "Septembrie" :	
			System.out.println("Luna " + luna + " din anul " + an +  " are 30 de zile !");
			break;
		case "Octombrie" :	
			System.out.println("Luna " + luna + " din anul " + an +  " are 31 de zile !");
			break;
		case "Noiembrie" :	
			System.out.println("Luna " + luna + " din anul " + an + " are 30 de zile !");
			break;
		case "Decembrie" :	
			System.out.println("Luna " + luna + " din anul " + an + " are 31 de zile !");
			break;
		default:
			System.out.println("Luna introdusa este invalida!");
		}
	
			
		scan.close();
	
}

}
