import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test

    public void testCheckGreaterNumber_HappyPath() {

        int expectedResult = 9999;

        int actualResult = new BiggerValue().biggerValue(3333, 9999);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
