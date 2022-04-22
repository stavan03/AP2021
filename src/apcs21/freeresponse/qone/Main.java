package apcs21.freeresponse.qone;

public class Main {

	public static void main(String[] arg) {
		//WordMatch wordMatch = new WordMatch("Mississippi");
		WordMatch wordMatch = new WordMatch("concatenation");
		String guess1 = "con";
		int a = wordMatch.scoreGuess(guess1);
		System.out.println(" Score of Guess : " + a);
		
		String betterGuess = wordMatch.findBetterGuess("con", "cat");
		System.out.println("betterGuess : " + betterGuess);
	}
}
