public class Main {
    public static void main(String[] args) {

        //Задача 1
        int value = 1009;
        byte bit = 25;
        short size = 599;
        long stellarDistance = 100050023L;
        float coords = 199.2356f;
        double preciseCoords = 123568.12368554;

        System.out.println("Значение переменной value с типом integer равно: " + value + ".");
        System.out.println("Значение переменной bit с типом byte равно: " + bit + ".");
        System.out.println("Значение переменной size с типом short равно: " + size + ".");
        System.out.println("Значение переменной stellarDistance с типом long равно: " + stellarDistance + ".");
        System.out.println("Значение переменной coords с типом float равно: " + coords + ".");
        System.out.println("Значение переменной preciseCoords с типом double равно: " + preciseCoords + ".");
        System.out.println();

        //Задача 2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        //Задача 3
        byte pupilsLP = 23;
        byte pupilsAS = 27;
        byte pupilsEA = 30;
        short paperSheets = 480;
        int paperPerPupil = paperSheets / (pupilsAS + pupilsEA + pupilsLP);
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги.");
        System.out.println();

        //Задача 4
        byte bottlesPerMinute = 16/2;
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок.");
        System.out.println();

        //Задача 5
        byte paintCansPerClass = 2 + 4;
        short totalPaintCans = 120;
        int totalClasses = totalPaintCans / paintCansPerClass;
        int totalWhiteCans = totalClasses * 2;
        int totalBrownCans = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски.");
        System.out.println();

        //Задача 6
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int recipeWeightGrammes = (bananaWeight * 5) + (milkWeight * 2) + (iceCreamWeight * 2) + (eggWeight * 4);
        float recipeWeightKilos = recipeWeightGrammes / 1000f;
        System.out.println("Вес рецепта в граммах равен " + recipeWeightGrammes);
        System.out.println("Вес рецепта в килограммах равен " + recipeWeightKilos);
        System.out.println();

        //Задача 7
        short weightToLose = 7000;
        short leastWeightLossPerDay = 250;
        short mostWeightLossPerDay = 500;
        int averageWeightLossPerDay = (leastWeightLossPerDay + mostWeightLossPerDay) / 2;
        int longestWeightLoss = weightToLose / leastWeightLossPerDay;
        int shortestWeightLoss = weightToLose / mostWeightLossPerDay;
        float averageWeightLoss = (float) weightToLose / averageWeightLossPerDay;
        System.out.println("Самый длительный промежуток для похудения " + longestWeightLoss + " дней, самый короткий промежуток для похудения " + shortestWeightLoss + " дней, в среднем на похудение уйдёт " + averageWeightLoss + " дней.");
        System.out.println();

        //Задача 8
        int mashaCurrentWage = 67760;
        int denisCurrentWage = 83690;
        int kristinaCurrentWage = 76230;
        float wageIncreaseCoefficient = 0.1f;
        float mashaWageIncrease = mashaCurrentWage * wageIncreaseCoefficient;
        float denisWageIncrease = denisCurrentWage * wageIncreaseCoefficient;
        float kristinaWageIncrease = kristinaCurrentWage * wageIncreaseCoefficient;
        float mashaNextYearWage = mashaCurrentWage + mashaWageIncrease;
        float denisNextYearWage = denisCurrentWage + denisWageIncrease;
        float kristinaNextYearWage = kristinaCurrentWage + kristinaWageIncrease;
        System.out.println("Маша теперь получает " + mashaNextYearWage + " рублей. Годовой доход вырос на " + mashaWageIncrease + " рублей.");
        System.out.println("Денис теперь получает " + denisNextYearWage + " рублей. Годовой доход вырос на " + denisWageIncrease + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNextYearWage + " рублей. Годовой доход вырос на " + kristinaWageIncrease + " рублей.");
    }
}