package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class RelationalOperatorPractiseOne_Test{
    @Test
    public void checkExampleMethod() {
	RelationalOperatorPractiseOne varOne = new RelationalOperatorPractiseOne();
	assertTrue(varOne.exampleMethod(true,true) == true);
	assertTrue(varOne.exampleMethod(true,false) == false);
	assertTrue(varOne.exampleMethod(false,true) == false);
	assertTrue(varOne.exampleMethod(false,false) == true);
	}
}