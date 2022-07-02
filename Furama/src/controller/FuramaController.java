package controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chức năng hệ thống" +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            System.out.println("Chọn chức năng");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    EmployeeController.displayEmployee();
                    break;
                case "2":
                    CustomerController.displayCustomer();
                    break;
                case "3":
                    FacilityController.displayFacility();
                    break;
                case "4":
                    BookingController.displayBooking();
                    break;
                case "5":
                    PromotionController.displayPromotion();
                    break;
                case "6":
                    flag = false;
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag);
    }
}
