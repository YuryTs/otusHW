package HW4testSystemOOP;

public class SuperClass {
    private int number;
    private String question;
    private String[] massAnswer;
    private int goodAnswer;
    private UserInput userInput = new ConsoleUserInput();
    private UserOutput userOutput = new ConsoleUserOutput();

    public SuperClass(int number, String question, int goodAnswer, String[] massAnswer) {
        this.number = number;
        this.question = question;
        this.massAnswer = massAnswer;
        this.goodAnswer = goodAnswer;
    }

    private void outOptionAnswer() {
        for (String answers : massAnswer) {
            System.out.println(answers);
        }
    }

    private void outQuestion() {
        System.out.println("Вопрос " + number + ": " + question);
    }
    public boolean elementTest() {
        outQuestion();
        outOptionAnswer();
        System.out.print("Введите ответ:  ");
        int userAnswer = userInput.read();
        if (userAnswer == goodAnswer){
            userOutput.print("Answer is good");
            return true;
        }else{
            userOutput.print("Your answer isn`t correct");
            return false;
        }

    }
}
