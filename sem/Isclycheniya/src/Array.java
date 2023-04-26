import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
 * Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
 * если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
 * если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
 * если вместо массива пришел null, метод вернет -3
 * придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
 * Напишите метод, в котором реализуйте взаимодействие с пользователем.
 * То есть, этот метод запросит искомое число у пользователя, вызовет первый,
 * обработает возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2,
 * пользователю выведется сообщение: “Искомый элемент не найден”.
 */
public class Array {

    public static void main(String[] args) {
        System.out.println("Введите число поиска");
        int index = Integer.parseInt((new Scanner(new InputStreamReader(System.in))).nextLine());
        int[] array = {1, 2, 3, 5, 2, 6, 8, 5, 4};
        int number = index(array, index);
        interfeis(number);
    }

    public static int index(int[] array, int number) {
        if (array.length < 2) {
            return -1;
        } else if (array == null) {
            return -3;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -2;
    }

    public static void interfeis(int number) {
        switch (number) {
            case -1 -> System.out.println("Длинна массива меньше заданого минимума");
            case -2 -> System.out.println("Введенный элемент не найден");
            case -3 -> System.out.println(" Введенный массив null");
            default -> System.out.println(number);
        }
    }
}

