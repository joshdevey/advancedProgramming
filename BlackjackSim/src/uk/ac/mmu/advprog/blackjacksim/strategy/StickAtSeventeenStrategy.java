package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;
import uk.ac.mmu.advprog.blackjacksim.Game;

/**
 * Simple blackjack strategy, similar to that used by casino dealers.
 * This implementation sticks if the hand is valued at 17 or more, hits otherwise.
 * 
 * @author K. Welsh
 */
public class StickAtSeventeenStrategy implements PlayerStrategy {

	/**
	 * Decides if, given the state of the player's hand, they would like to draw another card
	 * This implementation hits if the hand is valued at under 17
	 * @param hand The player's current hand of cards
	 * @return true if they would like another card ("hit"), false if not ("stick")
	 */
	@Override
	public boolean willHit(Card[] hand) {
		if ( Game.scoreHand(hand) >= 17 ) { return false; /*stick*/ }
		else { return true; /*hit*/ }
	}

	/**
	 * This method is called at the start of each new game, but is unused in this strategy
	 */
	@Override
	public void newGame() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This method is called each time the deck is shuffled, but is unused in this strategy
	 */
	@Override
	public void deckShuffled() {
		// TODO Auto-generated method stub
		
	}
	
}
