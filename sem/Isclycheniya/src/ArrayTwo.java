public class ArrayTwo {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 3}, {1, 1, 0}};
        try {
            System.out.printf("Sum of matrix: %d", summMatrix(array));
        }
        catch (Exception ex){
            System.err.printf("Error was occured. %s", ex.getMessage());
        }

    }

    public static int summMatrix(int[][] array) {
        if (array == null) {
            throw new NullPointerException("matrix was null");
        }
        if (array.length == 0) {
            throw new RuntimeException("matrix was empti");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) {
                throw new RuntimeException("Matrix must be square");
            }
        }
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Element wqs not correct");
                }
                summ += array[i][j];
            }

        }
        return summ;
    }
}
