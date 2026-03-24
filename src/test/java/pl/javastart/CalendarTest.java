package pl.javastart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    private Calendar calendar;

    @BeforeEach
    public void init() {
        calendar = new Calendar();
    }

    @DisplayName("2018 June -> 30")
    @Test
    public void shouldReturn30WhenYear2018AndMonth6() {
        // given
        int year = 2018;
        int month = 6;

        // when
        int result = calendar.getDayCount(year, month);

        // then
        Assertions.assertEquals(30, result);
    }

    @DisplayName("2018 July -> 31")
    @Test
    public void shouldReturn31WhenYear2018AndMonth7() {
        // given
        int year = 2018;
        int month = 7;

        // when
        int result = calendar.getDayCount(year, month);

        // then
        Assertions.assertEquals(31, result);
    }

    @DisplayName("2018 August -> 31")
    @Test
    public void shouldReturn31WhenYear2018AndMonth8() {
        // given
        int year = 2018;
        int month = 8;

        // when
        int result = calendar.getDayCount(year, month);

        // then
        Assertions.assertEquals(31, result);
    }

    @DisplayName("2018 February -> 28")
    @Test
    public void shouldReturn28WhenYear2018AndMonth2() {
        // given
        int year = 2018;
        int month = 2;

        // when
        int result = calendar.getDayCount(year, month);

        // then
        Assertions.assertEquals(28, result);
    }

    @DisplayName("2016 February -> 29")
    @Test
    public void shouldReturn29WhenYear2016AndMonth2() {
        // given
        int year = 2016;
        int month = 2;

        // when
        int result = calendar.getDayCount(year, month);

        // then
        Assertions.assertEquals(29, result);
    }

    @DisplayName("2010 February -> 28")
    @Test
    public void shouldReturn28WhenYear2010AndMonth2() {
        // given
        int year = 2010;
        int month = 2;

        // when
        int result = calendar.getDayCount(year, month);

        // then
        Assertions.assertEquals(28, result);
    }

    @DisplayName("2100 February -> 28")
    @Test
    public void shouldReturn28WhenYear2100AndMonth2() {
        // given
        int year = 2100;
        int month = 2;

        // when
        int result = calendar.getDayCount(year, month);

        // then
        Assertions.assertEquals(28, result);
    }

    @DisplayName("2000 February -> 29")
    @Test
    public void shouldReturn29WhenYear2000AndMonth2() {
        // given
        int year = 2000;
        int month = 2;

        // when
        int result = calendar.getDayCount(year, month);

        // then
        Assertions.assertEquals(29, result);
    }

}