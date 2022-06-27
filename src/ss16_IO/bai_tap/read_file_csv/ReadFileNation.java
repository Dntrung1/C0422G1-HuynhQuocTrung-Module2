package ss16_IO.bai_tap.read_file_csv;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileNation {
    public static List<Nation> readNationFile(){
        List<Nation> nationList = new ArrayList<>();
        File file = new File("src/ss16_IO/bai_tap/read_file_csv/nation.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        String[] arr = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                Nation nation = new Nation(Integer.parseInt(arr[0]),arr[1],arr[2]);
                nationList.add(nation);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }
        return nationList;
    }
}
