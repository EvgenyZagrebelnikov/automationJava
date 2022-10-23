import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    //Positive
    @Test
    public void testNumbersOddIndeces_HappyPath() {
        int[] numbers = {-45, 590, 234 ,985, 12, 68, 40};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(numbers);

        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testNumbersOddIndecesTwo_HappyPath() {
        int[] numbers = {-45, 590};
        int[] expectedResult = {590};

        int[] actualResult = new OddIndices().oddIndices(numbers);

        Assert.assertEquals(actualResult, expectedResult);

    }@Test
    public void testNumbersOddIndecesOne_HappyPath() {
        int[] numbers = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(numbers);

        Assert.assertEquals(actualResult, expectedResult);

    }
    //Negative
    @Test
    public void testNumbersOddIndecesNull_Negative() {
        int[] numbers = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(numbers);

        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testNumbersOddIndecesEmpty_Negative() {
        int[] numbers = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(numbers);

        Assert.assertEquals(actualResult, expectedResult);

    }


}
