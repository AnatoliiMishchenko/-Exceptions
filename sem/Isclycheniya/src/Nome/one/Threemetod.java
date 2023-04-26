package Nome.one;

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */

public class Threemetod {
    public static void main(String[] args) {
       // System.out.println(del(5, 0));//ArithmeticException: / by zero
        int [] array = {1,2,3,4,5,6};
       // System.out.println(index(array));//ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
        System.out.println(mult());//NumberFormatException: Cannot parse null string
    }

    public static int del(int a, int b) {
        return a / b;
    }

    public static int index(int [] array){
        return array[array.length +1];
    }
    public static int mult (){
        int a = Integer.parseInt(null);
        return a;
    }
}
