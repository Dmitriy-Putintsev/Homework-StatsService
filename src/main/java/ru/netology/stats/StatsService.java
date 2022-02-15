package ru.netology.stats;

public class StatsService {


    public int calculateSum(int[] salesByMonth) {
        int sum = 0;
        for (int saleByMonth : salesByMonth) {
            sum += saleByMonth;
        }
        return sum;
    }

    public int averageSalesSumMonth(int[] salesByMonth) {
        return calculateSum(salesByMonth) / salesByMonth.length;
    }

    public int maxPeakSales(int[] salesByMonth) {
        int maxSalesMonth = 0;
        int month = 0;
        for (int saleByMonth : salesByMonth) {

            if (saleByMonth >= salesByMonth[maxSalesMonth]) {
                maxSalesMonth = month;
            }
            month = month + 1;
        }
        return maxSalesMonth + 1;
    }

    public int minSales(int[] salesByMonth) {
        int minSalesMonth = 0;
        int month = 0;
        for (int saleByMonth : salesByMonth) {

            if (saleByMonth <= salesByMonth[minSalesMonth]) {
                minSalesMonth = month;
            }
            month = month + 1;
        }
        return minSalesMonth + 1;
    }

    public int theNumberOfMonthsIsBelowAverage(int[] salesByMonth) {
        int monthsAmount = 0;
        int averageSalesSumMonth = averageSalesSumMonth(salesByMonth);
        for (int saleByMonth : salesByMonth) {
            if (saleByMonth < averageSalesSumMonth) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    public int theNumberOfMonthsIsAboveAverage(int[] salesByMonth) {
        int monthsAmount = 0;
        int averageSalesSumMonth = averageSalesSumMonth(salesByMonth);
        for (int saleByMonth : salesByMonth) {
            if (saleByMonth > averageSalesSumMonth) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }
}
