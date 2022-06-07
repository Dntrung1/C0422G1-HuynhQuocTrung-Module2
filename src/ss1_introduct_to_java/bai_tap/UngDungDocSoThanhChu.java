package ss1_introduct_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số");
        int n = Integer.parseInt(scanner.nextLine());
        String number = "";
        if (n < 10) {
            switch (n) {
                case 0:
                    number = "Zero";
                    break;
                case 1:
                    number = "One";
                    break;
                case 2:
                    number = "two";
                    break;
                case 3:
                    number = "three";
                    break;
                case 4:
                    number = "Four";
                    break;
                case 5:
                    number = "five";
                    break;
                case 6:
                    number = "six";
                    break;
                case 7:
                    number = "seven";
                    break;
                case 8:
                    number = "eight";
                    break;
                case 9:
                    number = "nine";
                    break;
                default:
                    number = "out of ability";
            }
            System.out.println(number);
        } else if (n < 20) {
            switch (n) {
                case 10:
                    number = "ten";
                    break;
                case 11:
                    number = "eleven";
                    break;
                case 12:
                    number = "twelve";
                    break;
                case 13:
                    number = "thirteen";
                    break;
                case 14:
                    number = "fourteen";
                    break;
                case 15:
                    number = "fifteen";
                    break;
                case 16:
                    number = "sixteen";
                    break;
                case 17:
                    number = "seventeen";
                    break;
                case 18:
                    number = "eighteen";
                    break;
                case 19:
                    number = "nineteen";
                    break;
            }
            System.out.println(number);
        } else if (n < 100) {
            int dozen = n / 10;
            int unit = n % 10;
            String number1 = "";
            String number2 = "";
            switch (dozen) {
                case 2:
                    number1 = "twenty";
                    break;
                case 3:
                    number1 = "thirty";
                    break;
                case 4:
                    number1 = "fourty";
                    break;
                case 5:
                    number1 = "fifty";
                    break;
                case 6:
                    number1 = "sixty";
                    break;
                case 7:
                    number1 = "seventy";
                    break;
                case 8:
                    number1 = "eighty";
                    break;
                case 9:
                    number1 = "ninety";
                    break;
            }
            switch (unit) {
                case 1:
                    number2 = "one";
                    break;
                case 2:
                    number2 = "two";
                    break;
                case 3:
                    number2 = "three";
                    break;
                case 4:
                    number2 = "four";
                    break;
                case 5:
                    number2 = "five";
                    break;
                case 6:
                    number2 = "six";
                    break;
                case 7:
                    number2 = "seven";
                    break;
                case 8:
                    number2 = "eight";
                    break;
                case 9:
                    number2 = "nine";
                    break;
            }
            System.out.println(number1 + number2);
        } else if (n < 1000) {
            int hundred = n / 100;
            int x = n % 100;
            int dozen = x / 10;
            int unit = x % 10;
            String number3 = "";
            String number4 = "";
            String number5 = "";
            String number6 = "";
            String number7 = "";
            switch (hundred) {
                case 1:
                    number3 = "One hundred";
                    break;
                case 2:
                    number3 = "two hundred";
                    break;
                case 3:
                    number3 = "three hundred";
                    break;
                case 4:
                    number3 = "four hundred";
                    break;
                case 5:
                    number3 = "five hundred";
                    break;
                case 6:
                    number3 = "six hundred";
                    break;
                case 7:
                    number3 = "seven hundred";
                    break;
                case 8:
                    number3 = "eight hundred";
                    break;
                case 9:
                    number3 = "nine hundred";
                    break;
            }
            if (x < 10) {
                switch (x) {
                    case 1:
                        number7 = "One";
                        break;
                    case 2:
                        number7 = "two";
                        break;
                    case 3:
                        number7 = "three";
                        break;
                    case 4:
                        number7 = "Four";
                        break;
                    case 5:
                        number7 = "five";
                        break;
                    case 6:
                        number7 = "six";
                        break;
                    case 7:
                        number7 = "seven";
                        break;
                    case 8:
                        number7 = "eight";
                        break;
                    case 9:
                        number7 = "nine";
                        break;
                }
                System.out.println(number3 + " and " + number7);
            } else if (x < 20) {
                switch (x) {
                    case 10:
                        number6 = "ten";
                        break;
                    case 11:
                        number6 = "eleven";
                        break;
                    case 12:
                        number6 = "twelve";
                        break;
                    case 13:
                        number6 = "thirteen";
                        break;
                    case 14:
                        number6 = "fourteen";
                        break;
                    case 15:
                        number6 = "fifteen";
                        break;
                    case 16:
                        number6 = "sixteen";
                        break;
                    case 17:
                        number6 = "seventeen";
                        break;
                    case 18:
                        number6 = "eighteen";
                        break;
                    case 19:
                        number6 = "nineteen";
                        break;
                }
                System.out.println(number3 + " and " + number6);
            } else {
                switch (dozen) {
                    case 1:
                        number4 = "ten";
                        break;
                    case 2:
                        number4 = "twenty";
                        break;
                    case 3:
                        number4 = "thirty";
                        break;
                    case 4:
                        number4 = "fourty";
                        break;
                    case 5:
                        number4 = "fifty";
                        break;
                    case 6:
                        number4 = "sixty";
                        break;
                    case 7:
                        number4 = "seventy";
                        break;
                    case 8:
                        number4 = "eighty";
                        break;
                    case 9:
                        number4 = "ninety";
                        break;
                }
                switch (unit) {
                    case 1:
                        number5 = "one";
                        break;
                    case 2:
                        number5 = "two";
                        break;
                    case 3:
                        number5 = "three";
                        break;
                    case 4:
                        number5 = "four";
                        break;
                    case 5:
                        number5 = "five";
                        break;
                    case 6:
                        number5 = "six";
                        break;
                    case 7:
                        number5 = "seven";
                        break;
                    case 8:
                        number5 = "eight";
                        break;
                    case 9:
                        number5 = "nine";
                        break;
                }
                System.out.println(number3 + " and " + number4 + number5);
            }
        }else
            System.out.println("out of ability");
    }
}
