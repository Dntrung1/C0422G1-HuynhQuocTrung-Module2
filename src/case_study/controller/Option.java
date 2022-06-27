package case_study.controller;

import case_study.model.Car;
import case_study.model.Motorcycle;
import case_study.model.Truck;
import case_study.model.Vehicle;
import case_study.service.ICarService;
import case_study.service.IMotorcycleSevrice;
import case_study.service.ITruckService;
import case_study.service.impl.CarService;
import case_study.service.impl.MotorcrycleService;
import case_study.service.impl.TruckService;

import java.util.Objects;
import java.util.Scanner;

public class Option {
    private static ICarService carService = new CarService();
    private static ITruckService truckService = new TruckService();
    private static IMotorcycleSevrice motorcycleSevrice = new MotorcrycleService();

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Display" +
                    "\n 2. Add" +
                    "\n 3.Delete" +
                    "\n 4. Search" +
                    "\n 5. Exit");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    boolean flag1 = true;
                    do {
                        System.out.println("lựa chọn" +
                                "\n 1. Hiển thị ô tô" +
                                "\n 2. Hiển thị xe tải" +
                                "\n 3. Hiển thị xe máy" +
                                "\n 0. Quay về chức năng của hệ thống");
                        System.out.println("Chọn danh sách hiển thị");
                        int choise = Integer.parseInt(scanner.nextLine());
                        switch (choise) {
                            case 1:
                                System.out.println("Danh sách Ô tô");
                                carService.display();
                                break;
                            case 2:
                                System.out.println("Danh sách xe tải");
                                truckService.display();
                                break;
                            case 3:
                                System.out.println("Danh sách xe máy");
                                motorcycleSevrice.display();
                                break;
                            case 0:
                                displayMenu();
                            default:
                                flag1 = false;
                        }
                    } while (flag1);
                    break;
                case 2:
                    boolean flag2 = true;
                    do {
                        System.out.println("lựa chọn" +
                                "\n 1. Thêm ô tô" +
                                "\n 2. Thêm xe tải" +
                                "\n 3. Thêm xe máy" +
                                "\n 0. Quay về chức năng của hệ thống");
                        System.out.println("Chọn quản lý");
                        int choise = Integer.parseInt(scanner.nextLine());
                        switch (choise) {
                            case 1:
                                System.out.println("Thêm Ô tô");
                                carService.add();
                                break;
                            case 2:
                                System.out.println("Thêm xe tải xe tải");
                                truckService.add();
                                break;
                            case 3:
                                System.out.println("Thêm xe máy xe máy");
                                motorcycleSevrice.add();
                                break;
                            case 0:
                                displayMenu();
                        }
                    } while (flag2);
                    break;
                case 3:
                    System.out.println("Chức năng xóa");
                    System.out.println("Nhập biển số xe");
                    int numberOfControl = Integer.parseInt(scanner.nextLine());
                    int confirm;

                    Car carDelete = (Car) carService.findByNumber(numberOfControl);
                    Truck truckDelete = (Truck) truckService.findByNumber(numberOfControl);
                    Motorcycle motorcycleDelete = (Motorcycle) motorcycleSevrice.findByNumber(numberOfControl);


                    if (carDelete != null) {
                        System.out.println("Xác nhận xóa? " + carDelete);
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        confirm = Integer.parseInt(scanner.nextLine());
                        if (confirm == 1) {
                            carService.remove(numberOfControl);
                            System.out.println("Xóa thành công.");
                        } else {
                            displayMenu();
                        }
                    } else if (truckDelete != null) {
                        System.out.println("Xác nhận xóa? " + truckDelete);
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        confirm = Integer.parseInt(scanner.nextLine());
                        if (confirm == 1) {
                            truckService.remove(numberOfControl);
                            System.out.println("Xóa thành công.");
                        } else {
                            displayMenu();
                        }
                    } else if (motorcycleDelete != null){
                        System.out.println("Xác nhận xóa? " + motorcycleDelete);
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        confirm = Integer.parseInt(scanner.nextLine());
                        if (confirm == 1) {
                            motorcycleSevrice.remove(numberOfControl);
                            System.out.println("Xóa thành công.");
                        } else {
                            displayMenu();
                        }
                    } else {
                        System.out.println("Ko tìm thấy.");
                    }
                    break;
                case 4:
                    System.out.println("Chức năng tìm kiếm");
//                    int controllNumber = Integer.parseInt(scanner.nextLine());
////                    Car searchCar = carService.
////                    Truck searchTruck = (Truck) truckService.findByNumber(controllNumber);
////                    Motorcycle searchMoto = (Motorcycle) motorcycleSevrice.findByNumber(controllNumber);
//
//                    if (searchCar!=null){
//                        carService.display();
//                    }

                    break;
            }
        }while (flag);
    }
}
