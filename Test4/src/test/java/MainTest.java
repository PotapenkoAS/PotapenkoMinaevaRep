import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public  void simpleTest() throws FileNotFoundException{

        String[] s = new String[1];
        s[0] = "";

        assertEquals(58975, Main.doer());


    }
    @Test
    public void TempTest(){
        assertEquals(1,0);
    }
}