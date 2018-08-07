package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ConditionalOrPractice_Test{
    @Test
    public void checkLuckyNumbers() {
	ConditionalOrPractice varOne = new ConditionalOrPractice();
	assertTrue(varOne.luckyNumbers(0,0,0) == 20);
	assertTrue(varOne.luckyNumbers(50,50,50) == 20);
	assertTrue(varOne.luckyNumbers(20,30,40) == 0);
	assertTrue(varOne.luckyNumbers(0,1,2) == 0);
	assertTrue(varOne.luckyNumbers(0,0,3) == 10);
	assertTrue(varOne.luckyNumbers(1,1,5) == 10);
	assertTrue(varOne.luckyNumbers(5,25,25) == 10);
	}
}