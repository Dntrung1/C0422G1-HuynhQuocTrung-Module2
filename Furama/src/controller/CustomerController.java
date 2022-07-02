package controller;

import java.util.Scanner;

public class CustomerController {
    public static void displayCustomer() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chức năng Customer Management" +
                    "\n 1. Display list customers" +
                    "\n 2. Add new customer" +
                    "\n 3. Edit customer" +
                    "\n 4. Return main menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    System.out.println("Display list customers");
                    break;
                case "2":
                    System.out.println("Add new customer");
                    break;
                case "3":
                    System.out.println("Edit customer");
                    break;
                case "4":
                    System.out.println("Return main menu");
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag);
    }
}
