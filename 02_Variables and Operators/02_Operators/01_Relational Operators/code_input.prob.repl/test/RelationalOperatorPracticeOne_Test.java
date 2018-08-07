package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class RelationalOperatorPracticeOne_Test{
    @Test
    public void checkExampleMethod() {
	RelationalOperatorPracticeOne varOne = new RelationalOperatorPracticeOne();
	assertTrue(varOne.exampleMethod(true,true) == true);
	assertTrue(varOne.exampleMethod(true,false) == false);
	assertTrue(varOne.exampleMethod(false,true) == false);
	assertTrue(varOne.exampleMethod(false,false) == true);
	}
}