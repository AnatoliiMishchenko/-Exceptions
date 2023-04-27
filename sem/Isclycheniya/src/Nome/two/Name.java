package Nome.two;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Запишите в файл следующие строки:
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Константин=?
 * Иван=4
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
 * заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?,
 * бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
 */

public class Name {
    public static void main(String[] args) {
        HashMap<String, Integer> num = readFile("D:\\git_GB\\исключения в программировании\\sem\\Isclycheniya\\src\\Nome\\two\\int.txt");
        writeFile("D:\\git_GB\\исключения в программировании\\sem\\Isclycheniya\\src\\Nome\\two\\out.txt", num);


    }

    public static HashMap<String, Integer> readFile(String path) {
        HashMap<String, Integer> result = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(path))) {

            while (scanner.hasNext()) {

                String[] line = scanner.next().toString().split("=");

                if (line[1].equals("?")) {
                    result.put(line[0], Integer.parseInt(String.valueOf(line[0].length())));
                }else {
                    result.put(line[0], Integer.parseInt(line[1]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден");
        } catch (NumberFormatException e) {
            System.out.println("Не удасоль считать значение");
        }
        return result;
    }

    public static void writeFile(String path, HashMap<String, Integer> result) {

        try (FileWriter fileWriter = new FileWriter(path)) {
            for (Map.Entry<String, Integer> t : result.entrySet()
            ) {
                fileWriter.write(t.getKey() + " = " + t.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
    }
}
