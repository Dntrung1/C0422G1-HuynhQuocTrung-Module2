package common;

import model.person.Customer;
import model.person.Employee;
import until.ReaAndWriteEmployee;
import until.ReadAndWriteCustomer;

import java.util.List;
public class CMND {
    public static boolean checkId(String id){
        List<Employee> employeeList = ReaAndWriteEmployee.readFileCSV("src/data/Employee.csv");
        List<Customer> customerList = ReadAndWriteCustomer.readFileCSV("src/data/Customer.csv");
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getCMND().equals(id)){
                return true;
            }else {
                for (int j = 0; j < customerList.size(); j++) {
                    if (customerList.get(j).getCMND().equals(id)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
