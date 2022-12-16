package ITMO.Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConcatFiles {
    public static void main(String[] args) {
        String fileOneName = "Files/File.txt";
        String fileTwoName = "Files/NewFile.txt";
        String concatFiles = "Files/ConcatFile.txt";

        filesConcat(fileTwoName, concatFiles);
        filesConcat(fileOneName, concatFiles);
    }

    private static void filesConcat(String filePath, String concatFiles) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(concatFiles, true));
            for (String str : lines) {
                bufferedWriter.write(str + "\n");
            }
            for (String concatStrings : lines) {
                System.out.println(concatStrings);
            }
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
