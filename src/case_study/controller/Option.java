package case_study.controller;

import case_study.service.ICarService;
import case_study.service.IMotorcycleSevrice;
import case_study.service.ITruckService;
import case_study.service.impl.CarService;
import case_study.service.impl.MotorcrycleService;
import case_study.service.impl.TruckService;

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
                    "\n 4. Edit" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng hiển thị");
                    boolean flag1 = true;
                    do {
                        System.out.println("lựa chọn" +
                                "\n 1. Quản lý ô tô" +
                                "\n 2. QUản lý xe tải" +
                                "\n 3. Quản lý xe máy" +
                                "\n 0. Exit");
                        System.out.println("Chọn quản lý");
                        int choise = Integer.parseInt(scanner.nextLine());
                        switch (choise) {
                            case 1:
                                System.out.println("Hiển thị Ô tô");
                                carService.display();
                                break;
                            case 2:
                                System.out.println("Hiển thị xe tải");
                                truckService.display();
                                break;
                            case 3:
                                System.out.println("Hiển thị xe máy");
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
                    System.out.println("Chứ năng thêm vào");
                    boolean flag2 = true;
                    do {
                        System.out.println("lựa chọn" +
                                "\n 1. Quản lý ô tô" +
                                "\n 2. QUản lý xe tải" +
                                "\n 3. Quản lý xe máy" +
                                "\n 0. Exit");
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
                            default:
                                flag2 = false;
                        }
                    } while (flag2);
                    break;
                case 3:
                    System.out.println("Chức năng xóa");
                    System.out.println("Nhập biển số xe");
                    int numberOfControl = Integer.parseInt(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Chức năng chỉnh sửa");
                    break;
            }
        }while (flag);
    }
}
