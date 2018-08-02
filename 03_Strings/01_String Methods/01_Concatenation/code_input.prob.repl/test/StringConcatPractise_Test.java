package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class StringConcatPractise_Test{
    @Test
    public void checkGreeting() {
	StringConcatPractise varOne = new StringConcatPractise();
	assertTrue(varOne.greeting("name").equals("Hello name!"));
	assertTrue(varOne.greeting("").equals("Hello !"));
	assertTrue(varOne.greeting(" ").equals("Hello  !"));
	assertTrue(varOne.greeting("bob").equals("Hello bob!"));
	}
}