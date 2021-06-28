package UnitTest;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected Calculator calculator;

    @BeforeClass(groups = {"long", "double", "doubleDivision"})
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterClass(groups = {"long", "double", "doubleDivision"})
    public void tearDown() {
        calculator = null;
    }
}