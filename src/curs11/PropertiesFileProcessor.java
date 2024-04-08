package curs11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	//write properties file (pt o zona de config env)
	
	public void writePropertiesFile() {
// public void writePropertiesFile(String key, String value) 
		
		
//		try() { //try() with resources, java stie sa inchida canalul de comunicare
//			
//		}catch() {}
		
		
		try {
			OutputStream outputStream = new FileOutputStream("test.properties") ;  //scriem
			
			Properties propFile = new Properties();
			propFile.setProperty("hostname", "123456"); //hostname = 123456
			propFile.setProperty("port", "8080");
			propFile.setProperty("username", "Test");
			propFile.setProperty("password", "test123");
			propFile.store(outputStream, "am salvat fisierul"); 
			
	//		propFile.setProperty(key, value);
			
			
			outputStream.close(); //canalul de comunicare trebui inchis
			
		}catch(IOException e) {
			System.out.println("Nu am putut salva fisierul! ");	
			e.printStackTrace(); //pt a vedea de ce ne-a crapat
						
		}
		
	}
	
	 	//read propertie file
	public void readPropertiesFile(String Key) {
		
		try(InputStream inputStream = new FileInputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
			System.out.println(propFile.get(Key));	
			
			
			
		}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul! ");	
			e.printStackTrace();
		}
		
	}
	
	//update properties file
	public void updatePropertiesFile(String key, String value) {
		
	try(InputStream inputStream = new FileInputStream("test.properties")) {
			
			Properties propFile = new Properties();
			propFile.load(inputStream);
						
						
	}catch(IOException e) {
			System.out.println("Nu am putut citi fisierul! ");	
			e.printStackTrace();
		}
		
	try(InputStream outputStream = new FileOutputStream("test.properties")) {
		
		Properties propFile = new Properties();
		propFile.setProperty(key, value);
		propFile.store(outputStream, value);
					
					
}catch(IOException e) {
		System.out.println("Nu am putut citi fisierul! ");	
		e.printStackTrace();
	}
	}

}
