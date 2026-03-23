package pl.javastart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    private final Calendar calendar = new Calendar();


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