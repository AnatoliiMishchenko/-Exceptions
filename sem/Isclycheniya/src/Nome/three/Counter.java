package Nome.three;

import java.io.IOException;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на
 * 1. Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
 * Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 * При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */

public class Counter implements AutoCloseable {
    private int  iterator;
    boolean clouse = true;

    public static void main(String[] args) {
        try( Counter counter = new Counter()) {
            counter.add();

        } catch ( IOException e){
            e.printStackTrace();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int add(){
        return iterator++;
    }
    @Override
    public void close() throws Exception {
        this.iterator = 0;
        clouse = false;
        if(clouse == false){
            throw new IOException("запись закрыта");
        }
    }
}
