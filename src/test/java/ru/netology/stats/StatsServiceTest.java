package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCuclulateSum() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.cuclulateSum(sales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCuclulateAverege() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.culculateAverege(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shouldFindMinSales() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }


    @Test
    void shoulCulcAmountMinSales() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.culcAmountMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoulCulcAmountMaxSales() {
        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        long actual = service.culcAmountMaxSales(sales);

        assertEquals(expected, actual);
    }
}