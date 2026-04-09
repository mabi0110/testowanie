package pl.javastart.sources;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pl.javastart.AccessController;
import pl.javastart.SignupStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class EnumSourceExampleTest {


    @ParameterizedTest
    @EnumSource(value = SignupStatus.class, mode = EnumSource.Mode.EXCLUDE, names = "PAID")
    public void shouldNotHaveAccess(SignupStatus signupStatus) {
        // given
        AccessController accessController = new AccessController();

        // when
        boolean hasAccess = accessController.checkAccessForSignupStatus(signupStatus);

        // then
        assertThat(hasAccess).isFalse();
    }
}
