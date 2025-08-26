package dev.lpa;

public class BookingAgent {

    public static void main(String[] args) {

        int rows = 10;
        int totalSeats = 100;

        Theater rodgersNYC = new Theater("Richard Rodgers", rows, totalSeats);

        rodgersNYC.printSeatMap();

        bookSeat(rodgersNYC, 'A', 3);
        bookSeat(rodgersNYC, 'A', 3);

        bookSeat(rodgersNYC, 'B', 1);
        bookSeat(rodgersNYC, 'B', 11);
        bookSeat(rodgersNYC, 'M', 1);

    }

    private static void bookSeat(Theater theater, char row, int seatNo) {

        String seat = theater.reserveSeat(row, seatNo);
        if (seat != null) {
            System.out.println("Congratulations! Your seat is " + seat);
            theater.printSeatMap();
        } else {
            System.out.println("Sorry! Unable to reserve " + row + seatNo);
        }
    }
}
