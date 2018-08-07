package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class BaseCasePractice_Test{
    @Test
    public void checkBaseCase() {
	BaseCasePractice varOne = new BaseCasePractice();
	assertTrue(varOne.multipleOfTwo(0) == 0);
	assertTrue(varOne.multipleOfTwo(1) == 2);
	assertTrue(varOne.multipleOfTwo(2) == 4);
	assertTrue(varOne.multipleOfTwo(3) == 6);
	assertTrue(varOne.multipleOfTwo(11) == 22);
	assertTrue(varOne.multipleOfTwo(111) == 222);
	}
}