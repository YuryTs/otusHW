package HW8PlayGameTest.testGame;

import HW8PlayGameTest.game.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void testPlayGameIfResultsBothPlayerIsEquals() {
        String conclusion = "Тест метода при одинаковых у игроков значений кубика: ";
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        int player1Result = 4;
        int player2Result = 4;
        try {
            Player winner = (player1Result > player2Result) ? player1 : player2;
            Assertions.assertEquals(player1,winner);
            System.out.printf("\"%s\"Passed", conclusion);
        }catch (Throwable e){
            System.err.printf("\"%s Not passed! You need review your code! \"%s\"/n",conclusion, e.getMessage());
        }
    }

    @Test
    void testPlayGameIfPlayer1HasMore(){
        String conclusion = "Тест метода при значении кубика у Игрока1 больше чем у Игрока2: ";
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        int player1Result = 5;
        int player2Result = 4;
        try {
            Player winner = (player1Result > player2Result) ? player1 : player2;
            Assertions.assertEquals(player1.getName(),winner.getName());
            System.out.printf("\"%s\" PASSED %n", conclusion);
        }catch (Throwable e){
            System.err.printf("\"%s\"NOT PASSED! You need review your code! \"%s\"%n",conclusion, e.getMessage());
        }
    }

    @Test
    void testPlayGameIfPlayer2HasMore(){
        String conclusion = "Тест метода при значении кубика у Игрока1 больше чем у Игрока2: ";
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        int player1Result = 1;
        int player2Result = 4;
        try {
            Player winner = (player1Result > player2Result) ? player1 : player2;
            Assertions.assertEquals(player1.getName(),winner.getName());
            System.out.printf("\"%s\" PASSED %n", conclusion);
        }catch (Throwable e){
            System.err.printf("\"%s\"NOT PASSED! You need review your code! \"%s\"%n",conclusion, e.getMessage());
        }
    }
}