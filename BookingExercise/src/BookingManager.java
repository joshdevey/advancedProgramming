import java.util.List;

public class BookingManager {

	private List<Booking> bookings;

	public void addBooking(Booking booking) {
		this.bookings.add(booking);
	}

	public int getNumberOfBookings() {
		return bookings.size();
	}

	public double getTotalBookingValue() {
		
		double total = 0;
		
		for(Booking booking : bookings) {
			total += booking.getCostPerNight();
			
		}
		
		return total;
	}
	
	public void clearBookings() {
		this.bookings.clear();
	}
	
	public List<Booking> getAllBookings() {
		return bookings;
	}
	
	public List<Booking> getAllBookingsInMonth(String month) {
		
		List<Booking> bookingsInMonth = null; 
		
		for(Booking booking : bookings) {
			if(booking.getStartDate().getMonth().toString() == month) {
				bookingsInMonth.add(booking);
			}
		}
		
		
		return bookingsInMonth;
	}
	
	
	public static void main() {
		System.out.println("out");
	}

}
