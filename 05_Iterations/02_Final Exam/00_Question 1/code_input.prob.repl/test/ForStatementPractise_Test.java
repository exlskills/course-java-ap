package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ForStatementPractise_Test{
    @Test
    public void checkMethod() {
	ForStatementPractise varOne = new ForStatementPractise();
	assertTrue(varOne.checkE("Hello") == true);
	assertTrue(varOne.checkE("abcdfkasdadso") == false);
	assertTrue(varOne.checkE("Ember") == true);
	assertTrue(varOne.checkE("Heeee") == false);
	assertTrue(varOne.checkE("eee") == true);
	assertTrue(varOne.checkE("eell") == true);
	}
}