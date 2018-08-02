package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class RelationalOperatorPractiseTwo_Test{
    @Test
    public void checkMultipleOfThree() {
	RelationalOperatorPractiseTwo varOne = new RelationalOperatorPractiseTwo();
	assertTrue(varOne.multipleOfThree(1) == false);
	assertTrue(varOne.multipleOfThree(3) == true);
	assertTrue(varOne.multipleOfThree(9) == true);
	assertTrue(varOne.multipleOfThree(23) == false);
	assertTrue(varOne.multipleOfThree(360) == true);
	}
}