package ru.netology.stats;

public class StatsService {
    public long cuclulateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long culculateAverege(long[] sales) {
        long sum = cuclulateSum(sales);
        return sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int culcAmountMinSales(long[] sales) {
        int month = 0;
        long sum = cuclulateSum(sales);
        long averegeSum = sum / sales.length;
        for (long sale : sales) {
            if (sale < averegeSum) {
                month = month + 1;
            } else
            month = month;
        }
        return month;
    }


    public int culcAmountMaxSales(long[] sales) {
        int month = 0;
        long sum = cuclulateSum(sales);
        long averegeSum = sum / sales.length;
        for (long sale : sales) {
            if (sale >= averegeSum) {
                month = month + 1;
            } else
            month = month;
        }
        return month;
    }
}


