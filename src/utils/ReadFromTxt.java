package utils;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTxt {
    public static String read(String fileName){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                if (!line.equals(" ")) {
                    sb.append(line).append("\n");
                }
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } return "";
    }
}