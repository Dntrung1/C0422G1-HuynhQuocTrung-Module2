package case_study.service.impl;

import case_study.controller.Option;
import case_study.model.Car;
import case_study.model.Producer;
import case_study.model.Vehicle;
import case_study.service.ICarService;
import case_study.util.ProducerDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class CarService implements ICarService {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Car> carArrayList = new ArrayList<>();
    static {
        carArrayList.add(new Car(10,ProducerDTO.producers.get(0),2022,"Trung",5,"du lịch"));
        carArrayList.add(new Car(20,ProducerDTO.producers.get(1),2022,"Thảo",5,"xe đua"));
        carArrayList.add(new Car(30,ProducerDTO.producers.get(2),2022,"Bò",5,"Xe ăn cắp"));
    }
    @Override
    public void display() {
        for (Car c: carArrayList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập biển kiểm soát: ");
        int seaOfControl = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên hãng sản xuất: ");
        String producerName = scanner.nextLine();
        Producer producer = ProducerDTO.checkProducerByName(producerName);
        System.out.print("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.println("Nhập số lượng chỗ ngỗi");
        int numberOfSeat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập loại xe");
        String oToType = scanner.nextLine();
        carArrayList.add(new Car(seaOfControl, producer, year, owner,numberOfSeat,oToType));
        display();
    }
//    @Override
//    public void edit() {
//        display();
//        System.out.println("Chọn biển kiểm soát xe ô tô cần sửa");
//        int editSeatOfControl=Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < carArrayList.size(); i++) {
//            if (editSeatOfControl==carArrayList.get(i).getSeaOfControl()){
//                System.out.println("Nhập lại tên hãng sản xuất");
//                String producerName = scanner.nextLine();
//                Producer producer = ProducerDTO.checkProducerByName(producerName);
//                carArrayList.get(i).setProducer(producer);
//                System.out.print("Nhập lại năm sản xuất: ");
//                carArrayList.get(i).setYear(Integer.parseInt(scanner.nextLine()));
//                System.out.print("Nhập lại chủ sở hữu: ");
//                carArrayList.get(i).setOwner(scanner.nextLine());
//                System.out.println("Nhập số lượng chỗ ngồi");
//                carArrayList.get(i).setNumberOfSeat(Integer.parseInt(scanner.nextLine()));
//                System.out.println("Nhập loại xe");
//                carArrayList.get(i).setoToType(scanner.nextLine());
//                break;
//            }
//        }
//        display();
//    }

}
