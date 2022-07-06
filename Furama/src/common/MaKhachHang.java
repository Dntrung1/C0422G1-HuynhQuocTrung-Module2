package common;

import model.person.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;
import until.ReadAndWriteCustomer;

import java.util.LinkedList;
import java.util.List;

public class MaKhachHang {
    public static boolean findMaKhachHang(String maKhachHang){
        List<Customer> customerList = ReadAndWriteCustomer.readFileCSV("src/data/Customer.csv");
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKhachHang().equals(maKhachHang)){
                return true;
            }
        }
        return false;
    }
}
