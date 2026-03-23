package pl.javastart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void shouldAdd5To7AndResult12() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;

        // when
        int result = calculator.add(a, b);

        // then
        Assertions.assertEquals(12, result);
    }

}