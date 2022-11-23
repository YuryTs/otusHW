package HW4testSystemOOP;

import java.util.Scanner;

class ConsoleUserInput implements UserInput {

    @Override
    public int read() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Необходимо ввести целочисленное значение");
            scanner.next();
        }
        int inputAnswer = scanner.nextInt();

        return inputAnswer;
    }
}


