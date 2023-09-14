package ru.netology.stats;

public class StatsService {
    public int minSales(int[] sales) {              //номер месяца, в котором был минимум продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {              //номер месяца, в котором был пик продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int amountSales(int[] sales) {              //сумма всех продаж
        int amountSales = 0;

        for (int i = 0; i < sales.length; i++) {
            amountSales = amountSales + sales[i];
        }
        return amountSales;
    }

    public int avgAmountSales(int[] sales) {              //средняя сумма продаж в месяц
        int amountSales = 0;

        for (int i = 0; i < sales.length; i++) {
            amountSales = amountSales + sales[i];
        }
        return amountSales / sales.length;
    }

    public int belowAvgSales(int[] sales) {              //количество месяцев, в которых продажи были ниже среднего
        int numOfMonths = 0;
        int avgAmount = avgAmountSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgAmount) {
                numOfMonths++;
            }
        }
        return numOfMonths;
    }

    public int aboveAvgSales(int[] sales) {              //количество месяцев, в которых продажи были выше среднего
        int numOfMonths = 0;
        int avgAmount = avgAmountSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgAmount) {
                numOfMonths++;
            }
        }
        return numOfMonths;
    }
}