package service.impl;

import common.Check;
import model.facility.Facility;
import model.facility.House;
import until.ReadAndWriteFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HouseServiceImpl {
    private static final String PATH_FILE_FACILITY = "src/data/Facility.csv";
    public static void addHouse(){
        Map<Facility,Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New House");
        System.out.println("Nhập tên dịch vụ");
        String tenDichVuHouse =scanner.nextLine();
        System.out.println("Diện tích sử dụng");
        Double dienTichSudungHouse = Double.parseDouble(scanner.nextLine());
        System.out.println("Chi phí thuê");
        Double chiPhiHouse = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        Byte soLuongNguoiToiDaHouse = Byte.parseByte(scanner.nextLine());
        String kieuThueHouse = null;
        boolean flag2 = true;
        do {
            System.out.println("Kiểu thuê" +
                    "\n 1. Theo năm"+
                    "\n 2. Theo tháng" +
                    "\n 3. Theo ngày" +
                    "\n 4. Theo giờ");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    kieuThueHouse = "Theo năm";
                    flag2 = false;
                    break;
                case "2":
                    kieuThueHouse = "Theo tháng";
                    flag2 = false;
                    break;
                case "3":
                    kieuThueHouse = "Theo ngày";
                    flag2 = false;
                    break;
                case "4":
                    kieuThueHouse = "Theo giờ";
                    flag2 = false;
                    break;
                default:
            }
        }while (flag2);
        String maDichVuHouse;
        do {
            System.out.println("Nhập mã dịch vụ");
            maDichVuHouse = scanner.nextLine();
           if (Check.checkMaDichVuHouse(maDichVuHouse)){
               break;
           }
            System.out.println("Nhập lại");
        }while (true);

        System.out.println("Tiêu chuẩn phòng");
        String tieuChuanPhongHouse = scanner.nextLine();
        System.out.println("Số tầng");
        Byte soTangHouse = Byte.parseByte(scanner.nextLine());
        map.put((new House(tenDichVuHouse,dienTichSudungHouse,chiPhiHouse,soLuongNguoiToiDaHouse,kieuThueHouse,maDichVuHouse,tieuChuanPhongHouse,soTangHouse)),0);
        ReadAndWriteFacility.writeToCSV(map,PATH_FILE_FACILITY,true);
    }
}
