package day1;

import java.util.Scanner;

public class TextAnalyzer {
	String[] goodWords = {"latter", "solskin", "dejlig"};
	String[] badWords = {"regn", "trist", "sur"};
	String mood;
	String sentence;
	Scanner in = new Scanner(System.in);
	
	public String userInput() {
		System.out.print("Enter a sentence: ");
		return in.nextLine();
	}
	
	public String sentenceMood(String sentence) {
		String lowerCaseSentence = sentence.toLowerCase();
		boolean isGoodMood = false;
		boolean isBadMood = false;
		
		for (String word : goodWords)
			if (lowerCaseSentence.contains(word)) {
				isGoodMood = true;
				break;
			}
		
		for (String word : badWords)
			if (lowerCaseSentence.contains(word)) {
				isBadMood = true;
				break;
			}
		
		if (isBadMood) {
			return "bad";
		} else if (isGoodMood) {
			return "good";
		} else
			return "neutral";
	}
	
	public void printMood(String mood) {
		if (mood.equals("good"))
			System.out.println("The mood seems good");
		else if (mood.equals("bad"))
			System.out.println("The mood seems bad");
		else
			System.out.println("No strong mood");
	}
	
	public void go(){
		mood = sentenceMood(userInput());
		printMood(mood);
	}
	
	public static void main(String[] args) {
		TextAnalyzer t = new TextAnalyzer();
		t.go();
		
	}
}
