package ss2_loop.bai_tap;

import java.util.Scanner;

public class ShowTheFirstPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng snt đầu tiền cần tìm");
        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int n = 2;
        while (count<num){
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                if (n%i==0){
                    flag = false;
                    break;
                }
            }
               if (flag){
                   System.out.println(n);
                   count++;
               }
               n++;
        }
    }
}
