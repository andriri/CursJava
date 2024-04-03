package curs8;

public class Qualification extends Teacher{

	public String Course;
	public int ExperienceYears;
	public String Schedule;
	
	public void verify() {  
		
		if(ExperienceYears > 3 && Course.equals("Java") && Schedule.equals("Afternoon")){
				System.out.println("You qualify to teach at this school!");
		}else {
				System.out.println("You do not qualify!");
				}
	}
	
	
}
