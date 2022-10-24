import java.util.Scanner;

public class TestSystem {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][][] testDatas = {
                {{"Переменная это: \n", "С помощью какой команды можно переключить ветки в git?\n", "Переменная в массиве называется\n", "На что проверяет метод hasNextInt()\n"}},
                {{"1. Метод выполнения", "2. Значение", "3. Ячейка в области памяти", "4. Операция\n"}, {"1. checkout", "2. push", "3. pull", "4. clone\n"}, {"1. фиксатором", "2. номером", "3. индексом", "4. элементом\n"}, {"1. введенные данные соответствуют типу int", "2. введенные данные соответствуют типу long", "3. введенные данные соответствуют типу boolean", "4. введенные данные соответствуют типу byte\n"}},
                {{"3", "1", "4", "1"}},
        };
        int count = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println(testDatas[0][0][i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(testDatas[1][i][j]);
            }
            if (scanner.hasNextInt()) {
                int ans = scanner.nextInt();
                int rightAnswer = Integer.parseInt(testDatas[2][0][i]);
                if (ans == rightAnswer) {
                    System.out.println(ANSI_GREEN+"Это правильный ответ!\n"+ANSI_RESET);
                    count++;
                } else {
                    System.out.println(ANSI_RED+"Это НЕ правильный ответ!\n"+ANSI_RESET);
                }
            }else {
                System.out.println(ANSI_BLUE+"Вы ввели некорректное значение"+ANSI_RESET);
            }
        }
        System.out.println("Правельных ответов: " + count + "\nНеправельных ответов: " + (4 - count));

    }
}

