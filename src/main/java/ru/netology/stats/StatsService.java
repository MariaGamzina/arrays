package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int average = sum / 12;
        return average;
    }

    public int maxSale(int[] sales) {
        int maxMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSale]) {
                maxMonthSale = i;
            }
        }
        return maxMonthSale + 1;
    }

    public int minSale(int[] sales) {
        int minMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSale]) {
                minMonthSale = i;
            }
        }
        return minMonthSale + 1;
    }

    public int lowAverageSales(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int average = sum / 12;

        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int highAverageSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int average = sum / 12;

        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}

