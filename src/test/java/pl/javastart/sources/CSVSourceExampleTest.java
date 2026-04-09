package pl.javastart.sources;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvSources;
import org.junit.jupiter.params.provider.MethodSource;
import pl.javastart.AccessController;
import pl.javastart.SignupStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class CSVSourceExampleTest {

    @ParameterizedTest
    @CsvSource({"nowe, NEW", "zaakceptowane, APPROVED", "opłacone, PAID", "anulowane, CANCELED"})
    public void shouldProperlyRecognizeSignupStatus(String status, SignupStatus expectedSignupStatus) {
        // given
        AccessController accessController = new AccessController();

        // when
        SignupStatus signupStatus = accessController.determineSignupStatus(status);

        // then
        assertThat(signupStatus).isEqualTo(expectedSignupStatus);
    }
}
