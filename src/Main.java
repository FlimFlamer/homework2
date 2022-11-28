public class Main {
    public static void main (String[] args) {

        //Задание 1
        System.out.println("Задача 1");
        System.out.println();
        int integerMiddle2 = 541;
        byte integerSmall = 24;
        short integerMiddle = 123;
        long integerBig = 7652;
        float floatingPoint = 10.3f;
        double floatingPointBig = 124.15;

        System.out.println("Значение переменной 'integerMiddle2' с типом 'int' равно " + integerMiddle2);
        System.out.println("Значение переменной 'integerMiddle' с типом 'short' равно " + integerMiddle);
        System.out.println("Значение переменной 'integerSmall' с типом 'byte' равно " + integerSmall);
        System.out.println("Значение переменной 'integerBig' с типом 'long' равно " + integerBig);
        System.out.println("Значение переменной 'integerPoint' с типом 'float' равно " + floatingPoint);
        System.out.println("Значение переменной 'integerPointBig' с типом 'double' равно " + floatingPointBig);
        System.out.println();

        //задача 2

        System.out.println("Задача 2");
        System.out.println();
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = false;
        short e = 569;
        short f = -159;
        short g = 27897;
        byte h = 97;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println();

        //задача 3

        System.out.println("Задача 3");
        System.out.println();
        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int pupils = lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println("На каждого ученика рассчитано " + (paper/pupils) + " листов бумаги.");
        System.out.println();

        //задача 4

        System.out.println("Задача 4");
        System.out.println();
        byte boatlePerMinute = 8;
        int boatle20 = boatlePerMinute * 20;
        System.out.println("За 20 минут нашина произвела бутылок - " + boatle20 + " штук.");
        int boatleDay = boatlePerMinute * 1440;
        System.out.println("За сутки нашина произвела бутылок - " + boatleDay + " штук.");
        int boatleThreeDays = boatleDay * 3;
        System.out.println("За три дня нашина произвела бутылок - " + boatleThreeDays + " штук.");
        int boatleMonth = boatleDay * 30;
        System.out.println("За месяц машина произвела бутылок - " + boatleMonth + " штук.");
        System.out.println();

        //задача 5
        System.out.println("Задача 5");
        System.out.println();
        short tinPaint = 120;
        byte classroomWhitePaint = 2;
        byte classroomBrownPaint = 4;
        int classroomPaints = classroomBrownPaint + classroomWhitePaint;
        int classroom = tinPaint / classroomPaints;
        System.out.println("В школе, где " + classroom + " классов, нужно " + (classroom * classroomWhitePaint) + " банок белой краски и " + (classroom * classroomBrownPaint) + " банок коричневой краски.");
        System.out.println();

        // задача 6

        System.out.println("Задача 6");
        System.out.println();
        int weightBanana = 80 * 5;
        int weightMilk = 105 * 2;
        int weightIceCream = 100 * 2;
        int weightEgs = 4 * 70;
        int weightAllGramm = weightBanana + weightMilk + weightIceCream + weightEgs;
        float weightAllKg = weightAllGramm / 100f;
        System.out.println("Общий вес спорт завтрака для спортсменов, который отдает повар, составляет " + weightAllGramm + " грамм, или же " + weightAllKg + " килограмм." );
        System.out.println();

        // Задача 7

        System.out.println("Задача 7");
        System.out.println();
        short finalWeight = 7000;
        short firstRation = 250;
        short secondRation = 500;
        System.out.println("Если спортсмен будет худеть на " + firstRation + " в день, то он похудеет на " + finalWeight + " в среднем через " + (finalWeight/firstRation) + " дней.");
        System.out.println("Если спортсмен будет худеть на " + secondRation + " в день, то он похудеет на " + finalWeight + " в среднем через " + (finalWeight/secondRation) + " дней.");
        System.out.println();

        //Задача 8

        System.out.println("Задача 8");
        System.out.println();
        int mashaIncome = 67760;
        int denisIncome = 83690;
        int kristinaIncome = 76230;
        double mashaIncome10 = mashaIncome + (mashaIncome * 0.1);
        double denisIncome10 = denisIncome + (denisIncome * 0.1);
        double kristinaIncome10 = kristinaIncome + (kristinaIncome * 0.1);
        System.out.println("Маша теперь получает " + mashaIncome10 + " рублей. Годовой доход вырос на " + (mashaIncome10 - mashaIncome) + " рублей");
        System.out.println("Денис теперь получает " + denisIncome10 + " рублей. Годовой доход вырос на " + (denisIncome10 - denisIncome) + " рублей");
        System.out.println("Кристина теперь получает " + kristinaIncome10 + " рублей. Годовой доход вырос на " + (kristinaIncome10 - kristinaIncome) + " рублей");
        System.out.println();

    }
}