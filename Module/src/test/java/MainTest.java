import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addSix() {
        assertEquals(45, Main.addSix(39));
    }

    @Test
    void addSeventeen() {
        assertEquals(29, Main.addSeventeen(12));
    }

}
