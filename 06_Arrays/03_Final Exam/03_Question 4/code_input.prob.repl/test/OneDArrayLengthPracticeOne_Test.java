package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class OneDArrayLengthPracticeOne_Test{
    @Test
    public void checkFirstOrLastSix() {
	OneDArrayLengthPracticeOne varOne = new OneDArrayLengthPracticeOne();
	int[] varTwo = {1,6,6,0,6,0};
	int[] varThree = {0,6,6,6,6,6,66,6,6,0};
	int[] varFour = {6,9,9,3,4,5,9};
	int[] varFive = {0,9,0,8,0,6,5,40,3,0,9,9,9,9,9,6};
	int[] varSix = {6,9,0,8,0,6,5,40,3,0,9,9,9,9,9,6};
	assertTrue(varOne.firstOrLastSix(varTwo) == false);
	assertTrue(varOne.firstOrLastSix(varThree) == false);
	assertTrue(varOne.firstOrLastSix(varFour) == true);
	assertTrue(varOne.firstOrLastSix(varFive) == true);
	assertTrue(varOne.firstOrLastSix(varSix) == true);
	}
}