package pl.javastart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    public void test() {

        String expected = "a";
        String actual = "b";

        Assertions.assertEquals(expected, actual, "Wartosci nie sa rowne");

    }
}
