//package case_study.service.impl;
//
//import case_study.controller.Option;
//import case_study.model.*;
//import case_study.service.ICarService;
//import case_study.util.ProducerDTO;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CarService implements ICarService {
//    Scanner scanner = new Scanner(System.in);
//    private static ArrayList<Car> carArrayList = new ArrayList<>();
//
//    static {
//        carArrayList.add(new Car(10, ProducerDTO.producers.get(0), 2022, "Trung", 5, "du lịch"));
//        carArrayList.add(new Car(20, ProducerDTO.producers.get(1), 2022, "Thảo", 5, "xe đua"));
//        carArrayList.add(new Car(30, ProducerDTO.producers.get(2), 2022, "Bò", 5, "Xe ăn cắp"));
//    }
//
//
//    @Override
//    public void display() {
//        for (Car c : carArrayList) {
//            System.out.println(c);
//        }
//    }
//
//    @Override
//    public void add() {
//        System.out.print("Nhập biển kiểm soát: ");
//        int seaOfControl = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập tên hãng sản xuất: ");
//        String producerName = scanner.nextLine();
//        Producer producer = ProducerDTO.checkProducerByName(producerName);
//        System.out.print("Nhập năm sản xuất: ");
//        int year = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập chủ sở hữu: ");
//        String owner = scanner.nextLine();
//        System.out.println("Nhập số lượng chỗ ngỗi");
//        int numberOfSeat = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập loại xe");
//        String oToType = scanner.nextLine();
//        carArrayList.add(new Car(seaOfControl, producer, year, owner, numberOfSeat, oToType));
//        display();
//    }
//
//
//    /**
//     * Cách 2
//     */
//    @Override
//    public boolean remove(int controlNumber) {
//        for (Car c : carArrayList) {
//            if (c.getSeaOfControl() == controlNumber) {
//                carArrayList.remove(c);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public Car findByNumber(int number) {
//        for (Car m : carArrayList) {
//            if (m.getSeaOfControl() == number) {
//                return m;
//            }
//        }
//        return null;
//    }
//
//    public static Car searchByControll(int number) {
//        for (int i = 0; i < carArrayList.size(); i++) {
//            if (carArrayList.get(i).getSeaOfControl()==number){
//                return carArrayList.get(i);
//            }
//        }
//        return null;
//    }
//}
