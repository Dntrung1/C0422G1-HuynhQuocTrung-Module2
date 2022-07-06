package service.impl;

import common.Cash;
import common.Check;
import common.ListFacility;
import common.MaKhachHang;
import model.facility.Villa;
import model.other.Booking;
import service.BookingService;
import service.CustomerService;
import until.ReadAndWriteBooking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    Scanner scanner = new Scanner(System.in);
    private static final String PATH_FILE_BOOKING = "src/data/Booking.csv";

    @Override
    public void addBooking() {
        System.out.println("Nhập mã booking");
        String maBooking = scanner.nextLine();
        System.out.println("Ngày đến");
        LocalDate ngayDen = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Ngày đi");
        LocalDate ngayDi;
        boolean flag1= true;
        do {
            ngayDi = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (ngayDen.getDayOfYear()<ngayDi.getDayOfYear()){
                break;
            }
            System.out.println("Ngày đi nhỏ hơn ngay đến +" +
                    "\n nhập lại");
        }while (flag1);

        String maKhachHang;
        CustomerService customerService = new CustomerServiceImpl();
        customerService.display();
        do {
            System.out.println("Nhập mã khách hàng");
            maKhachHang = scanner.nextLine();
            if (MaKhachHang.findMaKhachHang(maKhachHang)) {
                break;
            }
            System.out.println("Không tồn tại nhìn vô display đi thằng ngu");
        } while (true);
        System.out.println("Tên dịch vụ");
        String tenDichVu = scanner.nextLine();
        String loaiDichVu = null;
        boolean flag = true;
        do {
            System.out.println("Loại dịch vụ" +
                    "\n 1. Villa" +
                    "\n 1. House" +
                    "\n 1. Room");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    System.out.println("Villa");
                    ListFacility.displayVilla();
                    do {
                        System.out.println("Mã dịch vụ");
                        loaiDichVu = scanner.nextLine();
                        if (Check.checkMaDichVuVilla(loaiDichVu)) {
                            break;
                        }
                        System.out.println("Nhập lại");
                    } while (true);
                    flag = false;
                    break;
                case "2":
                    System.out.println("House");
                    ListFacility.displayHouse();
                    do {
                        System.out.println("Mã dịch vụ");
                        loaiDichVu = scanner.nextLine();
                        if (Check.checkMaDichVuHouse(loaiDichVu)) {
                            break;
                        }
                        System.out.println("Nhập lại");
                    } while (true);
                    flag = false;
                    break;
                case "3":
                    System.out.println("Room");
                    ListFacility.displayRoom();
                    do {
                        System.out.println("Mã dịch vụ");
                        loaiDichVu = scanner.nextLine();
                        if (Check.checkMaDichVuRoom(loaiDichVu)) {
                            break;
                        }
                        System.out.println("Nhập lại");
                    } while (true);
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập lại");
            }
        } while (flag);
        Set<Booking> bookingSet = new TreeSet<>();
        bookingSet.add(new Booking(maBooking,ngayDen,ngayDi,maKhachHang,tenDichVu,loaiDichVu));
        ReadAndWriteBooking.writeToCSV(bookingSet,PATH_FILE_BOOKING,true);
    }

    @Override
    public void displayBooking() {
        Set<Booking> set = ReadAndWriteBooking.readFileCSV(PATH_FILE_BOOKING);
        for (Booking b: set) {
            System.out.println(b);
        }
    }

    @Override
    public void addContact() {
        String maKhachHang;
        Set<Booking> set = ReadAndWriteBooking.readFileCSV(PATH_FILE_BOOKING);
        System.out.println("số hợp đồng");
        int maHopDong = Integer.parseInt(scanner.nextLine());
        System.out.println("Chọn mã booking");
        displayBooking();
        String maBooking = scanner.nextLine();
        for (Booking b: set) {
            if (maBooking.equals(b.getMaBooking())){
                maKhachHang = b.getMaKhachHang();
            }
        }
        System.out.println("Số tiền đặt cọc");
        double tienDatCoc;
        for (Booking b: set) {
            if (b.getMaBooking().contains("VL")){
                tienDatCoc = Cash.datCocVilla(b.getNgayDen(),b.getNgayDI());
            }else if (b.getMaBooking().contains("HO")){
                tienDatCoc = Cash.datCocHouse(b.getNgayDen(),b.getNgayDI());
            }else if (b.getMaBooking().contains("RO")){
                tienDatCoc = Cash.datCocRoom(b.getNgayDen(),b.getNgayDI());
            }
        }
        System.out.println("Tổng tiền");
        double tongTien;
        for (Booking b: set) {
            if (b.getMaBooking().contains("VL")){
                tongTien = Cash.tongTienVilla(b.getNgayDen(),b.getNgayDI());
            }else if (b.getMaBooking().contains("HO")){
                tongTien = Cash.tongTienHouse(b.getNgayDen(),b.getNgayDI());
            }else if (b.getMaBooking().contains("RO")){
                tongTien = Cash.tongTienRoom(b.getNgayDen(),b.getNgayDI());
            }
        }
    }

    @Override
    public void displayContact() {

    }

    @Override
    public void editContact() {

    }

}