package until;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadAndWriteFacility {
    public static void writeToCSV(Map<Facility,Integer> map, String pathFile, boolean append) {
        Set<Facility> key = map.keySet();
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Facility facility : key) {
                bufferedWriter.write(facility.toCSV()+","+map.get(facility));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility,Integer> readFileCSV(String pathFile) {
        Map<Facility,Integer> map = new LinkedHashMap<>();
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
                if (arr.length==9){
                    map.put((new House(arr[0],Double.parseDouble(arr[1]),Double.parseDouble(arr[2]),Byte.parseByte(arr[3]),arr[4],arr[5],arr[6],Byte.parseByte(arr[7]))),Integer.parseInt(arr[8]));
                }else if (arr.length==8){
                    map.put((new Room(arr[0],Double.parseDouble(arr[1]),Double.parseDouble(arr[2]),Byte.parseByte(arr[3]),arr[4],arr[5],arr[6])),Integer.parseInt(arr[7]));
                }else if (arr.length==10){
                    map.put((new Villa(arr[0],Double.parseDouble(arr[1]),Double.parseDouble(arr[2]),Byte.parseByte(arr[3]),arr[4],arr[5],arr[6],Double.parseDouble(arr[7]),Byte.parseByte(arr[8]))),Integer.parseInt(arr[9]));
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        return map;
    }
}
