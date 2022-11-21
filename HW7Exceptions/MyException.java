package HW7Exceptions;

public class MyException extends Throwable {
    public MyException() {
        System.out.println("String can`t be empty");
    }
}
