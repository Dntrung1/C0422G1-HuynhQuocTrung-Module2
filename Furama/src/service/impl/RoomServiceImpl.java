package service.impl;

import common.Check;
import model.facility.Facility;
import model.facility.Room;
import until.ReadAndWriteFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RoomServiceImpl {
    private static final String PATH_FILE_FACILITY = "src/data/Facility.csv";

    public static void addRoom() {
        Scanner scanner = new Scanner(System.in);
        Map<Facility, Integer> map = new LinkedHashMap<>();
        System.out.println("Add New Room");
        System.out.println("Nhập tên dịch vụ");
        String tenDichVuRoom = scanner.nextLine();
        System.out.println("Diện tích sử dụng");
        Double dienTichSudungRoom = Double.parseDouble(scanner.nextLine());
        System.out.println("Chi phí thuê");
        Double chiPhiRoom = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        Byte soLuongNguoiToiDaRoom = Byte.parseByte(scanner.nextLine());
        String kieuThueRoom = null;
        boolean flag3 = true;
        do {
            System.out.println("Kiểu thuê" +
                    "\n 1. Theo năm" +
                    "\n 2. Theo tháng" +
                    "\n 3. Theo ngày" +
                    "\n 4. Theo giờ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    kieuThueRoom = "Theo năm";
                    flag3 = false;
                    break;
                case "2":
                    kieuThueRoom = "Theo tháng";
                    flag3 = false;
                    break;
                case "3":
                    kieuThueRoom = "Theo ngày";
                    flag3 = false;
                    break;
                case "4":
                    kieuThueRoom = "Theo giờ";
                    flag3 = false;
                    break;
                default:
            }
        } while (flag3);
        String maDichVuRoom;
        do {
            System.out.println("Nhập mã dịch vụ");
            maDichVuRoom = scanner.nextLine();
            if (Check.checkMaDichVuRoom(maDichVuRoom)){
                break;
            }
            System.out.println("Nhập lại");
        }while (true);
        System.out.println("Dich vụ Miễn phí");
        String dichVuMienPhiRoom = scanner.nextLine();
        Map<Facility, Integer> map2 = new LinkedHashMap<>();
        map2.put((new Room(tenDichVuRoom, dienTichSudungRoom, chiPhiRoom, soLuongNguoiToiDaRoom, kieuThueRoom,maDichVuRoom, dichVuMienPhiRoom)), 0);
        ReadAndWriteFacility.writeToCSV(map2, PATH_FILE_FACILITY, true);
    }
}
