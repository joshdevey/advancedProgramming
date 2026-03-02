package com.mmu.jd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Enter your paragraph");
		
		Scanner scanner = new Scanner(System.in);
		
		String content = scanner.nextLine();
		
		System.out.println("content: " + content);
		
		ContentReadability test = new ContentReadability(content);
		
		System.out.println("Words, " + test.getWords());
		System.out.println("Sentences, " + test.getSentences());
		System.out.println("Characters, " + test.getCharacters());
		System.out.println("Syllables, " + test.getSyllables());
		
		System.out.println("ARI score: " + test.calculateARI());
	}

}
