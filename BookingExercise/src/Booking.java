import java.time.LocalDate;

public class Booking {
	
	private LocalDate startDate;
	private int numberOfNights;
	private double costPerNight;
	
	public Booking(LocalDate startDate, int numberOfNights, double costOfNight) {
		this.costPerNight = costOfNight;
		this.numberOfNights = numberOfNights;
		this.startDate = startDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public double getCostPerNight() {
		return costPerNight;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public void setCostPerNight(double costPerNight) {
		this.costPerNight = costPerNight;
	}
}
