package two;

import java.io.*;
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
//
        //wczytaj plik 1 sposob
//        try {
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//
//                String line = scanner.nextLine();
//                System.out.println(line);
//
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Plik nie istnieje");
//        }


        //2 sposob
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }

}

