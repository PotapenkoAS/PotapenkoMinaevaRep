package my.pkg;


import my.pkg.Evklid;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvklidTest {

    Evklid res = new Evklid();
    Random rand = new Random();

    @Test
    public void testNod() {

    }


    @Test
    public void testSimple() {
        int expected = 7;
        int a = 35;
        int b = 14;
        assertEquals(expected,res.nod(a,b));
    }



    @Test
    public void simpleTest(){
        int expected = 7;
        int a = 35;
        int b = 14;
        assertEquals(expected,res.nod(a,b));
    }

    @Test
    public void randomTest(){
        int a = 0;
        int b = rand.nextInt(1000);
        int expected = b;
        assertEquals(expected, res.nod(a,b));

    }
    @Test
    public void negTest(){
        int expected = -1;
        int a = -100;
        int b = rand.nextInt(10);
        assertEquals(expected, res.nod(a,b));
    }

    @Test
    public void stressTestOne(){
        for (int i=1; i<1001; i++){
            res.nod(i,1001-i);
        }
    }

    @Test
    public void stressTestTwo(){
        for (int i=1; i<100001; i++){
            res.nod(i,10001-i);
        }
    }

    @Test
    public void teststressTestThree(){
        for (int i=1; i<1000001; i++){
            res.nod(i,1000001-i);
        }
    }



}