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
        task15();
        task16();
        task17();
        task18();

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

    public static void task15 () {
        System.out.println("Задача 5 из 2 части Переменных");
        byte paintCans = 120;
        int classroomNumber = paintCans / 6 ;
        int whiteCans, brownCans;
        whiteCans = classroomNumber*2;
        brownCans = classroomNumber*4;
        System.out.println("В школе, где " + classroomNumber + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");
        System.out.println();
    }

    public static void task16 () {
        System.out.println("Задача 6 из 2 части Переменных");
        byte bananaWeignt = 80;
        byte milkHundredMl = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int breakfastWeight = 5*bananaWeignt + 2*milkHundredMl + 2*iceCreamWeight + 4*eggWeight;
        float breakfastWeightKilo = breakfastWeight / 1000F ;
        System.out.println("Спортзавтрак весит " + breakfastWeight + " граммов или " + breakfastWeightKilo + " килограмма");
        System.out.println();
    }

    public static void task17 () {
        System.out.println("Задача 7 из 2 части Переменных");
        byte weightAimKilo = 7;
        int dayCountSlow = weightAimKilo*1000/250;
        int dayCountFast = weightAimKilo*1000/500;
        int dayCountAverage = (dayCountSlow+dayCountFast)/2;
        System.out.println("Чтобы сбросить " + weightAimKilo + "кг, спортсмену потребуется в среднем " + dayCountAverage +" дней. Если он будет сбрасывать по 250г в день, то потребуется " + dayCountSlow + " дней, а если по 500г, то "+ dayCountFast +" дней.");
        System.out.println();
    }

    public static void task18 () {
        System.out.println("Задача 8 из 2 части Переменных");
        int lastYearMashaSalary = 67760;
        int lastYearDenisSalary = 83690;
        int lastYearKristinaSalary = 76230;
        int newMashaSalary = increase(lastYearMashaSalary);
        int newDenisSalary = increase(lastYearDenisSalary);
        int newKristinaSalary = increase(lastYearKristinaSalary);
        int annualMashDifference = difference(newMashaSalary, lastYearMashaSalary);
        int annualDenisDifference = difference(newDenisSalary, lastYearDenisSalary);
        int annualKristinaDifference = difference(newKristinaSalary, lastYearKristinaSalary);
        System.out.println("В новом году Маша будет получать "+ newMashaSalary +" рублей в месяц. Годовой рост дохода составит " + annualMashDifference +" рублей");
        System.out.println("В новом году Денис будет получать "+ newDenisSalary +" рублей в месяц. Годовой рост дохода составит " + annualDenisDifference + " рублей");
        System.out.println("В новом году Кристина будет получать " + newKristinaSalary +" рублей в месяц. Годовой рост дохода составит " + annualKristinaDifference +" рублей");
        System.out.println();
    }

    public static int increase (int salary) {
        salary = salary + salary/10;
        return salary;
    }

    public static int difference (int newSalary, int lastSalary) {
        int annualDifference =  newSalary*12 - lastSalary*12;
        return annualDifference;
    }




}