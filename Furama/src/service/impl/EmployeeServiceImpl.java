package service.impl;

import common.Check;
import model.person.Employee;
import service.EmployeeService;
import until.ReaAndWriteEmployee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static final String PATH_FILE = "src/data/Employee.csv";

    @Override
    public void edit() {
        List<Employee> employeeList = ReaAndWriteEmployee.readFileCSV(PATH_FILE);
        System.out.println("Chọn mã nhân viên cần chỉnh sữa ");
        String maNhanVien = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien().equals(maNhanVien)) {
                boolean flag = true;
                do {
                    System.out.println("Chọn thông tin cần chỉnh sữa +" +
                            "\n 1. Tên" +
                            "\n 2. Ngày sinh" +
                            "\n 3. Giới tính" +
                            "\n 4. Chứng minh nhân dân" +
                            "\n 5. Số điện thoại" +
                            "\n 6. Email" +
                            "\n 7. Trình độ" +
                            "\n 8. VỊ trí" +
                            "\n 9. Lương" +
                            "\n 10. Thoát chỉnh sữa");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("Nhập tên mới");
                            String name = scanner.nextLine();
                            employeeList.get(i).setName(name);
                            flag = false;
                            break;
                        case "2":
                            System.out.println("Nhập ngày sinh mới");
                            LocalDate ngaySinh = LocalDate.parse(scanner.nextLine());
                            employeeList.get(i).setNgaySinh(ngaySinh);
                            flag = false;
                            break;
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
                            employeeList.get(i).setGioiTinh(gioiTinh);
                            flag = false;
                            break;
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
                            } while (checkCMND(cMND));
                            employeeList.get(i).setcMND(cMND);
                            flag = false;
                            break;
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
                            employeeList.get(i).setPhone(phone);
                            flag = false;
                            break;
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
                            employeeList.get(i).setEmail(email);
                            flag = false;
                            break;
                        case "7":
                            String trinhDo = null;
                            boolean flag2 = true;
                            do {
                                System.out.println(" CHọn Trình độ " +
                                        "\n 1. Trung cấp" +
                                        "\n 2. Cao đẳng" +
                                        "\n 3. Đại học" +
                                        "\n 4. Sau đại học");
                                String choise = scanner.nextLine();
                                switch (choise) {
                                    case "1":
                                        trinhDo = "Trung cấp";
                                        flag2 = false;
                                        break;
                                    case "2":
                                        trinhDo = "Cao đẳng";
                                        flag2 = false;
                                        break;
                                    case "3":
                                        trinhDo = "Đại học";
                                        flag2 = false;
                                        break;
                                    case "4":
                                        trinhDo = "Sau đại học";
                                        flag2 = false;
                                        break;
                                    default:
                                        flag2 = true;
                                }
                            } while (flag2);
                            employeeList.get(i).setTrinhDo(trinhDo);
                            flag = false;
                            break;
                        case "8":
                            String viTri = null;
                            boolean flag3 = true;
                            do {
                                System.out.println(" Chức vụ " +
                                        "\n 1. Lễ tân" +
                                        "\n 2. Phục vụ" +
                                        "\n 3. Chuyên viên" +
                                        "\n 4. Giám sát" +
                                        "\n 5. Quản lý" +
                                        "\n 6. Giám đốc");
                                String choose1 = scanner.nextLine();
                                switch (choose1) {
                                    case "1":
                                        viTri = "Lễ tân";
                                        flag3 = false;
                                        break;
                                    case "2":
                                        viTri = "Phục vụ";
                                        flag3 = false;
                                        break;
                                    case "3":
                                        viTri = "Chuyên viên";
                                        flag3 = false;
                                        break;
                                    case "4":
                                        viTri = "Giám sát";
                                        flag3 = false;
                                        break;
                                    case "5":
                                        viTri = "Quản lý";
                                        flag3 = false;
                                        break;
                                    case "6":
                                        viTri = "Giám đốc";
                                        flag3 = false;
                                        break;
                                    default:
                                        flag3 = true;
                                }
                            } while (flag3);
                            employeeList.get(i).setViTri(viTri);
                            flag = false;
                            break;
                        case "9":
                            System.out.println("Nhập lương mới");
                            double luong = Double.parseDouble(scanner.nextLine());
                            employeeList.get(i).setLuong(luong);
                            flag = false;
                            break;
                        default:
                            flag = true;
                    }
                } while (flag);
            }
            ReaAndWriteEmployee.writeToCSV(employeeList, PATH_FILE, false);
        }
    }

    @Override
    public void add() {
        String maNhanVien;
        do {
            do {
                System.out.println(" Nhập mã nhân viên");
                maNhanVien = scanner.nextLine();
                if (Check.checkMa(maNhanVien)) {
                    break;
                }
                System.out.println("Mã không hợp lên");
            } while (true);
        } while (checkEmployeeCode(maNhanVien));


        String gioiTinh = null;
        boolean flag4 = true;
        do {
            System.out.println("Giới tính" +
                    "\n 1. Nam" +
                    "\n 2. Nữ");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    gioiTinh = "Nam";
                    flag4 = false;
                    break;
                case "2":
                    gioiTinh = "Nữ";
                    flag4 = false;
                    break;
                default:
                    flag4 = true;
            }
        } while (flag4);

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
                ngaySinh = LocalDate.parse(scanner.nextLine());
                flag = false;
            } catch (Exception e) {
                System.out.println("(yy//mm//dd)");
                flag = true;
            }
        } while (flag);

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
        } while (checkCMND(cMND));

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

        String trinhDo = null;
        boolean flag1 = true;
        do {
            System.out.println(" CHọn Trình độ " +
                    "\n 1. Trung cấp" +
                    "\n 2. Cao đẳng" +
                    "\n 3. Đại học" +
                    "\n 4. Sau đại học");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    trinhDo = "Trung cấp";
                    flag1 = false;
                    break;
                case "2":
                    trinhDo = "Cao đẳng";
                    flag1 = false;
                    break;
                case "3":
                    trinhDo = "Đại học";
                    flag1 = false;
                    break;
                case "4":
                    trinhDo = "Sau đại học";
                    flag1 = false;
                    break;
                default:
                    flag1 = true;
            }
        } while (flag1);

        String viTri = null;
        boolean flag2 = true;
        do {
            System.out.println(" Chức vụ " +
                    "\n 1. Lễ tân" +
                    "\n 2. Phục vụ" +
                    "\n 3. Chuyên viên" +
                    "\n 4. Giám sát" +
                    "\n 5. Quản lý" +
                    "\n 6. Giám đốc");
            String choose1 = scanner.nextLine();
            switch (choose1) {
                case "1":
                    viTri = "Lễ tân";
                    flag2 = false;
                    break;
                case "2":
                    viTri = "Phục vụ";
                    flag2 = false;
                    break;
                case "3":
                    viTri = "Chuyên viên";
                    flag2 = false;
                    break;
                case "4":
                    viTri = "Giám sát";
                    flag2 = false;
                    break;
                case "5":
                    viTri = "Quản lý";
                    flag2 = false;
                    break;
                case "6":
                    viTri = "Giám đốc";
                    flag2 = false;
                    break;
                default:
                    flag2 = true;
            }
        } while (flag2);
        System.out.println("Nhập lương");
        double luong = Double.parseDouble(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(name, ngaySinh, gioiTinh, cMND, phone, email, maNhanVien, trinhDo, viTri, luong));
        ReaAndWriteEmployee.writeToCSV(employeeList, PATH_FILE, true);
    }

    @Override
    public void display() {
        List<Employee> employeeList = ReaAndWriteEmployee.readFileCSV(PATH_FILE);
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((i + 1) + ". " + employeeList.get(i).toString());
        }
    }

    public boolean checkEmployeeCode(String code) {
        List<Employee> employeeList = ReaAndWriteEmployee.readFileCSV(PATH_FILE);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getMaNhanVien().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCMND(String cMND) {
        List<Employee> employeeList = ReaAndWriteEmployee.readFileCSV(PATH_FILE);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getcMND().equals(cMND)) {
                return true;
            }
        }
        return false;
    }
}
