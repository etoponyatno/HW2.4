package ru.netology.stats;

public class StatsService {
    public long totalSells(long[] months){
        long sum = 0;
        for (long month : months) {
            sum += month;}
        return sum;
    }


    public long averageSells(long[] months){
        StatsService service = new StatsService();
        return (service.totalSells(months) / months.length);
    }

    public long maxSellMonth(long[] months){
        long max=months[0];
        long monthNumber = 0;
        long i;
        for (i=0; i< months.length; i++) {
            if (max<=months[(int) i]){
                max = months[(int) i];
                monthNumber = i+1;
            }
        }
        return monthNumber;
    }

    public long minSellMonth(long[] months){
        long min = months[0];
        long monthNumber = 0;
        long i;
        for (i=0; i< months.length; i++) {
            if (min>=months[(int) i]){
            min = months[(int) i];
            monthNumber = i+1;
            }
        }
        return monthNumber;
    }

    public long badMonthsCount(long[] months){
        StatsService service = new StatsService();
        long badCount = 0;
        long average = service.averageSells(months);
        for (long month : months){
            if (month<average){
                badCount+=1;
            }
        }
        return badCount;
    }

    public long goodMonthsCount(long[] months) {
        StatsService service = new StatsService();
        long goodCount = 0;
        long average;
        average = service.averageSells(months);
        for (long month : months) {
            if (month > average) {
                goodCount += 1;
            }
        }
        return goodCount;
    }


}


