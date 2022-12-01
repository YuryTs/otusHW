package testGame;

import game.Dice;
import game.Game;
import game.GameWinnerPrinter;
import game.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {


    @Test
    void testPlayGameIfPlayer1HasMore() {
        String conclusion = "Тест метода при значении кубика у Игрока1 БОЛЬШЕ чем у Игрока2: ";
        Dice dice = new Dice() {
            int count = 0;

            @Override
            public int roll() {
                if (count == 0) {
                    count++;
                    return 6;
                } else {
                    return 2;
                }
            }
        };
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                Assertions.assertEquals(winner.getName(), player1.getName());
            }
        };
        try {
            Game game = new Game(dice, winnerPrinter);
            game.playGame(player1, player2);
            System.out.printf("\"%s\"пройден успешно! %n", conclusion);
        } catch (Throwable e) {
            System.err.printf("\"%s\" НЕ ПРОЙДЕН! \"%s\"%n", conclusion, e.getMessage());
        }
    }


        @Test
        void testPlayGameIfPlayer1HasLess() {
            String conclusion = "Тест метода при значении кубика у Игрока1 МЕНЬШЕ чем у Игрока2: ";
            Dice dice = new Dice() {
                int count = 0;

                @Override
                public int roll() {
                    if (count == 0) {
                        count++;
                        return 1;
                    } else {
                        return 6;
                    }
                }
            };
            Player player1 = new Player("Вася");
            Player player2 = new Player("Игорь");
            GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
                @Override
                public void printWinner(Player winner) {
                    Assertions.assertEquals(winner.getName(), player2.getName());
                }
            };
            try {
                Game game = new Game(dice, winnerPrinter);
                game.playGame(player1, player2);
                System.out.printf("\"%s\"пройден успешно! %n", conclusion);
            } catch (Throwable e) {
                System.err.printf("\"%s\" НЕ ПРОЙДЕН! \"%s\"%n", conclusion, e.getMessage());
            }
    }
    @Test
    void testPlayGameIfResultsOfPlayersIsEquals() {
        String conclusion = "Тест метода при ОДИНАКОВЫХ значениях кубика у Игроков: ";
        Dice dice = new Dice() {
            int count = 0;

            @Override
            public int roll() {
//                if (count == 0) {
//                    count++;
//                    return 1;
//                } else {
                return 6;
//                }
            }
        };
        Player player1 = new Player("Вася");
        Player player2 = new Player("Игорь");
        GameWinnerPrinter winnerPrinter = new GameWinnerPrinter() {
            @Override
            public void printWinner(Player winner) {
                Assertions.assertEquals(winner.getName(), "Ничья");
            }
        };
        try {
            Game game = new Game(dice, winnerPrinter);
            game.playGame(player1, player2);
            System.out.printf("\"%s\"пройден успешно! %n", conclusion);
        } catch (Throwable e) {
            System.err.printf("\"%s\" НЕ ПРОЙДЕН! \"%s\"%n", conclusion, e.getMessage());
        }
    }
}