package service.impl;

import model.Person.Employee;
import service.EmployeeService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Trung", LocalDate.parse("1999-10-08"), "Nam", "123456789", "0935819632", "dntrung1@gmail.com", "1", "Trung cấp", "Giám đốc", 5));
        employees.add(new Employee("Trung1", LocalDate.parse("1999-12-13"), "Nam", "124356789", "0935112832", "dntrung2@gmail.com", "2", "Cao đẳng", "Quản lý", 1));
        employees.add(new Employee("Trung2", LocalDate.parse("1999-12-16"), "Nam", "1234789", "09358824632", "dntrung3@gmail.com", "abc", "Đại học", "Phục vụ", 3));
    }

    @Override
    public void display() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        System.out.println("Tên mới");
        String name = scanner.nextLine();
        System.out.println("Ngày sinh");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        String gender;
        System.out.println("Giới tính" +
                "\n 1. Nam" +
                "\n 2. Nữ" );
        String choise = scanner.nextLine();
        switch (choise){
            case "1":
                gender = "Nam";
                break;
            case "2":
                gender = "Nữ";
                break;
            default:
                gender = "Khác";
                break;
        }
        System.out.println("CMND");
        String id = scanner.nextLine();
        System.out.println("Số điện thoại");
        String phone = scanner.nextLine();
        System.out.println("Email");
        String email = scanner.nextLine();
        String employeeCode;
        do {
            System.out.println("Nhập mã nhân viên");
             employeeCode = scanner.nextLine();
        }while (!checkEmployeeCode(employeeCode));
        String level = null;
        System.out.println(" CHọn Trình độ " +
                "\n 1. Trung cấp" +
                "\n 2. Cao đẳng" +
                "\n 3. Đại học" +
                "\n 4. Sau đại học");
        String choose = scanner.nextLine();
        switch (choose) {
            case "1":
                level = "Trung cấp";
                break;
            case "2":
                level = "Cao đẳng";
                break;
            case "3":
                level = "Đại học";
                break;
            case "4":
                level = "Sau đại học";
                break;
            default:
                level = "không đi học";
        }
        String position = null;
        System.out.println(" Chức vụ " +
                "\n 1. Lễ tân" +
                "\n 2. Phục vụ" +
                "\n 3. Chuyên viên" +
                "\n 4. Giám sát" +
                "\n 5. Quản lý" +
                "\n 6. Giám đốc");
        String choose1 = scanner.nextLine();
        switch (choose1) {
            case "1":
                position = "Lễ tân";
                break;
            case "2":
                position = "Phục vụ";
                break;
            case "3":
                position = "Chuyên viên";
                break;
            case "4":
                position = "Giám sát";
                break;
            case "5":
                position = "Quản lý";
                break;
            case "6":
                position = "Giám đốc";
                break;
        }
        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println(employees.add(new Employee(name, dateOfBirth, gender, id, phone, email, employeeCode, level, position, salary)));

        display();
    }

    public void edit() {
    }

    public boolean checkIdEmployee(String id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                System.out.println("Sô CMND của : " + employees.get(i).getName());
                return false;
            }
        }
        return true;
    }

    public boolean checkEmployeeCode(String code) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeCode().equals(code)) {
                return false;
            }
        }
        return true;
    }
}

