import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Birthday birthday = new Birthday();
		
		try {
			birthday.addBirthday();
		} catch(DateTimeException exception) {
			System.out.println("Invalid date");
			return;
		} 


		birthday.milestonesInYears();
		birthday.milestones();
		

	}
	
}
