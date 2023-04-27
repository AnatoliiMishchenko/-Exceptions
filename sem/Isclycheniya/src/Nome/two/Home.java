package Nome.two;
/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import com.sun.jdi.connect.Connector;

import java.io.*;
import java.util.Scanner;

public class Home {
    public static void main(String[] args) throws IOException {
        floatNumber();


    }

    public static void floatNumber() throws IOException {
        boolean flag;
        float number = -1.0f;
        do {
            try {
                flag = false;
                System.out.println("Введите дробное число");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                number = Float.parseFloat(bufferedReader.readLine().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Параметр передан не верно, введите еще раз");
                flag = true;
            }
        } while (flag);
        System.out.println("Вы вввели чиcло " + number);
    }
}
