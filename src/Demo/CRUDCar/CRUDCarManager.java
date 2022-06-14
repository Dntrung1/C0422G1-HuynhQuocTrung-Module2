package Demo.CRUDCar;

import java.util.Scanner;

public class CRUDCarManager {
    static Scanner scanner = new Scanner(System.in);
    static Car[] cars = new Car[100];

//    static {
//        cars[0] = new Car( 1,"Honda", "Red", "Honda");
//        cars[1] = new Car(2,"BMW", "Black", "BMW");
//    }

    public void display() {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có gi để hiển thị");
        } else {
            for (Car c : cars) {
                if (c != null) {
                    System.out.println(c);
                } else
                    break;
            }
        }

    }

    public void add() {
//        System.out.println("nhập id");
//        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên xe");
        String name = scanner.nextLine();
        System.out.println("Nhập màu xe");
        String color = scanner.nextLine();
        System.out.println("Nhập hãng xe");
        String producer = scanner.nextLine();
        Car car = new Car(Car.count, name, color, producer);
        for (int j = 0; j < cars.length; j++) {
            if (cars[j] == null) {
                cars[j] = car;
                break;
            }
        }
        display();

    }

    public void delete() {
        System.out.println("Nhập id cần xóa xóa");
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0 || num > 100) {
            System.out.println("Không có stt trong mảng");
        } else {
            for (int i = 0; i < Car.count; i++) {
                if (cars[i] != null) {
                    if (num == cars[i].getId()) {
                        for (int j = i; j < cars.length - 1; j++) {
                            cars[j] = cars[j + 1];
                        }
                        cars[cars.length - 1] = null;

                    }
                    Car.setCount(Car.getCount()-1);
//                    for (int j = i; j < cars.length-1; j++) {
//                        cars[j].setId(cars[j+1].getId());
//                    }
                }

            }
        }
        display();
    }

    public void edit() {
        System.out.println("Nhập stt cần sữa");
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0 || num > 100) {
            System.out.println("Không có stt trong mảng");
        } else {
            System.out.println("Nhập lại id mới");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập lại tên mới");
            String name = scanner.nextLine();
            System.out.println("Nhập lại màu xe");
            String color = scanner.nextLine();
            System.out.println("Nhập lại nhà sản xuất");
            String producer = scanner.nextLine();
            Car car = new Car(id, name, color, producer);
            for (int i = 0; i < cars.length; i++) {
                if (num == i) {
                    cars[i] = car;
                }
            }
        }
        display();
    }

    public void searchName(String name) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                if (name.equalsIgnoreCase(cars[i].getName())) {
                    System.out.println(cars[i]);
                }
            } else
                break;

        }
    }

    public void searchColor(String color) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                if (color.equals(cars[i].getColor())) {
                    System.out.println(cars[i]);
                }
            } else
                break;
        }
    }

    public void searchProducer(String producer) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                if (producer.equals(cars[i].getProducer())) {
                    System.out.println(cars[i]);
                }
            } else
                break;
        }
    }
}
