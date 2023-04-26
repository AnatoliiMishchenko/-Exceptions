package Nome.one;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
 * и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */

public class Difference {
    public static void main(String[] args) throws Exception {
        int one[] = {1, 2, 3, 5, 6};
        int two[] = {1, 2, 3, 5, 1};
        if (two.length != one.length) {
            throw new ArrayIndexOutOfBoundsException("Массивы не равны");
        }
        for (int i = 0; i < arrayDiff(one, two).length; i++) {
            System.out.print(arrayDiff(one, two)[i]);
        }
    }

    public static int[] arrayDiff(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[arrayOne.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayOne[i] - arrayTwo[i];
        }
        return result;
    }

}
