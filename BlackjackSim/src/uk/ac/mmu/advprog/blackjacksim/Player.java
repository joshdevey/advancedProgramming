package uk.ac.mmu.advprog.blackjacksim;

import java.util.ArrayList;
import java.util.Arrays;

import uk.ac.mmu.advprog.blackjacksim.strategy.PlayerStrategy;

/**
 * Represents a Player in a game of blackjack
 * The strategy adopted by the player is handled by a PlayerStrategy Implementation, 
 * this class just represents the player's details and defers decision-making to the strategy clas  
 * @author K. Welsh
 *
 */
public class Player {
	
	int id;
	PlayerStrategy strat;
	ArrayList<Card> hand = new ArrayList<Card>();

	/**
	 * Constructs a player, using the specified strategy
	 * This method doesn't care which strategy is used, thanks to polymorphism
	 * @param id The player's number for use in output summaries
	 * @param strat The strategy that this player will use
	 */
	public Player(int id, PlayerStrategy strat) {
		this.strat = strat;
		this.id = id;
	}
	
	/**
	 * Returns the player's ID, for ease of identification in output summaries
	 * @return The plaer ID
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Informs the player that a new game has started.
	 * The player will clear their hand, and start afresh with the new cards
	 * @param cards The cards in the player's new hand
	 */
	public void startGame(Card[] cards) {
		hand.clear();
		strat.newGame();
		hand.addAll(Arrays.asList(cards));
	}
	
	/**
	 * Informs the player that the deck has been shuffled, which it passes to the strategy class
	 */
	public void deckShuffled() {
		strat.deckShuffled();
	}
	
	/**
	 * This method is called when asking the player if they would like to stick or hit.
	 * The decision is deferred to the PlayerStrategy implementation used by this player 
	 * @return true if they wish to hit, false if they wish to stick
	 */
	public boolean decide() {
		return strat.willHit(hand.toArray(new Card[hand.size()]));
	}
	
	/**
	 * Deals an additional card to the player, updating their hand
	 * @param c The card to deal
	 */
	public void deal(Card c) {
		hand.add(c);
	}
	
	/**
	 * Returns the player's hand, as a Card array
	 * @return the player's hand
	 */
	public Card[] getHand() {
		return hand.toArray(new Card[hand.size()]);
	}
	
}
