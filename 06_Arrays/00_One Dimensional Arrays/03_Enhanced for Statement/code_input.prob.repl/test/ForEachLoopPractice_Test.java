package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class ForEachLoopPractice_Test{
    @Test
    public void checkReturnArray() {
	ForEachLoopPractice varOne = new ForEachLoopPractice();
	int[] varTwo = {0,0,0};
	int[] varThree = {1,2,4,4,5};
	int[] varFour = {0,122,3,0,3};
	int[] varFive = {5,-50,23,40};
	assertTrue(varOne.returnArray(varTwo) == 0);
	assertTrue(varOne.returnArray(varThree) == 16);
	assertTrue(varOne.returnArray(varFour) == 128);
	assertTrue(varOne.returnArray(varFive) == 18);
	}
}