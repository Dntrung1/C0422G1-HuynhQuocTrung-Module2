package ss1_introduct_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuyển đổi tiền tệ");
        System.out.println("Nhập vào tiền cần đổi");
        long usd = Long.parseLong(scanner.nextLine());
        long vnd = usd * 23000;
        System.out.println(vnd);
    }
}
