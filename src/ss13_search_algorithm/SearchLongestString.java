package ss13_search_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchLongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi vào");
        String str = scanner.nextLine();

        ArrayList<Character> listMax = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            for (int j = i+1; j <str.length() ; j++) {
                if (str.charAt(j)>list.get(list.size()-1)){
                    list.add(str.charAt(j));
                }
            }
            if (list.size()>listMax.size()){
                listMax.clear();
                listMax.addAll(list);
            }
            list.clear();
        }
        for (Character c: listMax) {
            System.out.print(c);
        }
    }
}
