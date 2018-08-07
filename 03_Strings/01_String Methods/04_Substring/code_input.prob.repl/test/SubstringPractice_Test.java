package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class SubstringPractice_Test{
    @Test
    public void checkRemoveStartEnd() {
	SubstringPractice varOne = new SubstringPractice();
	assertTrue(varOne.removeStartEnd("Hello").equals("ell"));
	assertTrue(varOne.removeStartEnd("asda").equals("sd"));
	assertTrue(varOne.removeStartEnd("10203").equals("020"));
	assertTrue(varOne.removeStartEnd("1asdak2l").equals("asdak2"));
	}
}