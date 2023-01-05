package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entitites.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Room Number: ");
		int roomNumber = sc.nextInt();
		System.out.println("Check in: [dd/MM/yyyy]");
		Date checkIn = sdf.parse(sc.next());
		System.out.println("Check out: [dd/MM/yyyy]");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("***ERROR IN RESERVATION*** \nCheck Out date must be after Check In date");
		} else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("UPDATE RESERVATION: ");
			System.out.println("Check in: [dd/MM/yyyy]");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check out: [dd/MM/yyyy]");
			checkOut = sdf.parse(sc.next());

			String error = reservation.update(checkIn, checkOut);
			if (error != null) {
				System.out.println("ERROR IN RESERVATION!!! " + error);
			} else {

				System.out.println("RESERVATION: " + reservation);

			}
		}
	}
}
