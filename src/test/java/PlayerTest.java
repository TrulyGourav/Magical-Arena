import com.example.arena.Player;
import com.example.arena.exception.InvalidValueException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("testName", 50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerHealthSetter() {
        Player player = new Player("testName", 50, 5, 10);
        player.setHealth(60);
        assertEquals(60, player.getHealth());
    }

    @Test
    public void testPlayerHealthSetterWithInvalidValue() {
        assertThrows(InvalidValueException.class, () -> new Player("testName", 0, 5, 10));
        assertThrows(InvalidValueException.class, () -> new Player("testName", -10, 5, 10));
    }

    @Test
    public void testPlayerTakeDamage() {
        Player player = new Player("testName", 50, 5, 10);
        player.takeDamage(20);
        assertEquals(30, player.getHealth());
        player.takeDamage(40); // Health should not go below 0
        assertEquals(0, player.getHealth());
    }
}
