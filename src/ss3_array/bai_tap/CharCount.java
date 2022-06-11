package ss3_array.bai_tap;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhập 1 chuỗi ký tự");
        String str = scanner.nextLine();
        System.out.println("nhập ký tự muốn đếm");
        char c = scanner.nextLine().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                count++;
            }
        }
        System.out.println(str.length());
        System.out.println(count);
        if (count==0){
            System.out.println("Không có ký tự trong mảng");
        }
    }
}
