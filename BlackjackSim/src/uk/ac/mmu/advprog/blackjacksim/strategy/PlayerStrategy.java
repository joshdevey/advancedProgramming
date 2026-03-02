package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;

/**
 * Interface for player strategy definitions in a game of blackjack
 * Create a class that implements this interface to add a new strategy
 * Don't forget to set a player to use your new implementation in the Game.PLAYERS array!
 * @author K. Welsh
 *
 */
public interface PlayerStrategy {
	
	/**
	 * Decides if, given the state of the player's hand, they would like to draw another card
	 * @param hand The player's current hand of cards
	 * @return true if they would like another card ("hit"), false if not ("stick")
	 */
	public boolean willHit(Card[] hand);
	
	/**
	 * Informs the strategy implementation that a new game has started, in case it was keeping track of information during the game
	 */
	public void newGame();
	
	/**
	 * Informs the strategy implementation that the deck has been shuffled, in case its keeping track of that
	 */
	public void deckShuffled();
	
}
