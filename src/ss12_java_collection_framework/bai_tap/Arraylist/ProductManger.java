package ss12_java_collection_framework.bai_tap.Arraylist;

import java.util.*;

public class ProductManger {
    Scanner scanner = new Scanner(System.in);
   private static ArrayList<Product> productArrayList = new ArrayList<>();
   static {
       productArrayList.add(new Product(1,"trung",3000));
       productArrayList.add(new Product(2,"rung",9000));
       productArrayList.add(new Product(3,"ung",6000));
   }

   public void display(){
       for (Product p: productArrayList) {
           System.out.println(p);
       }
   }

    public void add(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("NHập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        double price = Double.parseDouble(scanner.nextLine());
        productArrayList.add(new Product(id,name,price));
    }

    public void edit(){
        System.out.println("Nhập id cần sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        int i = 0;
        for (; i < productArrayList.size(); i++) {
            if (idEdit==productArrayList.get(i).getId()){
                System.out.println("Nhập lại tên");
                productArrayList.get(i).setName(scanner.nextLine());
                System.out.println("Nhập lại giá");
                productArrayList.get(i).setPrice(Integer.parseInt(scanner.nextLine()));
                return;
            }
        }
        System.out.println("no");

    }

    public void remove(){
        System.out.println("NHập id cần xóa");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (idDelete == productArrayList.get(i).getId()){
                productArrayList.remove(i);
            }
        }
    }

    public void search(){
        System.out.println("Nhập tên sản phẩm cần tìm kiếm");
        String searchName = scanner.nextLine();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (searchName.equals(productArrayList.get(i).getName())){
                System.out.println(productArrayList.get(i));
            }
        }
    }

    public void sort(){
       Collections.sort(productArrayList);
//       productArrayList.sort(Comparator.naturalOrder());
    }
    public static void main(String[] args) {
        ProductManger productManger = new ProductManger();
        productManger.display();
//        productManger.remove();
//        productManger.display();
//        productManger.search  ();
//        productManger.sort();
//        productManger.display();
        productManger.edit();
        productManger.display();

    }
}
