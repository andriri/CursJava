package curs5;

import java.util.Scanner;

public class TablaInmultirii {

	public static void main(String[] args) {
		
		int nr;
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("Please enter a number: " );
		nr = scan.nextInt();
		
		for(int i = 1; i<=10; i++) {
			int result = nr * i;
			System.out.println(nr + "*" + i + " = " + result);
			
		}

	}
}
