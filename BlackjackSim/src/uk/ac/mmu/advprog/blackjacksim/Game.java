package uk.ac.mmu.advprog.blackjacksim;

import uk.ac.mmu.advprog.blackjacksim.strategy.AlwaysStickStrategy;
import uk.ac.mmu.advprog.blackjacksim.strategy.SoftSeventeenStrategy;
import uk.ac.mmu.advprog.blackjacksim.strategy.StickAtEighteenStrategy;
import uk.ac.mmu.advprog.blackjacksim.strategy.StickAtSeventeenStrategy;
import uk.ac.mmu.advprog.blackjacksim.strategy.StickAtSixteenStrategy;
import uk.ac.mmu.advprog.blackjacksim.strategy.StickAtThreeCardsStrategy;
import uk.ac.mmu.advprog.blackjacksim.strategy.StickAtNineteenStrategy;

/**
 * Allows for a single game of blackjack to be simulated
 * @author K. Welsh
 */
public class Game {
	
	//you can change this to vary the number of players in the game, and to make one use your preferred strategy
	static final Player[] PLAYERS = {
		new Player(1,new StickAtSixteenStrategy()),
		new Player(2,new SoftSeventeenStrategy()),
		new Player(3,new StickAtEighteenStrategy()),
		new Player(4,new StickAtNineteenStrategy()),
		new Player(4,new AlwaysStickStrategy()),
		new Player(4,new StickAtThreeCardsStrategy()),
		new Player(5, new StickAtSeventeenStrategy())
	};

	private Deck deck = new Deck();
	
	/**
	 * Default no-parameter constructor. Does nothing.
	 */
	public Game() {
		
	}
	
	/**
	 * Plays a game of blackjack between the players in the PLAYERS array
	 * @return the winner of the game, which will be one of the players in the PLAYERS array, or null in the case of a draw
	 */
	public Player playGame() {
		deck.shuffle();
		
		//deal starting hand
		for(int i=0; i<PLAYERS.length; i++) {
			PLAYERS[i].startGame(new Card[] { deck.draw(), deck.draw() } );
		}
		
		//let each player play
		for(int i=0; i<PLAYERS.length; i++) {
			//prevent bust players from hitting infinitely, but other than that let them decide
			while ( scoreHand(PLAYERS[i].getHand()) > -1 && PLAYERS[i].decide() ) {
				PLAYERS[i].deal(deck.draw());
			}
		}
		
		//determine scores
		int[] scores = new int[PLAYERS.length];
		for (int i=0; i<PLAYERS.length; i++) {
			scores[i] = scoreHand(PLAYERS[i].getHand());
		}
		
		//pick a winner, null if its a draw
		int max = -1;
		int playersAtMax = 0;
		int winner = -1;
		
		for (int i=0; i<PLAYERS.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
				winner = i;
				playersAtMax = 0;
			}
			else if ( scores[i] == max ) {
				playersAtMax++;
			}
		}
		
		if ( playersAtMax > 0 ) { return null; /*draw*/ }
		else { return PLAYERS[winner]; }
	}
	
	/**
	 * Utility method for scoring a hand of cards in a game of blackjack.
	 * This method attempts to use aces high to maximise the player's score,
	 * but reverts back to low aces if the player would otherwise go bust
	 * @param cards the hand of cards to evaluate
	 * @return the score, or -1 if the player is bust
	 */
	public static int scoreHand(Card[] cards) {
		//calculate initial total
		int total = 0;
		for(int i=0; i<cards.length; i++) {
			total += cards[i].pointsValue();
		}
		
		//if over 21, check if any aces can be re-valued @ 1 to get them back under
		if (total > 21) {
			int aces = 0;
			for( int i=0; i<cards.length; i++) {
				if ( cards[i].getValue().equals(Card.Value.ACE) ) { aces++; }
			}			
			while ( total > 21 && aces > 0 ) {
				total -=10 ; aces--;
			}
			
			//if that didn't work, return -1 to indicate they're bust
			if ( total > 21 ) { return -1; }
		}
		
		return total;
	}
	

	
}

