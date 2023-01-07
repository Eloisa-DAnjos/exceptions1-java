package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entitites.Reservation;
import model.exceptions.DomainException;


/*CODIGO MELHOR ORGANIZADO COM ATRIBUIÇÃO ADEQUADA DE RESPONSABILIDADES DE CLASSE
+ PROGRAMA PRINCIPAL MAIS LIMPO(COM MENOS TESTES)*/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Room Number: ");
			int roomNumber = sc.nextInt();
			System.out.println("Check in: [dd/MM/yyyy]");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("Check out: [dd/MM/yyyy]");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("UPDATE RESERVATION: ");
			System.out.println("Check in: [dd/MM/yyyy]");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check out: [dd/MM/yyyy]");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("RESERVATION: " + reservation);
		} catch (ParseException e) {
			System.out.println("INVALID DATE FORMAT");
		} catch (DomainException e) {
			System.out.println("ERROR !!!" + e.getMessage());
		}
		sc.close();
	}
}
