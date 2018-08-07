package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ForStatementPractice_Test{
    @Test
    public void checkMethod() {
	ForStatementPractice varOne = new ForStatementPractice();
	assertTrue(varOne.checkE("Hello") == true);
	assertTrue(varOne.checkE("abcdfkasdadso") == false);
	assertTrue(varOne.checkE("Ember") == true);
	assertTrue(varOne.checkE("Heeee") == false);
	assertTrue(varOne.checkE("eee") == true);
	assertTrue(varOne.checkE("eell") == true);
	}
}