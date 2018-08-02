package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ShortCircuitPractise_Test{
    @Test
    public void checkIsTeenager() {
	ShortCircuitPractise varOne = new ShortCircuitPractise();
	assertTrue(varOne.isTeenager(0,0,0) == false);
	assertTrue(varOne.isTeenager(12,20,12) == false);
	assertTrue(varOne.isTeenager(13,13,13) == true);
	assertTrue(varOne.isTeenager(13,19,2) == true);
	assertTrue(varOne.isTeenager(2,30,15) == true);
	assertTrue(varOne.isTeenager(20,15,70) == true);
	}
}