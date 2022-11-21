package HW7Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class ClassB {

    public String inputName() throws MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.println("Введите дополнение: ");
        try {
            str = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        if (str.equals("")) {
            throw new MyException();
        }
        return str;
    }
}
