public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        byte a = 56;
        short b = -1257;
        int c = 763789;
        long d = 133948398493498L;
        float e = 25.545f;
        double g = 23434.45778376;

        System.out.println("task1: ");
        System.out.println("Значение переменной a с типом byte равно " + a + ";");
        System.out.println("Значение переменной b с типом short равно " + b + ";");
        System.out.println("Значение переменной c с типом int равно " + c + ";");
        System.out.println("Значение переменной d с типом long равно " + d + ";");
        System.out.println("Значение переменной e с типом float равно " + e + ";");
        System.out.println("Значение переменной g с типом double равно " + g + ".");
    }

    public static void task2() {
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int sheets = 480;
        int numberOfStudents = sheets / (studentsLP + studentsAS + studentsEA);
        System.out.println("task3: ");
        System.out.println("На каждого ученика рассчитано " + numberOfStudents + " листов бумаги.");
    }

    public static void task4() {
        int machinePerformance = 16 / 2;
        int machinePerformance1 = machinePerformance * 20;
        int machinePerformance2 = machinePerformance * 1440;
        int machinePerformance3 = machinePerformance * 4320;
        int machinePerformance4 = machinePerformance * 43200;
        System.out.println("task4: ");
        System.out.println("За 20 минут машина произвела " + machinePerformance1 + " штук бутылок;");
        System.out.println("За сутки машина произвела " + machinePerformance2 + " штук бутылок;");
        System.out.println("За 3 дня машина произвела " + machinePerformance3 + " штук бутылок;");
        System.out.println("За 1 месяц машина произвела " + machinePerformance4 + " штук бутылок.");
    }

    public static void task5() {
        int totalCans = 120;
        int cansOfWhitePaint = 2;
        int cansOfBrownPaint = 4;
        int numberOfClasses = totalCans / (cansOfWhitePaint + cansOfBrownPaint);
        int totalCansOfWhitePaint = numberOfClasses * cansOfWhitePaint;
        int totalCansOfBrownPaint = numberOfClasses * cansOfBrownPaint;
        System.out.println("task5: ");
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalCansOfWhitePaint + " банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски.");
    }

    public static void task6() {
        int bananaWeight = 80;
        int milkWeight_100 = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        int numberOfBananas = 5;
        int amountOfMilk_100 = 2;
        int amountOfIceCream = 2;
        int numberOfEggs = 4;

        int breakfastWeight_g = bananaWeight * numberOfBananas + milkWeight_100 * amountOfMilk_100 + iceCreamWeight * amountOfIceCream + eggWeight * numberOfEggs;
        double breakfastWeight_kg = (double) breakfastWeight_g / 1000;

        System.out.println("task6: ");
        System.out.println("Вес такого завтрака в граммах равен  " + breakfastWeight_g + " г.");
        System.out.println("Вес такого завтрака в килограммах равен  " + breakfastWeight_kg + " кг.");
    }

    public static void task7() {
        int needToReset_kg = 7;
        int needToReset_g = needToReset_kg * 1000;
        int weightLoss1 = 250;
        int weightLoss2 = 500;
        int daysOfWeightLoss1 = needToReset_g / weightLoss1;
        int daysOfWeightLoss2 = needToReset_g / weightLoss2;
        int daysOfWeightLossOnAverage = (daysOfWeightLoss1 + daysOfWeightLoss2) / 2;
        System.out.println("task7: ");
        System.out.println("У спорсмена уйдет " + daysOfWeightLoss1 + " дней на похудение, если спортсмен будет терять каждый день по " + weightLoss1 + " грамм.");
        System.out.println("У спорсмена уйдет " + daysOfWeightLoss2 + " дней на похудение, если спортсмен будет терять каждый день по " + weightLoss2 + " грамм.");
        System.out.println("Cпортсмену может потребоваться " + daysOfWeightLossOnAverage + " день в среднем, чтобы добиться результата похудения.");
    }

    public static void task8() {
        int salary_Masha = 67760;
        int salary_Denis = 83690;
        int salary_Kristina = 76230;

        float newSalary_Masha = salary_Masha * 1.1f;
        float newSalary_Denis = salary_Denis * 1.1f;
        float newSalary_Kristina = salary_Kristina * 1.1f;

        float incomeDifference_Masha = newSalary_Masha - salary_Masha;
        float incomeDifference_Denis = newSalary_Denis - salary_Denis;
        float incomeDifference_Kristina = newSalary_Kristina - salary_Kristina;

        System.out.println("task8: ");
        System.out.println("Маша теперь получает " + newSalary_Masha + " рублей. Годовой доход вырос на " + incomeDifference_Masha + " рублей.");
        System.out.println("Денис теперь получает " + newSalary_Denis + " рублей. Годовой доход вырос на " + incomeDifference_Denis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalary_Kristina + " рублей. Годовой доход вырос на " + incomeDifference_Kristina + " рублей.");
    }
}
