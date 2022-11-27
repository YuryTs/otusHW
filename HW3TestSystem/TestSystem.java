package HW3TestSystem;

import java.util.Scanner;

class TestSystem {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"Переменная это: \n", "С помощью какой команды можно переключить ветки в git?\n", "Переменная в массиве называется\n", "На что проверяет метод hasNextInt()\n"};
        String[][] choseAnswers = {
                {"1. Метод выполнения", "2. Значение", "3. Ячейка в области памяти", "4. Операция\n"},
                {"1. checkout", "2. push", "3. pull", "4. clone\n"},
                {"1. фиксатором", "2. номером", "3. индексом", "4. элементом\n"},
                {"1. введенные данные соответствуют типу int", "2. введенные данные соответствуют типу long", "3. введенные данные соответствуют типу boolean", "4. введенные данные соответствуют типу byte\n"}};

        int[] answers = {3, 1, 4, 1};


        int countTrueAnswers = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.printf("Question #%d: %s", i + 1, questions[i]);
            for (int k = 0; k < choseAnswers[i].length; k++) {
                System.out.println(choseAnswers[i][k]);
            }
            System.out.println("введите ответ");

            int ans = 0;
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    ans = scanner.nextInt();
                    break;
                } else {
                    System.out.println("введени не число");
                    scanner.next();
                }
            }
            if (ans == answers[i]) {
                System.out.println("правильно");
                countTrueAnswers++;
            } else {
                System.out.println("not true!");
            }
        }
        System.out.println("Правельных ответов: " + countTrueAnswers + "\nНеправельных ответов: " + (questions.length - countTrueAnswers));

    }
}

