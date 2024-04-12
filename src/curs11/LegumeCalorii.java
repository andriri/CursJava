package curs11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class LegumeCalorii {

	 
	  private static Properties properties;
	
	  public static void main(String[] args) {
		
		  properties = new Properties();
	        try {
	        	OutputStream outputStream = new FileOutputStream("legume.properties");
	 			Properties propFile = new Properties();
	 			propFile.setProperty("rosie", "56");
	 			propFile.setProperty("morcov", "60");
	 			propFile.setProperty("cartof", "77");
	 			propFile.setProperty("varza", "30");
	        	
	 			outputStream.close();
	        		        	
	 //           properties.load(new FileInputStream(FILE_PATH));
	        } catch (IOException e) {
	            System.err.println("Nu am putut salva fisierul!");
	            return;
	        }

	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Introdu leguma pe care vrei să o cumperi :");
	            String leguma = scanner.nextLine().trim().toLowerCase();

	         
	            String calorii = properties.getProperty(leguma);
	            if (calorii != null) {
	                System.out.println("Leguma aleasă de tine are " + calorii + " calorii.");
	            } else {
	                System.out.println("Nu vindem această legumă. Te rog să alegi alta legumă.");
	            }
	        }

	        scanner.close();
	    }
	}