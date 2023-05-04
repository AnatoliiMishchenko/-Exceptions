package Nome.three;

import java.io.FileNotFoundException;

/**
 * Создайте класс исключения,
 * которое будет возникать при попытке открыть несуществующий файл. Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

public class ExcepshinClass extends FileNotFoundException {
    public ExcepshinClass(){
        super("айла не существует");
    }

}
