package two;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws IOException {

        File file = new File("test.text");

//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Nie udalo sie utworzyc pliku" + e.getMessage());
//        File file = new File("test.text");
//        if(!file.exists())
//            file.createNewFile();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje");
        }
    }

}

