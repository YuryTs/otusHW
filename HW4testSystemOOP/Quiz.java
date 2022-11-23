package HW4testSystemOOP;

public class Quiz {
    private SuperClass[] numberArr;
    private UserOutput userOutput = new ConsoleUserOutput();

    private int correctCount = 0;
    private int errorCount = 0;

    public Quiz(SuperClass... numberArr) {
        this.numberArr = numberArr;
    }

    public void runQuiz() {
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i].elementTest();
        }
    }
}
