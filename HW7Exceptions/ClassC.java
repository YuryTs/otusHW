package HW7Exceptions;

public class ClassC {
    public static void main(String[] args) throws MyException {

        ClassB bClass = new ClassB();
        ClassA aClass = new ClassA(12, 42 , bClass.inputName());

        aClass.doSmth();
        aClass.getFromRepo();
    }
}
