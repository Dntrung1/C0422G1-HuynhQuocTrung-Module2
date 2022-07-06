package controller;

import service.BookingService;
import service.impl.BookingServiceImpl;

import java.util.Scanner;

public class BookingController {
    private static BookingService bookingService = new BookingServiceImpl();
    public static void displayBooking() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chức năng Booking Managerment" +
                    "\n 1. Add new booking" +
                    "\n 2. Display list booking" +
                    "\n 3. Create new constracts" +
                    "\n 4. Display list contracts" +
                    "\n 5. Edit contracts" +
                    "\n 6. Return main menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    System.out.println("Add new booking");
                    bookingService.addBooking();
                    break;
                case "2":
                    System.out.println("Display list booking");
                    bookingService.displayBooking();
                    break;
                case "3":
                    System.out.println("Create new constracts");
                    break;
                case "4":
                    System.out.println("Display list contracts");
                    break;
                case "5":
                    System.out.println("Edit contracts");
                    break;
                case "6":
                    return;
                default:
                    System.err.println("Nhập lại");
            }
        } while (flag);
    }
}
