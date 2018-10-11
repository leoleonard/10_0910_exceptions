package two;

import java.io.*;
import java.lang.reflect.Array;

public class ProductTest {
    public static void main(String[] args) throws IOException {
        Product product[] = new Product[3];
        product[0] = new Product("biurko", 200, "ikea");
        product[1] = new Product("komputer", 2000, "dell");
        product[2] = new Product("chleb", 7, "ziarno");

        File file = new File("one.txt");
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            System.out.println("Nie otworzono pliku");
            return;
        }


        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bfw = new BufferedWriter(fileWriter);

            for (Product product1 : product) {
                String text = product1.getName() + ";" + product1.getProducent() + ";";
                bfw.write(text);
                bfw.newLine();
                bfw.flush();
            }
        } catch (IOException e) {
            System.out.println("Nie udalo sie utworzyc pliku");
            e.printStackTrace();
        }


//        bfw.write(product[0].getName() + ";" + product[0].getProducent() + ";" + product[0].getCena());
//        bfw.write(product[1].getName() + ";" + product[1].getProducent() + ";" + product[1].getCena());
//        bfw.write(product[2].getName() + ";" + product[2].getProducent() + ";" + product[2].getCena());
//        bfw.close();


    }
}
