package src.test.java;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestWeapon {
    @Test
    public void testWeaponCreation() {
        Weapon weapon = new Weapon();
        assertNotNull(weapon);
    }
}
