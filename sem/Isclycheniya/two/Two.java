package Nome.two;

public class Two {

    public static void main(String[] args) {
        String[][] rar = {{"3", "5", "4"}, {"2", "3", "1"}, {"1", "3", "4"}};
        System.out.println(sum2d(rar));

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);

                    sum += Math.addExact(sum,val);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за границы массива");
        } catch (NullPointerException e) {
            System.out.println("Массив пуст");
        } catch (NumberFormatException e) {
            System.out.println("Значение не является цифрой");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Вы вышли за пределы массива");
        }catch (ArithmeticException e){
            System.out.println("Значение переполнилось параметр который возможен для типа int");
        }
        return sum;
    }
}
