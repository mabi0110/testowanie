package pl.javastart.sources;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pl.javastart.EmailValidator;
import pl.javastart.FibonacciGenerator;

import static org.assertj.core.api.Assertions.assertThat;

public class ValueSourceExampleTest {

    @Test
    public void shouldBeValidEmail() {
        // given
        EmailValidator emailValidator = new EmailValidator();

        // when
        boolean isValid = emailValidator.isValid("anna@gmail.com");

        // then
        assertThat(isValid).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna@gmail.com", "ela@onet.pl"})
    public void shouldBeValidEmail(String email) {
        // given
        EmailValidator emailValidator = new EmailValidator();

        // when
        boolean isValid = emailValidator.isValid(email);

        // then
        assertThat(isValid).isTrue();
    }

    @DisplayName("Should be Fibonacci number")
    @ParameterizedTest(name = "{arguments} should be a Fibonacci number")
    @ValueSource(ints = {1, 2, 3, 5, 8, 13})
    public void shouldBeFibonacciNumbers(int number) {
        // given
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

        // when
        boolean isFibonacciNumber = fibonacciGenerator.checkIfFibonacciNumber(number);

        // then
        assertThat(isFibonacciNumber).isTrue();
    }
}
