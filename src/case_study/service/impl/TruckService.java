package case_study.service.impl;

//import case_study.controller.Option;
import case_study.model.Car;
import case_study.model.Motorcycle;
import case_study.model.Producer;
import case_study.model.Truck;
import case_study.service.ITruckService;
import case_study.util.ProducerDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckService implements ITruckService {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Truck> truckArrayList = new ArrayList<>();

    static {
        truckArrayList.add(new Truck(40, ProducerDTO.producers.get(0), 2000, "Heo", 100));
        truckArrayList.add(new Truck(50, ProducerDTO.producers.get(1), 2005, "Ngựa", 150));
        truckArrayList.add(new Truck(60, ProducerDTO.producers.get(2), 2006, "Chó", 200));
    }

    @Override
    public void display() {
        for (Truck t : truckArrayList) {
            System.out.println(t);
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
        System.out.println("Nhập trọng tải");
        int tonnage = Integer.parseInt(scanner.nextLine());
        truckArrayList.add(new Truck(seaOfControl, producer, year, owner, tonnage));
        display();
    }

    @Override
    public boolean remove(int controlNumber) {
        for (Truck t: truckArrayList) {
            if (t.getSeaOfControl() == controlNumber) {
                truckArrayList.remove(t);
                return true;
            }
        }
        return false;
    }

    @Override
    public Truck findByNumber(int number) {
        for (Truck m: truckArrayList) {
            if (m.getSeaOfControl() == number) {
                return m;
            }
        }
        return null;
    }
}

