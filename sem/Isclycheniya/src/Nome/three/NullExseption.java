package Nome.three;

/**
 * Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
 *  * Исключение должно отображать понятное для пользователя сообщение об ошибке
 */

public class NullExseption extends  NullPointerException{

    public NullExseption(){
        super("Элемент массива null");
    }
    public NullExseption(String s){
        super(s);
    }

}
