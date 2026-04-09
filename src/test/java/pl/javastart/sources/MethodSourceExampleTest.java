package pl.javastart.sources;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pl.javastart.AccessController;
import pl.javastart.SignupStatus;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodSourceExampleTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void shouldProperlyRecognizeSignupStatus(String status, SignupStatus expectedSignupStatus) {
        // given
        AccessController accessController = new AccessController();

        // when
        SignupStatus signupStatus = accessController.determineSignupStatus(status);

        // then
        assertThat(signupStatus).isEqualTo(expectedSignupStatus);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
            Arguments.of("nowe", SignupStatus.NEW),
            Arguments.of("zaakceptowane", SignupStatus.APPROVED),
            Arguments.of("opłacone", SignupStatus.PAID),
            Arguments.of("anulowane", SignupStatus.CANCELED)
        );
    }
}
