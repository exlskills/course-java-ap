package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class RecursionPractice_Test{
    @Test
    public void checkPowerOfNum() {
	RecursionPractice varOne = new RecursionPractice();
	assertTrue(varOne.powerOfNum(1,0) == 1);
	assertTrue(varOne.powerOfNum(2,2) == 4);
	assertTrue(varOne.powerOfNum(5,3) == 125);
	assertTrue(varOne.powerOfNum(3,3) == 27);
	assertTrue(varOne.powerOfNum(600,0) == 1);
	}
}