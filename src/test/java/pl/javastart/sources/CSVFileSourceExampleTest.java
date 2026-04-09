package pl.javastart.sources;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pl.javastart.AccessController;
import pl.javastart.SignupStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class CSVFileSourceExampleTest {

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
    public void shouldProperlyRecognizeSignupStatus(String status, SignupStatus expectedSignupStatus) {
        // given
        AccessController accessController = new AccessController();

        // when
        SignupStatus signupStatus = accessController.determineSignupStatus(status);

        // then
        assertThat(signupStatus).isEqualTo(expectedSignupStatus);
    }
}
