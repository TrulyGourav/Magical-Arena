import com.example.arena.Arena;
import com.example.arena.Dice;
import com.example.arena.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {

    @Test
    public void testGameInitialization() {
        Player playerA = new Player("testName", 50, 5, 10);
        Player playerB = new Player("testName", 100, 10, 5);
        Dice attackDice = new Dice(6);
        Dice defenseDice = new Dice(6);
        Arena game = new Arena(playerA, playerB, attackDice, defenseDice);
        assertNotNull(game);
    }

    @Test
    public void testGamePlay() {
        Player playerA = new Player("testName", 50, 5, 10);
        Player playerB = new Player("testName", 100, 10, 5);
        Dice attackDice = new Dice(6);
        Dice defenseDice = new Dice(6);
        Arena game = new Arena(playerA, playerB, attackDice, defenseDice);
        game.play(); // This should run without errors
    }

    // more test cases to be added as needed
}
