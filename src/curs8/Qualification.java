package curs8;

public class Qualification extends Teacher{

	int experienceYears;
	String course;
	String schedule;
	
	public String verify() {  
		
		if(experienceYears > 3 || course == “Java”  || schedule == "Afternoon"){
				System.out.println("You qualify to teach at this school!");
		}else {
				System.out.println("You do not qualify!");
				}
	}
	
	
}
