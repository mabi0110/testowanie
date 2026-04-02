package pl.javastart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Junit5AssertionsTest {

    private final Junit5Assertions junit5Assertions = new Junit5Assertions();

    @Test
    public void shouldBePrimeWhenNumberIs2() {
        // given
        int number = 2;

        // when
        boolean actual = junit5Assertions.isPrimeNumber(number);

        // then
        assertTrue(actual);
    }

    @Test
    public void shouldNotBePrimeWhenNumberIs4() {
        // given
        int number = 4;

        // when
        boolean actual = junit5Assertions.isPrimeNumber(number);

        // then
        assertFalse(actual);
    }

    @Test
    public void shouldReturnValidCode() {
        // given
        String key = "1";

        // when
        Junit5Assertions.Code result = junit5Assertions.getCode(key);

        // then
        Assertions.assertEquals(key, result.getKey());
        Assertions.assertNotNull(result.getCode());
        Assertions.assertNotNull(result.getCreatedAt());
    }

    @Test
    public void shouldReturnSameObjects() {
        // given
        String key1 = "a";
        String key2 = "a";

        // when
        Junit5Assertions.Code result1 = junit5Assertions.getCode(key1);
        Junit5Assertions.Code result2 = junit5Assertions.getCode(key2);

        // then
        Assertions.assertSame(result1, result2);
    }
}