package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ToStringPractice_Test{
    @Test
    public void checkDetectOne() {
	ToStringPractice varOne = new ToStringPractice();
	assertTrue(varOne.detectOne(12311313) == true);
	assertTrue(varOne.detectOne(23745) == false);
	assertTrue(varOne.detectOne(4757630) == false);
	assertTrue(varOne.detectOne(99481234) == true);
	assertTrue(varOne.detectOne(111111) == true);
	}
}