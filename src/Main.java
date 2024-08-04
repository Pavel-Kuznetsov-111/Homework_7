import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");

        double deposit = 15000;
        double total = 0;
        int month = 0;
        while (total < 2459000) {
            total += deposit;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача №2");
        int i = 1;
        int y = 10;
        while (i < 11) {
            System.out.print(i);
            i = i + 1;
        }
        System.out.println();
        while (y > 0) {
            System.out.print(y);
            y = y - 1;
        }

        System.out.println();
        System.out.println("Задача №3");
        int populationSize = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            int birthRate = 17 * populationSize / 1000;
            int deathRate = 8 * populationSize / 1000;
            populationSize = populationSize + birthRate - deathRate;
            System.out.println("Год " + year + ", численность населения составляет " + populationSize + " .");
        }
        System.out.println("Задача №4");
        int deposit2 = 15000;
        int total3 = 0;
        int percent = (deposit2 + 7) / 100;
        int depositPlusPercent = deposit2 + percent;
        int mount = 0;
        while (total3 <= 12_000_000) {
            mount++;
            total3 = total3 + depositPlusPercent;
            System.out.println("месяц " + mount + " сумма накоплений " + total3 + " рублей. ");


        }
        System.out.println("Задача №5");
        int deposit3 = 15000;
        int total4 = 0;
        int percent2 = (deposit3 + 7) / 100;
        int depositPlusPercent2 = deposit3 + percent2;
        int mount2 = 0;
        while (total4 <= 12_000_000 && mount2 < 24) {
            mount2 = mount2 + 6;
            total4 = total4 + depositPlusPercent2;
            System.out.println("месяц " + mount2 + " сумма накоплений " + total4 + " рублей. ");
        }
        System.out.println("Задача №6");
        int depositVasiliy = 15000;
        int mouthVasiliy = 0;
        while (mouthVasiliy < 108) {
            mouthVasiliy++;
            depositVasiliy = depositVasiliy + depositVasiliy * 7 / 100;
            if (mouthVasiliy % 6 == 0)
                System.out.println("Сумма накоплений за " + mouthVasiliy + " месяцев составит " + depositVasiliy);
        }
        System.out.println("За 9 лет сумма накоплений составит " + depositVasiliy);
        System.out.println("Задача №7");
        int oneFriday = 5;
        int number = 1;
        while (number < 26) {
            number = oneFriday;
            oneFriday = number + 7;
            System.out.println("Сегодня пятница, " + number + "-е число. Необходимо подготовить отчет");

        }
        System.out.println("Задача №8");
        int yearComet = 2017;
        int yearCometBefore = yearComet - 200;
        int yearCometAfter = yearComet + 100;
        while (yearCometBefore<yearCometAfter) {
            System.out.println(yearCometBefore);
            yearCometBefore=yearCometBefore+79;

        }


    }
}