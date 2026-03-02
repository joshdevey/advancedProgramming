package uk.ac.mmu.advprog.blackjacksim.strategy;

import uk.ac.mmu.advprog.blackjacksim.Card;
import uk.ac.mmu.advprog.blackjacksim.Card.Value;
import uk.ac.mmu.advprog.blackjacksim.Game;

public class SoftSeventeenStrategy implements PlayerStrategy {

	@Override
	public boolean willHit(Card[] hand) {

		if ( Game.scoreHand(hand) > 17 ) {
			return false; /*stick*/ 
		} else if (Game.scoreHand(hand) == 17) {
			boolean hasAce = false;
			
			for(Card card: hand) {
				if(card.getValue() == Value.ACE) {
					hasAce = true;
				}
			}
			
			if(hasAce) {
				return true; /*hit*/
			}
			return false; /*stick*/
		} else {
			return true; /*hit*/ 
		}
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
