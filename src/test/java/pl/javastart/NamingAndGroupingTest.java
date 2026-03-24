package pl.javastart;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NamingAndGroupingTest {

    @DisplayName("Calculator")
    @Nested
    class Calculator {
        @DisplayName("2 + 2 = 4")
        @Test
        public void shouldReturn4When2AddTo2() {

        }

        @DisplayName("3 + 4 = 7")
        @Test
        public void shouldReturn7When3AddTo4() {

        }
    }




}
