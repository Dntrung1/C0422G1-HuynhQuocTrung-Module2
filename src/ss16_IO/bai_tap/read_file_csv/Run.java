package ss16_IO.bai_tap.read_file_csv;

import ss16_IO.bai_tap.copy_file.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class Run {
   public static void display(){
       for (int i = 0; i < ReadFileNation.readNationFile().size(); i++) {
           System.out.println(ReadFileNation.readNationFile().get(i).toString());
       }
   }

    public static void main(String[] args) {
        display();
    }
}
