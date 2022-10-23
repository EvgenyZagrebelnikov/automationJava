import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test

    public void testStartNegativeOddNumber_HappyPath() {
        //AAA
        int number = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test

    public void testStartNEvenNumber_HappyPath() {
        //AAA
        int number = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
