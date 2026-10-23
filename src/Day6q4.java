import java.util.Scanner;

class HotelRoom {

    private int roomNumber;
    private String roomType;
    private int pricePerNight;
    private boolean roomBooked;

    // Getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public boolean isRoomBooked() {
        return roomBooked;
    }

    // Setters
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setRoomBooked(boolean roomBooked) {
        this.roomBooked = roomBooked;
    }

    // Book Room
    public void bookRoom() {
        if (roomBooked) {
            System.out.println("Room is already booked.");
        } else {
            roomBooked = true;
            System.out.println("Room booked successfully.");
        }
    }

    // Cancel Booking
    public void cancelBooking() {
        if (roomBooked) {
            roomBooked = false;
            System.out.println("Booking cancelled successfully.");
        } else {
            System.out.println("Room is already available.");
        }
    }

    // Display Details
    public void displayRoomDetails() {
        System.out.println("\n----- Room Details -----");
        System.out.println("Room Number     : " + roomNumber);
        System.out.println("Room Type       : " + roomType);
        System.out.println("Price Per Night : ₹" + pricePerNight);
        System.out.println("Room Booked     : " + roomBooked);
    }
}

public class Day6q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HotelRoom hr = new HotelRoom();

        System.out.print("Enter Room Number: ");
        hr.setRoomNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Room Type: ");
        hr.setRoomType(sc.nextLine());

        System.out.print("Enter Price Per Night: ");
        hr.setPricePerNight(sc.nextInt());

        System.out.print("Is Room Already Booked (true/false): ");
        hr.setRoomBooked(sc.nextBoolean());

        System.out.println();

        // Try booking the room
        hr.bookRoom();

        // Cancel booking if currently booked
        if (hr.isRoomBooked()) {
            hr.cancelBooking();
        }

        // Display final room details
        hr.displayRoomDetails();

        sc.close();
    }
}