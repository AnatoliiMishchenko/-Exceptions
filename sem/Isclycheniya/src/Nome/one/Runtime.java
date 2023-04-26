package Nome.one;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class Runtime {
    public static void main(String[] args) {
        int [] one = {1,2,3,2,3,4};
        int [] two = {1,23,3,23,8};
        if(one.length != two.length){
            throw new ArrayIndexOutOfBoundsException(" массивы не равны");

        }

        for (int i = 0; i < newArray(one,two).length; i++) {
            System.out.println(newArray(one,two)[i]);

        }

    }

    public static double[] newArray(int[] a, int[] b) {
        int length = a.length;
        double[] result = new double[length];

        for (int i = 0; i < result.length; i++) {
            result[i] = (double) a[i] / (double)b[i];
        }
        return result;
    }
}
