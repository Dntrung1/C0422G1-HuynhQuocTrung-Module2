package ss16_IO.bai_tap.copy_file;

import java.io.*;

public class ReadAndWrite {
    public static String readFile1(){
        String str = "";
        File file = new File("src/ss16_IO/bai_tap/copy_file/source_file.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = "";
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                str += line;
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }
        return str;
    }

    public static void writeFile2(String str,boolean append){
        File file = new File("src/ss16_IO/bai_tap/copy_file/target_file.txt");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
