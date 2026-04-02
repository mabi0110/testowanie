package pl.javastart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJIntroTest {

    @Test
    public void shouldEndWithA() {

        String name = "Dorota";

        Assertions.assertThat(name).endsWith("a");
    }

    @Test
    public void shouldBeTheSameName() {

        String name1 = "Dorota";
        String name2 = "Dorota";

        Assertions.assertThat(name1).isEqualTo(name2);
    }

    @Test
    public void shouldBeTheSameNameWith6CharactersEndsWithA() {

        String name1 = "Dorota";
        String name2 = "Dorota";

        Assertions.assertThat(name1)
                .isEqualTo(name2)
                .hasSize(6)
                .endsWith("a");
    }

}
