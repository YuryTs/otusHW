import java.util.Scanner;

public class SystemTestOop {

    public static class SuperClass {
        private int number;
        private String question;
        private String[] massAnswer;
        private int goodAnswer;

        public SuperClass(int number, String question, int goodAnswer, String[] massAnswer) {
            this.number = number;
            this.question = question;
            this.massAnswer = massAnswer;
            this.goodAnswer = goodAnswer;
        }

        public void outOptionAnswer() {
            for (String answers : massAnswer) {
                System.out.println(answers);
            }
        }

        public void outQuestion() {
            System.out.println("Вопрос " + number + ": " + question);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SuperClass number1 = new SuperClass(1, "Переменная это: \n", 1, new String[]{"1. Метод выполнения", "2. Значение", "3. Ячейка в области памяти", "4. Операция"});
        SuperClass number2 = new SuperClass(2, "С помощью какой команды можно переключить ветки в git?\n", 3, new String[]{"1. checkout", "3. pull", "4. clone"});
        SuperClass number3 = new SuperClass(3, "Переменная в массиве называется\n", 4, new String[]{"1. фиксатором", "2. номером", "3. индексом", "4. элементом"});

        SuperClass[] numberArr = {number1, number2, number3};
        int i = 0;
        while (i < numberArr.length) {
            SuperClass someVar = numberArr[i];
            elementTest(scanner, someVar);
            i++;
            System.out.println();
        }
    }

    private static void elementTest(Scanner scanner, SuperClass outPut) {
        outPut.outQuestion();
        outPut.outOptionAnswer();
        System.out.print("Введите ответ:  ");
        while (!scanner.hasNextInt()) {
            System.out.println("Необходимо ввести целочисленное значение");
            scanner.next();
        }
        if (scanner.hasNextInt()) {
                int inputAnswer = scanner.nextInt();
                if (inputAnswer == outPut.goodAnswer) {
                    System.out.println("Правильно");
                } else {
                    System.out.println("Неверно!");
                }
            }
    }
}


