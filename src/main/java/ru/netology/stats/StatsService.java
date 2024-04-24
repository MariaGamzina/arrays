package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSale(long[] sales) {
        int maxMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSale]) {
                maxMonthSale = i;
            }
        }
        return maxMonthSale + 1;
    }

    public int minSale(long[] sales) {
        int minMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSale]) {
                minMonthSale = i;
            }
        }
        return minMonthSale + 1;
    }

    public int lowAverageSales(long[] sales) {

        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int highAverageSales(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}

