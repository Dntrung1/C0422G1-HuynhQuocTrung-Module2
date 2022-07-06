package controller;

import service.FacilityService;
import service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class
FacilityController {
    private static FacilityService facilityService = new FacilityServiceImpl();
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
                    facilityService.display();
                    break;
                case "2":
                    System.out.println("Add new Facility");
                    facilityService.add();
                    break;
                case "3":
                    System.out.println("Display list facility maintenance");
                    facilityService.displayListFacilityMaintenance();
                    break;
                case "4":
                    return;
                default:
                    System.err.println("Nhập lại");
            }
        } while (flag);
    }
}
