package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class SubstringPractise_Test{
    @Test
    public void checkRemoveStartEnd() {
	SubstringPractise varOne = new SubstringPractise();
	assertTrue(varOne.removeStartEnd("Hello").equals("ell"));
	assertTrue(varOne.removeStartEnd("asda").equals("sd"));
	assertTrue(varOne.removeStartEnd("10203").equals("020"));
	assertTrue(varOne.removeStartEnd("1asdak2l").equals("asdak2"));
	}
}