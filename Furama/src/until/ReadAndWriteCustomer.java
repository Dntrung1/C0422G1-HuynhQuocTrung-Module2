package until;

import model.person.Customer;
import model.person.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    public static void writeToCSV(List<Customer> customerList, String pathFile, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer e : customerList) {
                bufferedWriter.write(e.toCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFileCSV(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        String line = "";
        String[] arr;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Customer customer = new Customer(arr[0],LocalDate.parse(arr[1]),arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        return customerList;
    }
}
