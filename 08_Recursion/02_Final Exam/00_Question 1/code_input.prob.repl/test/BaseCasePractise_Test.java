package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class BaseCasePractise_Test{
    @Test
    public void checkBaseCase() {
	BaseCasePractise varOne = new BaseCasePractise();
	assertTrue(varOne.multipleOfTwo(0) == 0);
	assertTrue(varOne.multipleOfTwo(1) == 2);
	assertTrue(varOne.multipleOfTwo(2) == 4);
	assertTrue(varOne.multipleOfTwo(3) == 6);
	assertTrue(varOne.multipleOfTwo(11) == 22);
	assertTrue(varOne.multipleOfTwo(111) == 222);
	}
}