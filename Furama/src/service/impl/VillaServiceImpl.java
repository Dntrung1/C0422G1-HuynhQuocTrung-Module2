package service.impl;

import common.Check;
import model.facility.Facility;
import model.facility.Villa;
import until.ReadAndWriteFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VillaServiceImpl {
    private static final String PATH_FILE_FACILITY = "src/data/Facility.csv";
    public static void addVilla(){
        Map<Facility,Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add New Villa");
        System.out.println("Nhập tên dịch vụ");
        String tenDichVuVilla =scanner.nextLine();
        System.out.println("Diện tích sử dụng");
        Double dienTichSudungVilla = Double.parseDouble(scanner.nextLine());
        System.out.println("Chi phí thuê");
        Double chiPhiVilla = Double.parseDouble(scanner.nextLine());
        System.out.println("Số lượng người tối đa");
        Byte soLuongNguoiToiDaVilla = Byte.parseByte(scanner.nextLine());
        String kieuThueVilla = null;
        boolean flag1 = true;
        do {
            System.out.println("Kiểu thuê" +
                    "\n 1. Theo năm"+
                    "\n 2. Theo tháng" +
                    "\n 3. Theo ngày" +
                    "\n 4. Theo giờ");
            String choose = scanner.nextLine();
            switch (choose){
                case "1":
                    kieuThueVilla = "Theo năm";
                    flag1 = false;
                    break;
                case "2":
                    kieuThueVilla = "Theo tháng";
                    flag1 = false;
                    break;
                case "3":
                    kieuThueVilla = "Theo ngày";
                    flag1 = false;
                    break;
                case "4":
                    kieuThueVilla = "Theo giờ";
                    flag1 = false;
                    break;
                default:
            }
        }while (flag1);
        String maDichVuVilla;
        do {
            System.out.println("Nhập mã dịch vụ");
            maDichVuVilla = scanner.nextLine();
            if (Check.checkMaDichVuVilla(maDichVuVilla)){
                break;
            }
            System.out.println("Nhập lại");
        }while (true);
        System.out.println("Tiêu chuẩn phòng");
        String tieuChuanPhongVilla = scanner.nextLine();
        System.out.println("Diện tích hồ bơi");
        Double dienTichHoBoiVilla = Double.parseDouble(scanner.nextLine());
        System.out.println("Số tầng");
        Byte soTangVilla = Byte.parseByte(scanner.nextLine());
        Villa villa = new Villa(tenDichVuVilla,dienTichSudungVilla,chiPhiVilla,
                soLuongNguoiToiDaVilla,kieuThueVilla, maDichVuVilla,tieuChuanPhongVilla,dienTichHoBoiVilla,soTangVilla);
        map.put(villa,0);
        ReadAndWriteFacility.writeToCSV(map,PATH_FILE_FACILITY,true);
    }


}
