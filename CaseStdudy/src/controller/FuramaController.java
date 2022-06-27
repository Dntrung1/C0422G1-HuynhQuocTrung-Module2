package controller;

import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

import java.util.Scanner;
public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);
    public static EmployeeService employeeService = new EmployeeServiceImpl();
    public static void displayMenu() {
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
                    System.out.println("Employee Management");
                    displayEmployee();
                    break;
                case "2":
                    System.out.println("Customer Management");
                    displayCustomer();
                    break;
                case "3":
                    System.out.println("Facility Management");
                    displayFacility();
                    break;
                case "4":
                    System.out.println("Booking Management");
                    displayBooking();
                    break;
                case "5":
                    System.out.println("Promotion Management");
                    displayPromotion();
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

    private static void displayEmployee() {
        boolean flag = true;
        do {
            System.out.println("Chức năng Employee Management" +
                    "\n 1. Display list employees" +
                    "\n 2. Add new employee" +
                    "\n 3. Edit employee" +
                    "\n 4. Return main menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    System.out.println("Display list employees");
                    employeeService.display();
                    break;
                case "2":
                    System.out.println("Add new employee");
                    employeeService.add();
                    break;
                case "3":
                    System.out.println("Edit employee");
                    employeeService.edit();
                    break;
                case "4":
                    System.out.println("Return main menu");
                    displayMenu();
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag = true);
    }

    private static void displayCustomer() {
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
                    displayMenu();
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag = true);
    }

    private static void displayFacility() {
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
                    displayMenu();
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag = true);
    }

    private static void displayBooking() {
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
                    break;
                case "2":
                    System.out.println("Display list booking");
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
                    System.out.println("Return main menu");
                    displayMenu();
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag = true);
    }

    private static void displayPromotion() {
        boolean flag = true;
        do {
            System.out.println("Chức năng Promotion Management" +
                    "\n 1. Display list customers use service" +
                    "\n 2. Display list customers get voucher" +
                    "\n 3. Return main menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    System.out.println("Display list customers use service");
                    break;
                case "2":
                    System.out.println("Display list customers get voucher");
                    break;
                case "3":
                    System.out.println("Return main menu");
                    displayMenu();
                    break;
                default:
                    flag = true;
                    System.err.println("Nhập lại");
            }
        } while (flag = true);
    }
}
