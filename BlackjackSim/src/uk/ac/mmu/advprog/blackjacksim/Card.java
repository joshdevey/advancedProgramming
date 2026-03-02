package uk.ac.mmu.advprog.blackjacksim;

/**
 * Represents an individual card in the deck
 *  
 * @author K. Welsh
 */
public class Card {
	
	/**
	 * Enumeration of the different suits of card in a standard deck. A standard deck contains one card of each suit in each value.
	 */
	public enum Suit { HEARTS, DIAMONDS, SPADES, CLUBS };
	
	/**
	 *	Enumeration of the possible card values in a standard deck. A standard deck contains one card of each value in each suit.
	 */
	public enum Value { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE  };
	
	
	private Suit suit; //this card's suit
	private Value value; //this card's value
	
	/**
	 * Constructor for creating a specific card of a specific value
	 * @param suit One of the values from the Suit enum, representing the card's suit
	 * @param value One of the values from the Value enum, representing the card's value
	 */
	Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	/**
	 * Returns the suit of the card, as one of the values in the Suit enum
	 * @return the suit of the card, as one of the values in the Suit enum
	 */
	public Suit getSuit() {
		return suit;
	}
	
	/**
	 * Returns the value of the card, as one of the values from the Value enum
	 * @return the value of the card, as one of the values from the Value enum
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * Returns the points value of the card in a game of blackjack. 
	 * This method assumes that aces are high, but the Game.scoreHand method accounts
	 * for aces being low in cases where that would be preferable
	 * @return The points value of the card
	 */
	public int pointsValue() {
		switch (value) {
			case ACE	: return 11; //low aces are handled in Game.scoreHand(), not here
			case KING	: return 10;
			case QUEEN	: return 10;
			case JACK	: return 10;
			case TEN	: return 10;
			case NINE	: return 9;
			case EIGHT	: return 8;
			case SEVEN	: return 7;
			case SIX	: return 6;
			case FIVE	: return 5;
			case FOUR	: return 4;
			case THREE	: return 3;
			case TWO	: return 2;
			default		: return 0; //shouldn't happen
		}
		
	}
}


