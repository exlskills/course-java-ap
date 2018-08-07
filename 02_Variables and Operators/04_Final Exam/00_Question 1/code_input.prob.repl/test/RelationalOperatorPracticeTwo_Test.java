package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class RelationalOperatorPracticeTwo_Test{
    @Test
    public void checkMultipleOfThree() {
	RelationalOperatorPracticeTwo varOne = new RelationalOperatorPracticeTwo();
	assertTrue(varOne.multipleOfThree(1) == false);
	assertTrue(varOne.multipleOfThree(3) == true);
	assertTrue(varOne.multipleOfThree(9) == true);
	assertTrue(varOne.multipleOfThree(23) == false);
	assertTrue(varOne.multipleOfThree(360) == true);
	}
}