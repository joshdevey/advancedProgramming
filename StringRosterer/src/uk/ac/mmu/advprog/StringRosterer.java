package uk.ac.mmu.advprog;

import java.util.Random;

public class StringRosterer {

	//problem definition
	private int _numberOfEmployees = 100;
	private int _daysToRoster = 365;	
	private char[] _shiftLetters = {'E','M','D','L'};
	
	//used in various places to get random numbers
	private Random _random = new Random();
	
	//each element in the array represents one employee, and each character in their string = 1 day
	private String[] _roster;
	
	/**
	 * Tries a hill climbing approach to a simple rostering problem
	 */
	public StringRosterer() {
		_roster = new String[_numberOfEmployees];
		
		createInitialRoster();
		
		System.out.println("Objective Score of Intitial Roster: " + objectiveFunction());
		
		for(int i=0;i<100000;i++) {
			tryToImprove();
			if ( i % 1000 == 0) {
				int obj = objectiveFunction();
				if ( obj == 0) {
					System.out.println("Got a perfect solution! Score: 0");
					System.exit(0);
				}
				else {
					System.out.println(i + ": " + objectiveFunction());
				}
			}
		}
		
		System.out.println("Final Objective Score: " + objectiveFunction());
	}
	
	/**
	 * Swaps two random employees shifts on the same day to see if its any better
	 * If not, it swaps them back
	 */
	public void tryToImprove() {
		int oldScore = objectiveFunction();
		
		//pick a random day
		int day = _random.nextInt(_daysToRoster);
		
		//pick two random employees
		int e_1 = _random.nextInt(_roster.length);
		int e_2 = _random.nextInt(_roster.length);
		
		//swap their shifts		
		char[] c_1 = _roster[e_1].toCharArray();
		char[] c_2 = _roster[e_2].toCharArray();
		
		char c = c_1[day];
		c_1[day] = c_2[day];
		c_2[day] = c;
		
		_roster[e_1] = new String(c_1);
		_roster[e_2] = new String(c_2);
		
		//find out if it worked
		if (!(objectiveFunction() <= oldScore)) {
			//oh dear, we made things worse. Change it back
			c = c_1[day];
			c_1[day] = c_2[day];
			c_2[day] = c;
			_roster[e_1] = new String(c_1);
			_roster[e_2] = new String(c_2);			
		}
	}
	
	/**
	 * Creates a completely random roster
	 * Assigns a random shift to each employee, each day
	 */
	public void createInitialRoster() {
		for(int i=0;i<_roster.length;i++) {
			_roster[i] = "";
			for(int j=0;j<_daysToRoster;j++) {
				_roster[i] = _roster[i] + _shiftLetters[_random.nextInt(_shiftLetters.length)];
			}
		}
	}
	
	/**
	 * Comes up with a "badness" score for the current roster
	 * 
	 * Two Rules: 	1	no L-E shift pattern = 10pts of badness
	 * 				2	no L-L-L shift patterns = 5pts of badness
	 * @return the badness score
	 */
	public int objectiveFunction() {
		int score = 0;
		for(String i: _roster) {
			for(int j=0;j<i.length()-3;j++) {
				//get the specified 3 characters
				String s = i.substring(j,j+3);
				if ( s.equals("LLL") ) { score += 5; }
				else if ( s.startsWith("LE") ) { score += 10; }
			}
		}
		
			
		return score;
	}
	
	/**
	 * The main entry point of the program
	 * @param args - not used
	 */
	public static void main(String[] args) {	
		long starttime = System.currentTimeMillis();
		StringRosterer s = new StringRosterer();
		long endtime = System.currentTimeMillis();
		System.out.println("Rostering Took: " + (endtime-starttime) + "ms");
	}
}
