package apcs21.freeresponse.qone;

public class WordMatch {

	private String secret;
	
	public WordMatch(String word) {
		this.secret = word.toLowerCase();
	}
	
	public int scoreGuess(String guess) {
		//this method finds the number of times input(guess) occurs as
		//a substring of secret and then multiplies that number by the square of the 
		//length of guess. Occurenses of guess may overlap within secret. 
		String temp;
		int count=0;
		int secretLength = secret.length();
		int guessLength = guess.length();
		for(int i=0; i<(secretLength-guessLength)+1; i++) {
			temp = secret.substring(i,  i+guessLength);
			//System.out.println("temp :" + temp);
			if(temp.equalsIgnoreCase(guess)) {
				count++;
			}
		}
		return count*guessLength*guessLength;
	}
	
	public String findBetterGuess(String guess1, String guess2) {
		int a = scoreGuess(guess1);
		int b = scoreGuess(guess2);
		if(a > b) {
			return guess1;
		}else if(b > a) {
			return guess2;
		}else if(a==b) {
			if(guess1.compareTo(guess2) > 0) {
				return guess1;
			}else {
				return guess2;
			}
		}
		return "guess1";
	}
}
