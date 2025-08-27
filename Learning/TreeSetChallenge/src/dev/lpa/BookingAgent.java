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

        bookSeats(rodgersNYC, 4, 'B', 3, 10);
        bookSeats(rodgersNYC, 6, 'B', 'C', 3, 10);
        bookSeats(rodgersNYC, 4, 'B', 1, 10);
        bookSeats(rodgersNYC, 4, 'B', 'C', 1, 10);
        bookSeats(rodgersNYC, 1, 'B', 'C', 1, 10);
        bookSeats(rodgersNYC, 4, 'M', 'Z', 1, 10);
        bookSeats(rodgersNYC, 10, 'A', 'E', 1, 10);

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

    private static void bookSeats(Theater theater, int tickets, char minRow, int minSeat, int maxSeat) {
        bookSeats(theater, tickets, minRow, minRow, minSeat, maxSeat);
    }
    private static void bookSeats(Theater theater, int tickets, char minRow, char maxRow, int minSeat, int maxSeat) {

        var seats = theater.reserveSeats(tickets, minRow, maxRow, minSeat, maxSeat);
        if (seats != null) {
            System.out.println("Congratulations! Your reserved seats are " + seats);
            theater.printSeatMap();
        } else {
            System.out.println("Sorry! No matching contiguous seats in rows: " + minRow + " - " + maxRow);
        }
    }
}
