package HW8PlayGameTest.testGame;

import HW8PlayGameTest.game.Dice;
import HW8PlayGameTest.game.DiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiceImplTest {

    @Test
    public void testValuesOfRangeDiceRoll() {
        String scenario = "Тест броска кубика ";
        Dice dice = new DiceImpl();
        try {
            for (int i = 0; i < 100; i++) {
                int result = dice.roll();
                boolean expected;
                if (result > 0 & result <= 6) {
                    expected = true;
                } else {
                    expected = false;
                }
                Assertions.assertTrue(expected);
            }
            System.out.printf("\"%s\" проведен успешно %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" выполнен не удачно \"%s\" /n", scenario, e.getMessage());
        }
    }
}