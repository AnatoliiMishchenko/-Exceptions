package Nome.three;

/**
 *  Создайте класс исключения, который будет выбрасываться при делении на 0.
 *  * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

public class DiviseByZero extends ArithmeticException{

    public DiviseByZero(){
        super("Делить на ноль нельзя");
    }

    public DiviseByZero(String s){
        super(s);
    }
}
