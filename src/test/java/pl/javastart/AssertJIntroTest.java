package pl.javastart;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class AssertJIntroTest {

    @Test
    public void shouldEndWithA() {

        String name = "Dorota";

        assertThat(name).endsWith("a");
    }

    @Test
    public void shouldBeTheSameName() {

        String name1 = "Dorota";
        String name2 = "Dorota";

        assertThat(name1).isEqualTo(name2);
    }

    @Test
    public void shouldBeTheSameNameWith6CharactersEndsWithA() {

        String name1 = "Dorota";
        String name2 = "Dorota";

        assertThat(name1)
                .isEqualTo(name2)
                .hasSize(6)
                .endsWith("a");
    }

    @Test
    public void multipleAssertionsWithJUnit() {

        String name1 = "Dorota";
        String name2 = "Dorota";

        assertAll(
                () -> assertThat(name1).isEqualTo(name2),
                () -> assertThat(name1).hasSize(6),
                () -> assertThat(name1).endsWith("a")
        );
    }

    @Test
    public void multipleAssertionsWithAssertJ() {

        String name1 = "Dorota";
        String name2 = "Dorota";

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(name1).isEqualTo(name2);
        softAssertions.assertThat(name1).hasSize(6);
        softAssertions.assertThat(name1).endsWith("a");
        softAssertions.assertAll();;
    }

}
