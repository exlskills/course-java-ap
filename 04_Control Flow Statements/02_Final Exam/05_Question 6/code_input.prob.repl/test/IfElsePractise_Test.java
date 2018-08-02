package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class IfElsePractise_Test{
    @Test
    public void checkNumberSum() {
	IfElsePractise varOne = new IfElsePractise();
	assertTrue(varOne.numberSum(1,1) == 4);
	assertTrue(varOne.numberSum(0,0) == 0);
	assertTrue(varOne.numberSum(2,3) == 5);
	assertTrue(varOne.numberSum(-50,20) == -30);
	assertTrue(varOne.numberSum(-40,-40) == -160);
	assertTrue(varOne.numberSum(-40,0) == -40);
	}
}