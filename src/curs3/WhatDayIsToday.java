package curs3;

import java.util.Scanner;

public class WhatDayIsToday {
	    int zi;
	    
	    public void askTheUserForADay() {
			System.out.println("Please enter a number: ");
			Scanner scan = new Scanner(System.in);
			zi = scan.nextInt();
	}
	    
	    public void checkDay() {
	    	askTheUserForADay();
	    	    	
	    	if (zi == 0) {
	    		System.out.println("Te rog sa introduci un numar mai mare ca 0");
	    	} else if (zi == 1 ) {
	    		System.out.println("Astazi este luni");
	    	} else if (zi == 2 ) {
	    		System.out.println("Astazi este marti");
	    	} else if (zi == 3) {
	    		System.out.println("Astazi este miercuri");
	    	} else if (zi == 4 ) {
	    		System.out.println("Astazi este joi");
	    	} else if (zi == 5 ) {
	    		System.out.println("Astazi este vineri");
	    	} else if (zi == 6 ) {
	    		System.out.println("Astazi este sambata");
	    	} else if (zi == 7 ) {
	    		System.out.println("Astazi este duminica");
	    	} else if (zi > 7 ) {
	    		System.out.println("”Saptamana are doar 7 zile te rog sa introduci un numar valid");
	    		}
	    	}
}