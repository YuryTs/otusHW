package HW8PlayGameTest.testGame;

import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void playGame() {
        String player1 = "Вася";
        String player2 = "Игорь";
    int player1Result = -2;
    int player2Result = 5;


        String winner = (player1Result > player2Result)? player1: player2;
        System.out.println(winner);
    }
}