import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

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

    @Test
    void decryptorA1() {
        assertEquals("COLLIN", Main.decryptorA("*COLLIN*"));
    }

    @Test
    void decryptorA2() {
        assertEquals("*HELLO*", Main.decryptorA("**HELLO**"));
    }

    @Test
    void decryptorA3() {
        assertEquals("HE*LLO", Main.decryptorA("*HE*LLO*"));
    }

    @Test
    void decryptorB1() {
        assertEquals("collin", Main.decryptorB("nollic"));
    }

    @Test
    void decryptorB2() {
        assertEquals(null, Main.decryptorB(""));
    }

    @Test
    void decryptorC1() {
        assertEquals("collin", Main.decryptorC("ollincay"));
    }

    @Test
    void decryptorC2() {
        assertEquals(null, Main.decryptorC("normal"));
    }

    @Test
    void decryptorD1() {
        assertEquals("collinlam", Main.decryptorD("collnlami"));
    }

    @Test
    void decryptorD2() {
        assertEquals(null, Main.decryptorD(""));
    }

    @Test
    void decryptorLA1() {
        assertEquals("firefighter", Main.decryptorLA("rethgifiref"));
    }

    @Test
    void decryptorLA2() {
        assertEquals("collinlam", Main.decryptorLA("malnicoll"));
    }

    @Test
    void decryptorLA3() {
        assertEquals(null, Main.decryptorLA(""));
    }

    @Test
    void decrypterLB1() {
        assertEquals("collin", Main.decryptorLB("cullon"));
    }

    @Test
    void decrypterLB2() {
    assertEquals("a e i o u", Main.decryptorLB("e i o u a"));
    }


}
