public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
        task_8();

    }

    public static void task_1(){
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task_2(){
        System.out.println("\nЗадача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task_3(){
        System.out.println("\nЗадача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task_4(){
        System.out.println("\nЗадача 4");
        var friend = 19;
        friend = friend + 2;
        friend = friend / 7;

        System.out.println(friend);

    }

    public static void task_5(){
        System.out.println("\nЗадача 5");
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task_6(){
        System.out.println("\nЗадача 6");
        var weightFighterOne = 78.2;
        var weightFighterTwo = 82.7;
        var weightFighter = weightFighterOne + weightFighterTwo;

        System.out.println("Общий вес бойцов " + weightFighter + " кг!");

        var differenceWeight = weightFighterTwo - weightFighterOne;

        System.out.println("Разница в весе бойцов " + differenceWeight + " кг!");
    }

    public static void task_7(){
        System.out.println("\nЗадача 7");
        var weightFighterOne = 78.2;
        var weightFighterTwo = 82.7;

        var differenceWeightSubtraction = weightFighterTwo - weightFighterOne;

        System.out.println("Разница в весе бойцов путем вычитания " + differenceWeightSubtraction + " кг!");

        var differenceWeightDivision  = weightFighterTwo % weightFighterOne;

        System.out.println("Разница в весе бойцов путем деления " + differenceWeightDivision + " кг!");
    }

    public static void task_8(){
        System.out.println("\nЗадача 8");
        var allHoursWork = 640;
        var hourlyRate = 8;
        var totalStaff = allHoursWork / hourlyRate;

        System.out.println("Всего работников в компании — " + totalStaff + " человек");

        totalStaff = totalStaff + 94;

        var totalAllHoursWork = totalStaff * hourlyRate;

        System.out.println("Если в компании работает " + totalStaff + " человек, то всего " + totalAllHoursWork +
                " часов работы может быть поделено между сотрудниками");
    }
}