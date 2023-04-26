public class Main {
    public static void main(String[] args) {
        int [] array = new int [0];//{1,2,3};
        int length = arrayLength(array);
        if(length < 0){
            System.out.println("Length of array less that minumum");
        } else {
            System.out.println("Length of array:" + length);
        }
    }

    public static int arrayLength(int[] Array) {
        if (Array.length < 2) {
            return -1;
        }
        return Array.length;
    }
}