package exlcode;
import org.junit.*;
import static org.junit.Assert.*;

public class CreateOneDArrayPractice_Test{
    @Test
    public void checkCompareArr() {
	CreateOneDArrayPractice varOne = new CreateOneDArrayPractice();
	int[] varTwo = {0,0};
	int[] varThree = {0,1};
	int[] varFour = {1,0};
	int[] varFive = {1,1};
	assertTrue(varOne.compareArr(varTwo, varThree) == varThree);
	assertTrue(varOne.compareArr(varTwo, varFour) == varFour);
	assertTrue(varOne.compareArr(varTwo, varFive) == varFive);
	assertTrue(varOne.compareArr(varThree, varFour) == varThree);
	assertTrue(varOne.compareArr(varThree, varFive) == varFive);
	assertTrue(varOne.compareArr(varFour, varThree) == varFour);
	assertTrue(varOne.compareArr(varFour, varFive) == varFive);
	}
}