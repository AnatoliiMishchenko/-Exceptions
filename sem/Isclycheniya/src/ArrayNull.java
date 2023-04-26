/**
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и проверить что он не равен null.
 * А теперь реализуйте следующую логику:
 * Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
 * Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
 */
public class ArrayNull {
    public static void main(String[] args) {
        Integer [] array = {1,2,null,4,3,5};

        String name = checkArray(array);
        if(name.isEmpty()){
            System.out.println("Значание null не найдено в массиве или масcив пустой");
        }else {
            System.out.println("Индек массива в которых содержиться значение null: " + name);
        }


    }
    public static String checkArray(Integer[] arr){
        String rasult = "";
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == null) {
                rasult = rasult + i + " ";
            }
        }
        return rasult;
    }
}
