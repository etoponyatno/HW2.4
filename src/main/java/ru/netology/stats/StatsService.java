package ru.netology.stats;

public class StatsService {

    public long totalSells(long[] months){
        long sum = 0;
        for (long month : months) {
            sum += month;}
        return sum;
    }


    public long averageSells(long[] months){
        return totalSells(months) / months.length;
    }

    public long maxSellMonth(long[] months){
        long max=months[0];
        long monthNumber = 0;
        int i;
        for (i=0; i< months.length; i++) {
            if (max<=months[i]){
                max = months[i];
                monthNumber = i+1;
            }
        }
        return monthNumber;
    }

    public long minSellMonth(long[] months){
        long min = months[0];
        long monthNumber = 0;
        int i;
        for (i=0; i< months.length; i++) {
            if (min>=months[i]){
            min = months[i];
            monthNumber = i+1;
            }
        }
        return monthNumber;
    }

    public long badMonthsCount(long[] months){
        long badCount = 0;
        long average = averageSells(months);
        for (long month : months){
            if (month<average){
                badCount+=1;
            }
        }
        return badCount;
    }

    public long goodMonthsCount(long[] months) {
        long goodCount = 0;
        long average = averageSells(months);
        for (long month : months) {
            if (month > average) {
                goodCount += 1;
            }
        }
        return goodCount;
    }


}


