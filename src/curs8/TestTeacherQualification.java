package curs8;

public class TestTeacherQualification {

	public static void main(String[] args) {
		
		Qualification Teacher = new Qualification();
		Teacher.Course("Java");
		Teacher.ExperienceYears(4);
        Teacher.Schedule("Afternoon");
        Teacher.verify();
	

	}

}
