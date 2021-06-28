package UnitTest.JUnitTest;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Positive {
    Calculator calculator = new Calculator();

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"55", "-60", "0"})
    public void isPositive(long num) {
        Assertions.assertTrue(calculator.isPositive(num), "The number is negative");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}