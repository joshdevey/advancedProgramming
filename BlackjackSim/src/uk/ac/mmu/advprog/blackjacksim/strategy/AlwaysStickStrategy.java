package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;

public class AlwaysStickStrategy implements PlayerStrategy {

	@Override
	public boolean willHit(Card[] hand) {
		return false;
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
