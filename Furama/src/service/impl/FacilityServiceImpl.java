package service.impl;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import service.FacilityService;
import until.ReadAndWriteFacility;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static final String PATH_FILE_FACILITY = "src/data/Facility.csv";
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void displayListFacilityMaintenance() {
    }
    @Override
    public void add() {
        Map<Facility,Integer> map = new LinkedHashMap<>();
        boolean flag = true;
        do {
            System.out.println("Dịch vụ muốn thêm" +
                    "\n 1. Add New Villa" +
                    "\n 2. Add New House" +
                    "\n 3. Add New Room" +
                    "\n 4. Back to menu");
            System.out.println("Chọn chức năng");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "1":
                    VillaServiceImpl.addVilla();
                    break;
                case "2":
                    HouseServiceImpl.addHouse();
                    break;
                case "3":
                   RoomServiceImpl.addRoom();
                    break;
                case "4":
                    return;
                default:
                    System.err.println("Nhập lại");
            }
        } while (flag);
    }

    @Override
    public void display() {
        Map<Facility,Integer> map = ReadAndWriteFacility.readFileCSV(PATH_FILE_FACILITY);
        Set<Facility>facilitySet = map.keySet();
        for (Facility f : facilitySet) {
            System.out.println(f +","+ map.get(f));
        }
    }
}
