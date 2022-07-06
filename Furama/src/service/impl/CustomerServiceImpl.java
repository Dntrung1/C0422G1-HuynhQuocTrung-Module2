package service.impl;

import common.CMND;
import common.Check;
import controller.FuramaController;
import model.person.Customer;
import service.CustomerService;
import until.ReadAndWriteCustomer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    private static final String PATH_FILE = "src/data/Customer.csv";
    @Override
    public void add() {
        String maKhachHang;
        do {
            do {
                System.out.println(" Nhập mã nhân viên");
                maKhachHang = scanner.nextLine();
                if (Check.checkMa(maKhachHang)) {
                    break;
                }
                System.out.println("Mã không hợp lên");
            } while (true);
        } while (checkCustomerCode(maKhachHang));
        String name;
        do {
            System.out.println("Nhập tên");
            name = scanner.nextLine();
            if (Check.checkName(name)) {
                break;
            }
            System.out.println("Tên không hợp lệ");
        } while (true);

        LocalDate ngaySinh = null;
        boolean flag = true;
        do {
            try {
                System.out.println("Nhập ngày sinh");
                ngaySinh = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                if (ngaySinh.until(LocalDate.now()).getYears()<18||ngaySinh.until(LocalDate.now()).getYears()>100){
                    System.out.println("Nhập lại");
                    flag= true;
                }else {
                    flag = false;
                }
            } catch (NumberFormatException e) {

            }
        } while (flag);

        String gioiTinh = null;
        boolean flag1 = true;
        do {
            System.out.println("Giới tính" +
                    "\n 1. Nam" +
                    "\n 2. Nữ");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    gioiTinh = "Nam";
                    flag1 = false;
                    break;
                case "2":
                    gioiTinh = "Nữ";
                    flag1 = false;
                    break;
                default:
                    flag1 = true;
            }
        } while (flag1);

        String cMND;
        do {
            do {
                System.out.println("Nhập số Chưng minh nhân dân");
                cMND = scanner.nextLine();
                if (Check.checkCMND(cMND)) {
                    break;
                }
                System.out.println("Không hợp lệ");
            } while (true);
        } while (CMND.checkId(cMND));

        String phone;
        do {
            System.out.println("Nhập số điện thoại");
            phone = scanner.nextLine();
            if (Check.checkPhone(phone)) {
                break;
            }
            System.out.println("Không hợp lệ");
        } while (true);

        String email;
        do {
            System.out.println("Nhập Email");
            email = scanner.nextLine();
            if (Check.checkEmail(email)) {
                break;
            }
            System.out.println("Không hợp lệ");
        } while (true);

        String loaiKhach = null;
        boolean flag2 = true;
        do {
            System.out.println(" Loại khách " +
                    "\n 1. Diamond" +
                    "\n 2. Platinium" +
                    "\n 3. Gold" +
                    "\n 3. Silver" +
                    "\n 4. Member");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    loaiKhach = "Diamond";
                    flag2 = false;
                    break;
                case "2":
                    loaiKhach = "Platinium";
                    flag2 = false;
                    break;
                case "3":
                    loaiKhach = "Gold";
                    flag2 = false;
                    break;
                case "4":
                    loaiKhach = "Silver";
                    flag2 = false;
                    break;
                case "5":
                    loaiKhach = "Member";
                    flag2 = false;
                    break;
                default:
                    flag2 = true;
            }
        } while (flag2);

        System.out.println("Địa chỉ");
        String diaChi = scanner.nextLine();
        List<Customer> customerList = new LinkedList<>();
        customerList.add(new Customer(name, ngaySinh, gioiTinh, cMND, phone, email, maKhachHang,loaiKhach,diaChi));
        ReadAndWriteCustomer.writeToCSV(customerList,PATH_FILE,true);
    }
    @Override
    public void display() {
        List<Customer> customerList = ReadAndWriteCustomer.readFileCSV(PATH_FILE);
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i).toString());
        }
    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteCustomer.readFileCSV(PATH_FILE);
        System.out.println("Chọn mã nhân viên cần chỉnh sữa ");
        String maNhanVien = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKhachHang().equals(maNhanVien)) {
                boolean flag = true;
                do {
                    System.out.println("Chọn thông tin cần chỉnh sữa " +
                            "\n 1. Tên" +
                            "\n 2. Ngày sinh" +
                            "\n 3. Giới tính" +
                            "\n 4. Chứng minh nhân dân" +
                            "\n 5. Số điện thoại" +
                            "\n 6. Email" +
                            "\n 7. Loại Khách" +
                            "\n 8. Địa chỉ" +
                            "\n 9. Thoát chỉnh sữa");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("Nhập tên mới");
                            String name = scanner.nextLine();
                            customerList.get(i).setName(name);
                        case "2":
                            System.out.println("Nhập ngày sinh mới");
                            LocalDate ngaySinh = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            customerList.get(i).setNgaySinh(ngaySinh);
                        case "3":
                            System.out.println("Chọn lại giới tính");
                            String gioiTinh = null;
                            boolean flag1 = true;
                            do {
                                System.out.println(" 1. Nam" +
                                        "\n 2. Nữ");
                                String choise = scanner.nextLine();
                                switch (choise) {
                                    case "1":
                                        gioiTinh = "Nam";
                                        flag1 = false;
                                        break;
                                    case "2":
                                        gioiTinh = "Nữ";
                                        flag1 = false;
                                        break;
                                    default:
                                        flag1 = true;
                                }
                            } while (flag1);
                            customerList.get(i).setGioiTinh(gioiTinh);
                        case "4":
                            String cMND;
                            do {
                                do {
                                    System.out.println("Nhập lại chứng minh nhân dân");
                                    cMND = scanner.nextLine();
                                    if (Check.checkCMND(cMND)) {
                                        break;
                                    }
                                    System.out.println("Không hợp lệ");
                                } while (true);
                            } while (CMND.checkId(cMND));
                            customerList.get(i).setCMND(cMND);
                            flag = false;
                        case "5":
                            String phone;
                            do {
                                System.out.println("Nhập lại số điện thoại");
                                phone = scanner.nextLine();
                                if (Check.checkPhone(phone)) {
                                    break;
                                }
                                System.out.println("Không hợp lệ");
                            } while (true);
                            customerList.get(i).setPhone(phone);
                        case "6":
                            String email;
                            do {
                                System.out.println("Nhập lại Email");
                                email = scanner.nextLine();
                                if (Check.checkEmail(email)) {
                                    break;
                                }
                                System.out.println("Không hợp lệ");
                            } while (true);
                            customerList.get(i).setEmail(email);
                        case "7":
                            String loaiKhach = null;
                            boolean flag2 = true;
                            do {
                                System.out.println(" Loại khách " +
                                        "\n 1. Diamond" +
                                        "\n 2. Platinium" +
                                        "\n 3. Gold" +
                                        "\n 3. Silver" +
                                        "\n 4. Member");
                                String choise = scanner.nextLine();
                                switch (choise) {
                                    case "1":
                                        loaiKhach = "Diamond";
                                        flag2 = false;
                                        break;
                                    case "2":
                                        loaiKhach = "Platinium";
                                        flag2 = false;
                                        break;
                                    case "3":
                                        loaiKhach = "Gold";
                                        flag2 = false;
                                        break;
                                    case "4":
                                        loaiKhach = "Silver";
                                        flag2 = false;
                                        break;
                                    case "5":
                                        loaiKhach = "Member";
                                        flag2 = false;
                                    default:
                                        flag2 = true;
                                }
                            } while (flag2);
                            customerList.get(i).setLoaiKhach(loaiKhach);
                        case "8":
                            System.out.println("Nhập đia chỉ");
                            String diaChi = scanner.nextLine();
                            customerList.get(i).setDiaChi(diaChi);
                        case "9":
                            FuramaController.displayMenu();
                        default:
                            flag = true;
                    }
                } while (flag);
            }
            ReadAndWriteCustomer.writeToCSV(customerList, PATH_FILE, false);
        }
    }
    public boolean checkCustomerCode(String code) {
        List<Customer> customerList = ReadAndWriteCustomer.readFileCSV(PATH_FILE);
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKhachHang().equals(code)) {
                return true;
            }
        }
        return false;
    }
}
