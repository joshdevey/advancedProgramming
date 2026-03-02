package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;

public class StickAtThreeCardsStrategy implements PlayerStrategy {

	@Override
	public boolean willHit(Card[] hand) {
		if(hand.length == 3) {
			return false;
		}
		return true;
	}

	@Override
	public void newGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deckShuffled() {
		// TODO Auto-generated method stub
		
	}

}
