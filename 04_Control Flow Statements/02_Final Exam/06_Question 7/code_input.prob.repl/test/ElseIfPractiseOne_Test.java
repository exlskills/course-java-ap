package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ElseIfPractiseOne_Test{
    @Test
    public void checkTotalSum() {
	ElseIfPractiseOne varOne = new ElseIfPractiseOne();
	assertTrue(varOne.totalSum(0,0,0) == 0);
	assertTrue(varOne.totalSum(3,5,6) == 14);
	assertTrue(varOne.totalSum(0,1,13) == 1);
	assertTrue(varOne.totalSum(10,13,1) == 10);
	assertTrue(varOne.totalSum(13,1,13) == 0);
	assertTrue(varOne.totalSum(13,13,13) == 0);
	assertTrue(varOne.totalSum(13,0,0) == 0);
	assertTrue(varOne.totalSum(13,13,0) == 0);
	}
}