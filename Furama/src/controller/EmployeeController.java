package controller;

import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeController {
    private static EmployeeService employeeService = new EmployeeServiceImpl();
    public static void displayEmployee() {
        Scanner scanner = new Scanner(System.in);
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
                    return;
                default:
                    System.err.println("Nhập lại");
            }
        } while (flag);
    }
}
