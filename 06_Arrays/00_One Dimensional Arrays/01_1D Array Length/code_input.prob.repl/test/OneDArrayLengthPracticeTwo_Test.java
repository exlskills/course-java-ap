package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class OneDArrayLengthPracticeTwo_Test{
    @Test
    public void checkCommonStartEnd() {
	OneDArrayLengthPracticeTwo varOne = new OneDArrayLengthPracticeTwo();
	int[] varTwo = {1,6,6,0,6,0};
	int[] varThree = {1,6,6,6,6,6,66,6,6,1};
	int[] varFour = {2,9,9,3,4,5,1};
	int[] varFive = {2,9,0,8,0,6,5,40,3,0,9,9,9,9,9,3};
	int[] varSix = {62,9,0,8,0,6,5,40,3,0,9,9,9,9,9,10};
	assertTrue(varOne.commonStartEnd(varTwo,varThree) == true);
	assertTrue(varOne.commonStartEnd(varTwo,varFour) == false);
	assertTrue(varOne.commonStartEnd(varTwo,varFive) == false);
	assertTrue(varOne.commonStartEnd(varTwo,varSix) == false);
	assertTrue(varOne.commonStartEnd(varThree,varFour) == true);
	assertTrue(varOne.commonStartEnd(varThree,varFive) == false);
	assertTrue(varOne.commonStartEnd(varThree,varSix) == false);
	assertTrue(varOne.commonStartEnd(varFour,varFive) == true);
	assertTrue(varOne.commonStartEnd(varFour,varSix) == false);
	assertTrue(varOne.commonStartEnd(varFive,varSix) == false);
	}
}