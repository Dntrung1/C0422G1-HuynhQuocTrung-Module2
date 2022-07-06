package common;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import until.ReadAndWriteFacility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListFacility {
    public static void displayVilla(){
        Map<Facility,Integer> map = ReadAndWriteFacility.readFileCSV("src/data/Facility.csv");
        List<Facility> key = new ArrayList<>(map.keySet());
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i) instanceof Villa) {
                System.out.println(key.get(i) + "," + map.get(key.get(i)));
            }
        }
    }

    public static void displayHouse(){
        Map<Facility,Integer> map = ReadAndWriteFacility.readFileCSV("src/data/Facility.csv");
        List<Facility> key = new ArrayList<>(map.keySet());
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i) instanceof House) {
                System.out.println(key.get(i) + "," + map.get(key.get(i)));
            }
        }
    }

    public static void displayRoom(){
        Map<Facility,Integer> map = ReadAndWriteFacility.readFileCSV("src/data/Facility.csv");
        List<Facility> key = new ArrayList<>(map.keySet());
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i) instanceof Room) {
                System.out.println(key.get(i) + "," + map.get(key.get(i)));
            }
        }
    }
}
