package Demo.CRUDCar;

import java.util.Scanner;

public class RunCRUDCar {
    public static void main(String[] args) {
        displayMenu();
    }
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        CRUDCarManager car = new CRUDCarManager();
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống");
            System.out.println("1. Display");
            System.out.println("2. Thêm vào");
            System.out.println("3. Xóa");
            System.out.println("4. Sữa");
            System.out.println("5. Tim kiếm theo tên");
            System.out.println("6. Tim kiếm theo màu");
            System.out.println("7. Tim kiếm theo Nhà sản xuất");
            System.out.println("0. Exit");
            System.out.println("Lựa chọn chứ năng");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise){
                case 1:
                    System.out.println("Chức năng hiển thị");
                    car.display();
                    break;
                case 2:
                    System.out.println("Chức năng thêm mới");
                    car.add();
                    break;
                case 3:
                    System.out.println("Chức năng xóa");
                    car.delete();
                    break;
                case 4:
                    System.out.println("Chức năng sữa chữa");
                    car.edit();
                    break;
                case 5:
                    System.out.println("Chức nắng tìm kiếm theo tên");
                    System.out.print("Nhập tên xe bạn tìm kiếm: ");
                    String name = scanner.nextLine();
                    car.searchName(name);
                    break;
                case 6:
                    System.out.println("Chức nắng tìm kiếm theo màu");
                    System.out.println("Nhập màu xe bạn muốn tìm kiếm");
                    String color = scanner.nextLine();
                    car.searchColor(color);
                    break;
                case 7:
                    System.out.println("Chức nắng tìm kiếm theo nhà sản xuất");
                    System.out.println("Nhập hãng xe bạn muốn tìm kiếm");
                    String produce = scanner.nextLine();
                    car.searchProducer(produce);
                    break;
                case 0:
                    System.exit(0);
            }
        }while (flag);
    }
}
