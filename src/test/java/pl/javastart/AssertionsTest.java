package pl.javastart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    public void test() {

        long start = System.currentTimeMillis();

        String expected = "a";
        String actual = "a";

        Assertions.assertEquals(expected, actual, this::createMessage);
        System.out.println("Duration: " + (System.currentTimeMillis() - start));

    }

    private String createMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Values are not equal";
    }
}
