package pl.javastart;

import org.junit.jupiter.api.*;

import java.util.Random;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JunitTestCycleTest {

    private final Random random = new Random();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }

    @Test
    public void test1() {
        System.out.println(random.nextInt());
        System.out.println(random);
    }

    @Test
    public void test2() {
        System.out.println(random.nextInt());
        System.out.println(random);
    }
}
