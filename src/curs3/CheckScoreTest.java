package curs3;

import java.util.Scanner;

public class CheckScoreTest {
	
	int score;
	
	public void askTheUserScore() {
		System.out.println("Please enter a score: ");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
	}

    public void checkScoreIsPassedOrFailed() {
    	askTheUserScore();
    	if (score >0 && score <=65 ) {
    		System.out.println("Ai picat. Mai incearca");
    	} else if (score > 65) {
    		System.out.println("Felicitari, Ai trecut");
    	} else {
                System.out.println("Punctajul introdus nu este valid.");
    }
}
}