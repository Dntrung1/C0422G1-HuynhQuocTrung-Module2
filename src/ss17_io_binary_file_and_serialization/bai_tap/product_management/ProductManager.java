package ss17_io_binary_file_and_serialization.bai_tap.product_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    public static void add(){
        System.out.println("Nhập mã sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String nameProduct= scanner.nextLine();
        System.out.println("Nhà sản xuất");
        String producer = scanner.nextLine();
        System.out.println("Giá");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Mô tả thêm");
        String describe = scanner.nextLine();
        Product product = new Product(id,nameProduct,producer,price,describe);
        List<Product> products1 = ReadAndWrite.readFileProduct("src/ss17_io_binary_file_and_serialization/bai_tap/product_management/Product.dat");
        products1.add(product);
        ReadAndWrite.writeFileProduct(products1,"src/ss17_io_binary_file_and_serialization/bai_tap/product_management/Product.dat");
    }

    public static void display(){
    List<Product> productList =  ReadAndWrite.readFileProduct("src/ss17_io_binary_file_and_serialization/bai_tap/product_management/Product.dat");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i).toString());
        }
    }

    public static void searchCode(){
        System.out.println("Nhập mã sản phẩm cần tìm kiếm");
        int codeName = Integer.parseInt(scanner.nextLine());
        List<Product> list = ReadAndWrite.readFileProduct("src/ss17_io_binary_file_and_serialization/bai_tap/product_management/Product.dat");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCodeProduct()==codeName){
                System.out.println(list.get(i).toString());
                return;
            }
        }
        System.out.println("Không có");
    }

    public static void searchName(){
        System.out.println("tên");
        String name = scanner.nextLine();
        List<Product> list = ReadAndWrite.readFileProduct("src/ss17_io_binary_file_and_serialization/bai_tap/product_management/Product.dat");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameProduct().equals(name)){
                System.out.println(list.get(i).toString());
                return;
            }
        }
        System.out.println("0 có");
    }


}
