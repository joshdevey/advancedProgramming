package com.mmu.jd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class ContentReadability {

	public String content;
	private int characters;
	private int words;
	private int sentences;
	private int syllables;

	/**
	 * Constructs and extracts words, sentences, characters and syllables from
	 * passed content
	 * 
	 * @param content Paragraph of text to be assessed
	 */

	public ContentReadability(String content) {
		super();
		this.content = content;
		this.words = content.split("\\s+").length;
		this.sentences = content.split("(?<=[.!?][\"')\\]]?)\\s+").length;
		this.characters = content.replaceAll("[^A-Za-z0-9\\s]", "").replaceAll(" ", "").split("").length;
		this.syllables = countSyllables();

	}

	/**
	 * Returns the number of syllables in content
	 * 
	 * @return the number of syllables
	 */
	private int countSyllables() {
		int counter = 0;

		String[] vowels = { "a", "e", "i", "o", "u" };
		ArrayList<String> _vowels = new ArrayList<String>(Arrays.asList(vowels));

		String[] splitWords = this.content.split("\\s+");

		for (String word : splitWords) {

			String[] chars = word.split("");
			for (int i = 0; i < chars.length; i++) {
				
				if (Arrays.binarySearch(vowels, chars[i]) >= 0) {
					try {
						String nextchar = chars[i + 1];
						if (Arrays.binarySearch(vowels, nextchar) >= 0) {
							
						} else if (chars[i] == "e" && i == chars.length) {
							
						} else {
							counter += 1;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
//						counter += 1;
//					todo: here
					}
				}
			}
		}

		if (counter == 0) {
			counter = 1;
		}
		
		return counter;
	}

	/**
	 * Returns number of characters in content
	 * 
	 * @return number of characters
	 */
	public int getCharacters() {

		return characters;
	}

	/**
	 * Returns number of words in content
	 * 
	 * @return number of words
	 */
	public int getWords() {
		return words;
	}

	/**
	 * Returns number of sentences in content
	 * 
	 * @return number of sentences
	 */
	public int getSentences() {
		return sentences;
	}

	/**
	 * Returns number of syllables in content
	 * 
	 * @return number of syllables
	 */
	public int getSyllables() {
		return syllables;
	}

	/**
	 * Calculates the Automated Readability Index score for given content
	 * 
	 * @return Automated Readability Index score
	 */
	public double calculateARI() {
		BigDecimal bigCharacters = new BigDecimal(this.characters);
		BigDecimal bigWords = new BigDecimal(this.words);
		BigDecimal bigSentences = new BigDecimal(this.sentences);
		BigDecimal charsAndWords = bigCharacters.divide(bigWords);	
		BigDecimal wordsAndSentences = bigWords.divide(bigSentences);

		BigDecimal left = new BigDecimal(4.71).multiply(charsAndWords);
		BigDecimal right = new BigDecimal(0.5).multiply(wordsAndSentences);

		return (left.doubleValue() + right.doubleValue()) - 21.43;
	}

	/**
	 * Calculates the Flesch-Kincaid score for given content
	 * 
	 * @return Flesch-Kincaid score
	 */
	public double calculateFleschKincaidScore() {
		BigDecimal totalWords = new BigDecimal(this.words);
		BigDecimal totalSyllables = new BigDecimal(this.syllables);
		BigDecimal totalSentences = new BigDecimal(this.sentences);
		BigDecimal wordsSentances = totalWords.divide(totalSentences);
		BigDecimal syllableWords = totalSyllables.divide(totalWords);

		BigDecimal left = new BigDecimal(0.39).multiply(wordsSentances);
		BigDecimal right = new BigDecimal(11.8).multiply(syllableWords);

		return (left.doubleValue() + right.doubleValue()) - 15.59;
	}

}
