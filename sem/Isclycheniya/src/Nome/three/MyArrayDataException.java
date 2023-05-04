package Nome.three;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(int x, int y){
        super("Не верные данные на позиции х = " + x +" y = " + y);
    }
}
