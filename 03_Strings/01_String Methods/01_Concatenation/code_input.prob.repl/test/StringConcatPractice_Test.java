package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class StringConcatPractice_Test{
    @Test
    public void checkGreeting() {
	StringConcatPractice varOne = new StringConcatPractice();
	assertTrue(varOne.greeting("name").equals("Hello name!"));
	assertTrue(varOne.greeting("").equals("Hello !"));
	assertTrue(varOne.greeting(" ").equals("Hello  !"));
	assertTrue(varOne.greeting("bob").equals("Hello bob!"));
	}
}