package ITMO.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNewFile {
    public static void main(String[] args) {
        String str = "Кешке лепешке";
        String fileName = "Files/NewFile.txt";
        makeNewFile(str, fileName);
    }

    public static void makeNewFile(String str, String fileName) {
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(str);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

