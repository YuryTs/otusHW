package HW4testSystemOOP;

public class SystemTestOop {



    public static void main(String[] args) {

        SuperClass number1 = new SuperClass(1, "Переменная это: \n", 1, new String[]{"1. Метод выполнения", "2. Значение", "3. Ячейка в области памяти", "4. Операция"});
        SuperClass number2 = new SuperClass(2, "С помощью какой команды можно переключить ветки в git?\n", 3, new String[]{"1. checkout", "3. pull", "4. clone"});
        SuperClass number3 = new SuperClass(3, "Переменная в массиве называется\n", 4, new String[]{"1. фиксатором", "2. номером", "3. индексом", "4. элементом"});

        Quiz quiz = new Quiz(number1, number2, number3);
        quiz.runQuiz();

        }
    }



