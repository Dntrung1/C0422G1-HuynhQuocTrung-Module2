package controller;

import java.util.Scanner;

public class FacilityController {
    public static void displayFacility() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chức năng Facility Management" +
                    "\n 1. Display list Facility" +
                    "\n 2. Add new Facility" +
                    "\n 3. Display list facility maintenance" +
                    "\n 4. Return main menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    System.out.println("Display list Facility Management");
                    break;
                case "2":
                    System.out.println("Add new Facility");
                    break;
                case "3":
                    System.out.println("Display list facility maintenance");
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
