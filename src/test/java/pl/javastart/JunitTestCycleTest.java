package pl.javastart;

import org.junit.jupiter.api.Test;

public class JunitTestCycleTest {

    private int counter;

    @Test
    public void test1() {
        counter++;
        System.out.println("Test 1: " + this);
        System.out.println(counter);
    }

    @Test
    public void test2() {
        counter++;
        System.out.println("Test 2: " + this);
        System.out.println(counter);
    }
}
