package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ConditionalAndPractiseTwo_Test{
    @Test
    public void checkPartyBalloons() {
	ConditionalAndPractiseTwo varOne = new ConditionalAndPractiseTwo();
	assertTrue(varOne.partyBalloons(30, false) == false);
	assertTrue(varOne.partyBalloons(50, false) == true);
	assertTrue(varOne.partyBalloons(70, true) == true);
	assertTrue(varOne.partyBalloons(39, true) == false);
	assertTrue(varOne.partyBalloons(60,false) == true);
	assertTrue(varOne.partyBalloons(1000,true) == true);
	assertTrue(varOne.partyBalloons(1000,false) == false);
	}
}