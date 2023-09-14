package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindMinSales() {
        StatsService statsService = new StatsService();
        int expected = 9;
        int actual = statsService.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService statsService = new StatsService();
        int expected = 8;
        int actual = statsService.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAmountSales() {
        StatsService statsService = new StatsService();
        int expected = 180;
        int actual = statsService.amountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAvgAmountSales() {
        StatsService statsService = new StatsService();
        int expected = 15;
        int actual = statsService.avgAmountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBelowAvgSales() {
        StatsService statsService = new StatsService();
        int expected = 5;
        int actual = statsService.belowAvgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAboveAvgSales() {
        StatsService statsService = new StatsService();
        int expected = 5;
        int actual = statsService.aboveAvgSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}