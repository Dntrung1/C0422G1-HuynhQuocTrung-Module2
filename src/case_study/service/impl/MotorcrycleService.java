//package case_study.service.impl;
//
//import case_study.controller.Option;
//import case_study.model.Motorcycle;
//import case_study.model.Producer;
//import case_study.service.IMotorcycleSevrice;
//import case_study.util.ProducerDTO;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MotorcrycleService implements IMotorcycleSevrice {
//    Scanner scanner = new Scanner(System.in);
//    private static ArrayList<Motorcycle> motorcycleArrayList = new ArrayList<>();
//    static {
//        motorcycleArrayList.add(new Motorcycle(70,ProducerDTO.producers.get(0),2010,"Chó",150));
//        motorcycleArrayList.add(new Motorcycle(80,ProducerDTO.producers.get(1),2011,"mèo",50));
//        motorcycleArrayList.add(new Motorcycle(90,ProducerDTO.producers.get(2),2012,"chim",80));
//    }
//    @Override
//    public void display() {
//        for (Motorcycle m: motorcycleArrayList) {
//            System.out.println(m);
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
//        System.out.println("Nhập công suất");
//        int wattage = Integer.parseInt(scanner.nextLine());
//        motorcycleArrayList.add(new Motorcycle(seaOfControl,producer,year,owner,wattage));
//        display();
//    }
//
//    /**
//     * Cách 2
//     */
//    @Override
//    public boolean remove(int controlNumber) {
//        for (Motorcycle m: motorcycleArrayList) {
//            if (m.getSeaOfControl() == controlNumber) {
//                motorcycleArrayList.remove(m);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public Motorcycle findByNumber(int number) {
//        for (Motorcycle m: motorcycleArrayList) {
//            if (m.getSeaOfControl() == number) {
//                return m;
//            }
//        }
//        return null;
//    }
//
//    public static ArrayList<Motorcycle> getList() {
//        return motorcycleArrayList;
//    }
//}
