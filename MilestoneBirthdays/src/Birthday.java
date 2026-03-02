import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Birthday {

	public LocalDate birthday;
	public LocalDate now;
	private int[] milestones = {16, 18, 21, 30, 40, 50, 60, 70, 80, 90, 100};
	
	public Birthday() {
		this.now = LocalDate.now();
	}
	
	public void addBirthday() throws DateTimeException {
	
		int day = 0;
		int month = 0;
		int year = 0;
	
		System.out.println("Enter your birthday dd/mm/yyyy");
		System.out.println("Enter Day");

		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i ++) {
			int entry = scanner.nextInt();
			
			switch(i) {
				case 1: 
					month = entry;
					System.out.println("Enter Year");
					break;
				case 2: 
					year = entry;
					break;
				default: 
					day = entry;
					System.out.println("Enter Month");
					break;
					
			}
		}
		
		try {
			this.birthday = LocalDate.of(year, month, day);
		} catch(DateTimeException exception) {
			throw new DateTimeException(null);
		}
		
		System.out.println(birthday);
		
	}
	
	public void milestonesInYears() throws DateTimeException {
		
		if(birthday == null) {
			throw new DateTimeException(null);
		}
		
		int yearDifference = this.now.getYear() - this.birthday.getYear();
		
		if(hasBirthdayPassedThisYear()) {
			yearDifference -= 1;
		}
		
		System.out.println("Current age in years, " + yearDifference);
		
		for(int milestone : milestones) {
			if(milestone < yearDifference) {
				System.out.println(milestone + " already met.");
			} else {
				int yearsUntil = milestone - yearDifference;
				System.out.println(milestone + " in " + yearsUntil + " years.");
			}
		}
		
	}

	public void milestones() throws DateTimeException {
		
		if(birthday == null) {
			throw new DateTimeException(null);
		}
		
		int yearDifference = this.now.getYear() - this.birthday.getYear();
		int dayDifference = 0;
		
		System.out.println(birthday);
		
		System.out.println("birthday day, " + birthday.getDayOfYear());
		System.out.println("now day, " + now.getDayOfYear());
		
		if(now.getDayOfYear() < birthday.getDayOfYear()) {
			dayDifference = this.birthday.getDayOfYear() - this.now.getDayOfYear();
		} else {
			dayDifference = 365 - (this.birthday.getDayOfYear() + this.now.getDayOfYear());
		}
	
		
		for(int milestone : milestones) {
			if(milestone < yearDifference) {
				System.out.println(milestone + " already met.");
			} else {
				int yearsUntil = milestone - yearDifference;
				System.out.println(milestone + " in " + yearsUntil + " years and "+ dayDifference + " days.");
			}
		}

	}
	
	private boolean hasBirthdayPassedThisYear() throws DateTimeException {
		
		if(birthday == null) {
			throw new DateTimeException(null);
		}
		
		int monthDifference = this.now.getMonthValue() - this.birthday.getMonthValue();
		
		return monthDifference < 0;
		
	}

}
