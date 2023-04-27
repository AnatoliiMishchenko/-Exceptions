package Nome.two;
/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empty {
    public static void main(String[] args) throws IOException {
        emptyString();

    }

    public static void emptyString() throws IOException {
        System.out.println("Введите строку");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        if (name.isEmpty()) {
            throw new NullPointerException("Вводить пустую строку запрещено");
        }
        System.out.println("Вы ввели строку " + name);
    }
}
