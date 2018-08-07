package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class IterationOneDArrayPractice_Test{
    @Test
    public void checkCountNine() {
	IterationOneDArrayPractice varOne = new IterationOneDArrayPractice();
	int[] varTwo = {0,0,0,0,0,0};
	int[] varThree = {1,1,1,1,11,1,9};
	int[] varFour = {9,9,9,3,4,5,9};
	int[] varFive = {0,9,0,8,0,6,5,40,3,0,9,9,9,9,9,9};
	assertTrue(varOne.countNine(varTwo) == 0);
	assertTrue(varOne.countNine(varThree) == 1);
	assertTrue(varOne.countNine(varFour) == 4);
	assertTrue(varOne.countNine(varFive) == 7);
	}
}