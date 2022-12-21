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


}