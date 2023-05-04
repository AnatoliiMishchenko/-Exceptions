package Nome.three;

/**
 * Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
 * и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
 */

public class Metod {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = {
                {"1", "2", "3", "9"},
                {"5", "3", "4", "2"},
                {"1", "2", "3", "1"},
                {"2", "6", "5", "3"}
        };
        try {
            System.out.printf("Сумма элементов матрицы равна " + summMatrix(array));
        }catch (MyArrayDataException | MyArraySizeException e){
            System.out.println( e.getMessage());
        }


    }

    public static int summMatrix(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4) {
                throw new MyArraySizeException();
            } else {
                if (array[i].length != 4) {
                    throw new MyArraySizeException();
                } else {
                    for (int j = 0; j < array.length; j++) {
                        for (int k = 0; k < array[j].length; k++) {
                            try {
                                summ += Integer.parseInt(array[j][k]);
                            } catch (Exception e) {
                                throw new MyArrayDataException(j, k);
                            }
                        }
                    }
                }
            }
        }
        return summ;
    }
}
