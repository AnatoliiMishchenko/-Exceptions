package Nome.three.HomeWorkthree;

import Nome.three.ExcepshinClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
 * Фамилия Имя Отчество датарождения номертелефона пол
 * Форматы данных:
 * фамилия, имя, отчество - строки
 * <p>
 * дата_рождения - строка формата dd.mm.yyyy
 * <p>
 * номер_телефона - целое беззнаковое число без форматирования
 * <p>
 * пол - символ латиницей f или m.
 * <p>
 * Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение,
 * что он ввел меньше и больше данных, чем требуется.
 * <p>
 * Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение,
 * соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои.
 * Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
 * <p>
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
 * <p>
 * <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
 * <p>
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 * <p>
 * Не забудьте закрыть соединение с файлом.
 * <p>
 * При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */

public class Questionnair {
    public static void main(String[] args) throws NumberException, InputExcepshin {
        ArrayList<String> name = dataUsers();
        writeFile(name);

    }

    public static ArrayList<String> dataUsers() throws InputExcepshin, NumberException {
        boolean flag = true;
        ArrayList<String> result = new ArrayList<>();
        while (flag) {
            String user;
            String date;
            String numberPhone;
            String gender;
            System.out.println("Введите фамилию имя и отчество через пробел");
            user = new Scanner(System.in).nextLine();
            System.out.println("Введите дату роджения dd.mm.yyyy");
            date = new Scanner(System.in).nextLine();
            System.out.println("Введите номер мобильного телефона 89137688774");
            numberPhone = new Scanner(System.in).nextLine();
            System.out.println("Введите пол f или m");
            gender = new Scanner(System.in).nextLine().trim();
            String[] userResult = user.split(" ");
            String[] dateResult = date.split(".");

            if (numberPhone.length() != 11) { // проверка ввода данных номера телефона
                throw new InputExcepshin();
            } else {
                for (int i = 0; i < numberPhone.length(); i++) {
                    if (!Character.isDigit(numberPhone.charAt(i))) {
                        throw new NumberException();
                    }
                }
            }
            if (date.length() != 10) {
                throw new InputExcepshin();
            } else {
                for (int i = 0; i < date.length() - 1; i++) {//проверка ввода данных даты
                    if (date.charAt(i) == '.') {
                        continue;
                    }
                    if (!Character.isDigit(date.charAt(i))) {
                        throw new InputExcepshin();
                    }
                }
                for (int i = 0; i < dateResult.length; i++) {
                    if (dateResult[2].length() == 4) {
                        if (Integer.parseInt(dateResult[1].toString()) > 0 && Integer.parseInt(dateResult.toString()) < 13) {
                            if (Integer.parseInt(dateResult[1].toString()) == 2 && Integer.parseInt(dateResult[2].toString()) % 4 == 0) {// Высокосные года когда в феврале 29 дней
                                if (Integer.parseInt(dateResult[0].toString()) < 0 || Integer.parseInt(dateResult[0].toString()) > 30) {
                                    throw new InputExcepshin();
                                }
                            } else if (Integer.parseInt(dateResult[1].toString()) == 2) {
                                if (Integer.parseInt(dateResult[0].toString()) < 0 || Integer.parseInt(dateResult[0].toString()) > 29) {
                                    throw new InputExcepshin();
                                }
                            }
                            if (Integer.parseInt(dateResult[1].toString()) == 1
                                    || Integer.parseInt(dateResult[1].toString()) == 3
                                    || Integer.parseInt(dateResult[1].toString()) == 5
                                    || Integer.parseInt(dateResult[1].toString()) == 7
                                    || Integer.parseInt(dateResult[1].toString()) == 8
                                    || Integer.parseInt(dateResult[1].toString()) == 10
                                    || Integer.parseInt(dateResult[1].toString()) == 12) {
                                if (Integer.parseInt(dateResult[0].toString()) < 0 || Integer.parseInt(dateResult[0].toString()) > 32) {
                                    throw new InputExcepshin();
                                }
                            } else {
                                if (Integer.parseInt(dateResult[0].toString()) < 0 || Integer.parseInt(dateResult[0].toString()) > 31) {
                                    throw new InputExcepshin();
                                }
                            }
                        } else {
                            throw new InputExcepshin();
                        }
                    } else {
                        throw new InputExcepshin();
                    }
                }
                if (!gender.equals("f")) {
                    if (!gender.equals("m")) {
                        throw new InputExcepshin();
                    }
                }
                String resultUser = user + " " + date + " " + numberPhone + " " + gender;
                result.add(resultUser);
            }
            System.out.println("Если вы хотите закончить ввод данных то введите EXIT");
            String flagResult = new Scanner(System.in).nextLine();
            if (flagResult.equals("EXIT")) {
                flag = false;
            }
        }
        return result;
    }

    public static void writeFile(ArrayList<String> user) {
        Set<String> firstName = new HashSet<>();
        for (String t : user) {//Записываем фамилии с введенных данных для формирования списка имен фаилов
            String[] stringUser = t.split(" ");
            firstName.add(stringUser[0]);
        }
        for (String file : firstName//создаем фаилы из списка фамилий с именем по фамилии
        ) {
            String nameFile = "D:\\git_GB\\исключения в программировании\\sem\\Isclycheniya\\src\\Nome\\three\\HomeWorkthree\\" + file + ".txt";
            File filename = new File(nameFile);
            try (FileWriter writer = new FileWriter(nameFile, false);) {
                for (String t : user
                ) {
                    String[] stringUser = t.split(" ");
                    if (file.equals(stringUser[0])) {
                        writer.write(t);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
