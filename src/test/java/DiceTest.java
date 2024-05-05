import com.example.arena.Dice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testDiceRoll() {
        Dice dice = new Dice(6);
        int rollResult = dice.roll();
        assertTrue(rollResult >= 1 && rollResult <= 6);
    }

    @Test
    public void testDiceRollWithNegativeSides() {
        assertThrows(IllegalArgumentException.class, () -> new Dice(-6));
    }

    @Test
    public void testDiceRollWithZeroSides() {
        assertThrows(IllegalArgumentException.class, () -> new Dice(0));
    }

    // more test cases to be added if needed
}
