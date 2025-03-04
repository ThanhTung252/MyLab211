package week5;

import java.util.*;

class FlightInformation {
    private String flightNumber;
    private String seatNumber;
    private String timePickUp;

    public FlightInformation(String flightNumber, String seatNumber, String timePickUp) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickUp = timePickUp;
    }

    @Override
    public String toString() {
        return flightNumber + " - " + seatNumber + " - " + timePickUp;
    }
}

public class Reservation {
    private String bookingID;
    private String customerName;
    private String phoneNumber;
    private String roomNumber;
    private String bookingDate;
    private FlightInformation flightInfo;

    public Reservation(String bookingID, String customerName, String phoneNumber, String roomNumber, String bookingDate, FlightInformation flightInfo) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.flightInfo = flightInfo;
    }

    public String getBookingID() {
        return bookingID;
    }

    @Override
    public String toString() {
        return bookingID + " - " + customerName + " - " + phoneNumber + " - " + roomNumber + " - " + bookingDate + " - " + flightInfo;
    }
}

//public class RoomReservationTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Reservation> reservations = new ArrayList<>();
//
//        while (true) {
//            System.out.println("*** Reservation Management ***");
//            System.out.println("1. Create new reservation");
//            System.out.println("2. Print all reservations");
//            System.out.println("3. Exit");
//            System.out.print("You choose: ");
//            int choice = sc.nextInt();
//            sc.nextLine();
//
//            if (choice == 1) {
//                System.out.print("Enter booking ID: ");
//                String id = sc.nextLine();
//
//                System.out.print("Enter customer name: ");
//                String name = sc.nextLine();
//
//                System.out.print("Enter phone number: ");
//                String phone = sc.nextLine();
//
//                System.out.print("Enter room number: ");
//                String room = sc.nextLine();
//
//                System.out.print("Enter booking date: ");
//                String date = sc.nextLine();
//
//                System.out.print("Need airport pick up? (Y/N): ");
//                String pickUp = sc.nextLine();
//                FlightInformation flightInfo = null;
//                if (pickUp.equalsIgnoreCase("Y")) {
//                    System.out.print("Enter flight number: ");
//                    String flightNum = sc.nextLine();
//
//                    System.out.print("Enter seat number: ");
//                    String seat = sc.nextLine();
//
//                    System.out.print("Enter pick-up time: ");
//                    String time = sc.nextLine();
//
//                    flightInfo = new FlightInformation(flightNum, seat, time);
//                }
//
//                reservations.add(new Reservation(id, name, phone, room, date, flightInfo));
//                System.out.println("Reservation created successfully!");
//            } else if (choice == 2) {
//                System.out.println("*** All Reservations ***");
//                for (Reservation r : reservations) {
//                    System.out.println(r);
//                }
//            } else if (choice == 3) {
//                System.out.println("BYE AND SEE YOU NEXT TIME!");
//                break;
//            }
//        }
//    }
//}