package until;

import model.other.Booking;
import model.person.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadAndWriteBooking {
    public static void writeToCSV(Set<Booking> bookingSet, String pathFile, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Booking e : bookingSet) {
                bufferedWriter.write(e.toCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Set<Booking> readFileCSV(String pathFile) {
        Set<Booking> bookingSet = new TreeSet<>();
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
                Booking booking = new Booking(arr[0],LocalDate.parse(arr[1]),LocalDate.parse(arr[2]),arr[3],arr[4],arr[5]);
                bookingSet.add(booking);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        return bookingSet;
    }
}
