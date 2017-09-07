package adapter.practice1;

import java.io.IOException;

public class Main {
 public static void main(String[] args) {
     FileIO f = new FileProperties();
     try {
         f.readFromFile("src/adapter/practice1/file.txt");
         f.setValue("year", "2004");
         f.setValue("month", "4");
         f.setValue("day", "21");
         f.writeToFile("newFile.txt");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
