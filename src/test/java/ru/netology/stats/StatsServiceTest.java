package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void totalSells() {
        long expected = 180;
        long actual = service.totalSells(months);
        assertEquals(expected,actual);
    }

    @Test
    void averageSells() {
        long expected = 15;
        long actual = service.averageSells(months);
        assertEquals(expected,actual);
    }

    @Test
    void maxSellMonth() {
        long expected = 6;
        long actual = service.maxSellMonth(months);
        assertEquals(expected,actual);
    }

    @Test
    void minSellMonth() {
        long expected = 9;
        long actual = service.minSellMonth(months);
        assertEquals(expected,actual);
    }

    @Test
    void badMonthsCount() {
        long expected = 5;
        long actual = service.badMonthsCount(months);
        assertEquals(expected,actual);
    }

    @Test
    void goodMonthsCount() {
        long expected = 5;
        long actual = service.goodMonthsCount(months);
        assertEquals(expected,actual);
    }
}