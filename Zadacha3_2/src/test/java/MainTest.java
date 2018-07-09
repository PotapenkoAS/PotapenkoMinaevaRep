import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void simpleTest(){
        assertEquals(3,Main.calc(16));
    }
}