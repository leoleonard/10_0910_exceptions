package two;

import java.io.*;
import java.lang.reflect.Array;

public class ProductTest {
    public static void main(String[] args) throws IOException {
        Product product[] = new Product[3];
        product[0] = new Product("nazwa1", "cena1", "producent1");
        product[1] = new Product("nazwa2", "cena2", "producent3");
        product[2] = new Product("nazwa3", "cena3", "producent3");

        File file = new File("product.txt");
        boolean newFile = file.createNewFile();

        FileWriter fileWriter = new FileWriter("product.txt");
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        bfw.write(product[0].getName() + ";" + product[0].getProducent() + ";" + product[0].getCena());
        bfw.write(product[1].getName() + ";" + product[1].getProducent() + ";" + product[1].getCena());
        bfw.write(product[2].getName() + ";" + product[2].getProducent() + ";" + product[2].getCena());
        bfw.close();


    }
}
