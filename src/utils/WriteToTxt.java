package utils;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {
    public static void write(String fileName, String str) {
        try (FileWriter fw = new FileWriter(fileName,true)) {
            fw.write(str + "\n");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}