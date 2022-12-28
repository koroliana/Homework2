public class Main {
    private static double cat = 3.6;
    private static double dog = 8.0;
    private static int paper = 76378;

    public static void main(String[] args) {
        task1(cat, dog, paper);
        task2(cat, dog, paper);
        task3(cat, dog, paper);
        task4();
        task5();
        task6();
        task7();
        task8();

        task11();
        task12();
        task13();
        task14();

    }
    public static void task1 (double cat, double dog, int paper) {
        Main.cat = cat;
        Main.dog = dog;
        Main.paper = paper;
        System.out.println("Задача 1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();
    }

    public static void task2 (double cat, double dog, int paper) {
        Main.cat = cat;
        Main.dog = dog;
        Main.paper = paper;
        System.out.println("Задача 2");
        var n = 4;
        dog = dog + n;
        cat = cat + n;
        paper = paper + n;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();
    }

    public static void task3 (double cat, double dog, int paper) {
        Main.cat = cat;
        Main.dog = dog;
        Main.paper = paper;
        System.out.println("Задача 3");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
        System.out.println();
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog*10;
        System.out.println("frog = " + frog);
        frog = frog/3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
        System.out.println();
    }

    public static void task6 () {
        System.out.println("Задача 6");
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxerOneWeight + boxerTwoWeight));
        System.out.println("Разница между весами двух бойцов: " + (boxerOneWeight - boxerTwoWeight));
        System.out.println();
    }

    public static void task7 () {
        System.out.println("Задача 7");
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        System.out.println("Разница весов спортсменов: " + (boxerTwoWeight - boxerOneWeight));
        System.out.println("Остаток от деления большего на меньшее: " + (boxerTwoWeight%boxerOneWeight));
        System.out.println();
    }

    public static void task8 () {
        System.out.println("Задача 8");
        var сommonWorkHours = 640;
        var employeeCount = сommonWorkHours/8;
        System.out.println("Всего работников в компании — " + employeeCount + " человек");
        employeeCount = employeeCount + 94;
        сommonWorkHours = employeeCount*8;
        System.out.println("Если в компании работает " + employeeCount + " человек, то всего " + сommonWorkHours + " часа работы может быть поделено между сотрудниками");
        System.out.println();
    }

    public static void task11 () {
        System.out.println("Задача 1 из 2 части Переменных");
        int numberInt = 145000;
        byte numberByte = 8;
        short numberShort = 32000;
        long  numberLong = 118000000;
        float numberFloat = 15.9F;
        double numberDouble = 148200.04321;
        System.out.println("Значение переменной numberInt с типом int равно " + numberInt );
        System.out.println("Значение переменной numberByte с типом byte равно " + numberByte );
        System.out.println("Значение переменной numberShort с типом short равно " + numberShort );
        System.out.println("Значение переменной numberLong с типом long равно " + numberLong );
        System.out.println("Значение переменной numberFloat с типом float равно " + numberFloat );
        System.out.println("Значение переменной numberDouble с типом double равно " + numberDouble );
        System.out.println();
    }

    public static void task12 () {
        System.out.println("Задача 2 из 2 части Переменных");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("double a = " + a);
        System.out.println("long b = " + b);
        System.out.println("float c = " + c);
        System.out.println("short d = " + d);
        System.out.println("short e = " + e);
        System.out.println("double f = " + f);
        System.out.println("byte g = " + g);
        System.out.println();
    }

    public static void task13 () {
        System.out.println("Задача 3 из 2 части Переменных");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short lists = 480;
        int result = lists / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

        System.out.println();
    }

    public static void task14 () {
        System.out.println("Задача 4 из 2 части Переменных");
        byte machinePerformance = 16/2;
        byte firstPeriod = 20;
        short secondPeriod = 60*24;
        int thirdPeriod = secondPeriod*3;
        int fourthPeriod = thirdPeriod*10;
        System.out.println("За " + firstPeriod + " минут машина произвела " + machinePerformance*firstPeriod + " штук бутылок");
        System.out.println("За " + secondPeriod + " минут машина произвела " + machinePerformance*secondPeriod + " штук бутылок");
        System.out.println("За " + thirdPeriod + " минут машина произвела " + machinePerformance*thirdPeriod + " штук бутылок");
        System.out.println("За " + fourthPeriod + " минут машина произвела " + machinePerformance*fourthPeriod + " штук бутылок");
        System.out.println();
    }




}