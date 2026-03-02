package uk.ac.mmu.advprog.blackjacksim;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents the deck of cards in a game of blackjack.
 * The deck contains one of every card value in each suit.
 * The deck is automatically shuffled when it runs out.
 * @author K. Welsh
 */
public class Deck {
	
	ArrayList<Card> cards = new ArrayList<Card>();
	int pointer = 0;
	
	/**
	 * Default constructor. Creates and populates a new deck.
	 */
	public Deck() {
		for (int i=0; i<Card.Suit.values().length; i++ ) {
			for (int j=0; j<Card.Value.values().length; j++) {
				cards.add(new Card(Card.Suit.values()[i],Card.Value.values()[j]));
			}
		}
		this.shuffle();
	}
	
	/**
	 * Shuffles the deck of cards, and resets internal state so it deals from the top
	 */
	public void shuffle() {
		Collections.shuffle(cards);
		pointer = 0;
		
		//inform players the deck was shuffled
		for(int i=0; i<Game.PLAYERS.length; i++) {
			Game.PLAYERS[i].deckShuffled();
		}
	}
	
	/**
	 * Deals a card from the top of the deck. If the deck is empty, it is shuffled.
	 * @return The randomly-selected card
	 */
	public Card draw() {
		if ( pointer >= cards.size()-1 ) { this.shuffle(); }
		return cards.get(pointer++);
	}
}
