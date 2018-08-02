package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ToStringPractise_Test{
    @Test
    public void checkDetectOne() {
	ToStringPractise varOne = new ToStringPractise();
	assertTrue(varOne.detectOne(12311313) == true);
	assertTrue(varOne.detectOne(23745) == false);
	assertTrue(varOne.detectOne(4757630) == false);
	assertTrue(varOne.detectOne(99481234) == true);
	assertTrue(varOne.detectOne(111111) == true);
	}
}