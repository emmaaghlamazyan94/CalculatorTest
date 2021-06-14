package UnitTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTest extends BaseTest {
    @Test(dataProvider = "values", groups = "longSubtraction")
    public void subTest(long firstNum, long secondNum, long expectedResult) {
        long sub = calculator.sub(firstNum, secondNum);
        Assert.assertEquals(sub, expectedResult, "Invalid result of subtraction");
    }

    @DataProvider(name = "values")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {23, 5, 18},
                {3, -10, 13},
                {30, 0, 30}
        };
    }
}