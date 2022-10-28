import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testValues_HappyPath() {
        int[] number = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(number);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testNegativeValues_HappyPath() {
        int[] number = {-6, -5};
        int expectedResult = -11;

        int actualResultResult = new SumArray().sumArray(number);

        Assert.assertEquals(expectedResult, actualResultResult);
    }

    @Test

    public void testZeroLengthArray_HappyPath() {
        int[] zeroLength = new int[0];
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(zeroLength);

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test

    public void testNullArray_HappyPath() {
        int[] zeroLength = null;
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(zeroLength);

        Assert.assertEquals(expectedResult,actualResult);
    }

}
