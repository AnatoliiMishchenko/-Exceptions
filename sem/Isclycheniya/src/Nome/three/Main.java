package Nome.three;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    }


    public static void readFale() throws ExcepshinClass {
        FileReader fileReader;
        try {
            fileReader = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            throw new ExcepshinClass();
        }
    }
}
