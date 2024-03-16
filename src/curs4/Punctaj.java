package curs4;

public class Punctaj {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti punctajul: ");
        int punctaj = scanner.nextInt();

        String calificativ = (punctaj >= 90) ? "FB" : (punctaj >= 80) ? "B" : "S";

        System.out.println("Calificativul tau este: " + calificativ);

        
        if (calificativ.equals("FB")) {
            System.out.println("Ai primit: Foarte Bine!");
        } else if (calificativ.equals("B")) {
            System.out.println("Ai primit: Bine!");
        } else if (calificativ.equals("S")) {
            System.out.println("Ai primit: Suficient!");
        } else {
            System.out.println("Calificativ necunoscut!");
        }

        scanner.close();
	}

}
