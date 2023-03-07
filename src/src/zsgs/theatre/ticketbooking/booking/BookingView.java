package zsgs.theatre.ticketbooking.booking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import zsgs.theatre.ticketbooking.dao.*;

public class BookingView {

	BookingController bookingcontroller;

	Scanner scanner = new Scanner(System.in);

	public BookingView() {
		bookingcontroller = new BookingController(this);
	}

	public static void main(String[] args) {
		BookingView bv = new BookingView();
		bv.adminBookMyShow();
	}

	public void adminBookMyShow() {
		boolean setup = true;
		do {
			System.out.println(" 1.View Theatres \n 2.TicketBookings\n 3.checkbooking \n 4.Exit\n");
			System.out.println("Enter your chioce");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				checkTheatre();
				break;
			case 2:
				bookTicket();
				break;
			case 3:
				checkBooking();
			case 4:
				setup = false;
				break;
			default:
				System.out.println("\n Choose correct options\n");
				break;

			}
		} while (setup);
	}

	
	private void checkBooking() {
		bookingcontroller.checkticketBooking();

	}

	public void viewBooking(ArrayList<Booking> bookings) {
		System.out.println("-----");
		for (Booking booking : bookings) {

			System.out.println(booking.getTheatreno() + " \t" + booking.getTheatrename() + " \t"
					+ booking.getTicketcount() + " \t" + booking.getTotalcost());
		}
		System.out.println("------");

	}

	public void viewTheatres(ArrayList<Theatre> VT) {
		System.out.println("------");
		for (Theatre Vt : VT) {

			System.out.println(Vt.getTheatreno() + "     " + Vt.gettheatname() + "     " + Vt.getmoviename()
					+ "          \t" + Vt.getticketrate() + "      " + Vt.getticketcount());
		}
		System.out.println("-----");
	}

	private void bookTicket() {
		System.out.println("Enter TheatreNo");
		int theatreno = scanner.nextInt();
		System.out.println("Enter Ticket  Numberof tickets: ");
		int theatrecount = scanner.nextInt();
		bookingcontroller.bookTheatre(theatreno, theatrecount);

	}

	private void checkTheatre() {
		bookingcontroller.checkTheatre();
	}

	public void ticketbookingsuccess(LinkedHashSet<Object> booking) {
		System.out.println("Ticket booked Successfull");
		System.out.println("---------------------------");
		Iterator<Object> it = booking.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("---------------------------");

	}

	public void ticketbookingfailed() {
		System.out.println("Sorry!!!...Ticket not available....");

	}

	public void userBookMyShow() {
		
		
	}
}
