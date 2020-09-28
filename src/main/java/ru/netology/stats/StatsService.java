package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public long totalSells(long[] months){
        long sum = 0;
        for (long month : months) {
            sum += month;}
        return sum;
    }


    public long averageSells(long[] months){
        long sum = 0;
        for (long month : months) {
            sum += month;}
        return (sum / months.length);
    }

    public long maxSellMonth(long[] months){
        long max=0;
        long monthNumber = 1;
        for (long month : months) {
            if (max<=month){
            max = month;}
        }
        for (long month : months) {
            if (max != month) {
                monthNumber += 1;
            } else {break;}
        }
        return monthNumber;
    }

    public long minSellMonth(long[] months){
        long min = months[0];
        long monthNumber = 1;
        for (long month : months) {
            if (min>=month){
            min = month;}
        }
        for (long month : months) {
            if (min != month) {
                monthNumber += 1;
            } else {break;}
        }
        return monthNumber;}

    public long badMonthsCount(long[] months){
        long badCount = 0;
        long average = 0;
        long sum = 0;
        for (long month : months) {
            sum += month;}
        average = sum / months.length;
        for (long month : months){
            if (month<average){
                badCount+=1;
            }
        }
        return badCount;
    }

    public long goodMonthsCount(long[] months) {
        long goodCount = 0;
        long average = 0;
        long sum = 0;
        for (long month : months) {
            sum += month;
        }
        average = sum / months.length;
        for (long month : months) {
            if (month > average) {
                goodCount += 1;
            }
        }
        return goodCount;
    }


}


