public class Main {
    private static double cat = 3.6;
    private static double dog = 8.0;
    private static int paper = 76378;

    public static void main(String[] args) {
        task1(cat, dog, paper);
        task2(cat, dog, paper);
        task3(cat, dog, paper);
    }
    public static void task1 (double cat, double dog, int paper) {
        System.out.println("Задача 1");
        Main.cat = cat;
        Main.dog = dog;
        Main.paper = paper;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();
    }

    public static void task2 (double cat, double dog, int paper) {
        System.out.println("Задача 2");
        Main.cat = cat;
        Main.dog = dog;
        Main.paper = paper;
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
        System.out.println("Задача 3");
        Main.cat = cat;
        Main.dog = dog;
        Main.paper = paper;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();
    }

}