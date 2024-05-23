public class Main {
    public static void main(String[] args) {
        // TASK 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        // TASK 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        // TASK 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        // TASK 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // TASK 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // TASK 6
        var firstBoxerMass = 78.2;
        var secondBoxerMass = 82.7;
        System.out.println(firstBoxerMass + secondBoxerMass);
        System.out.println(secondBoxerMass - firstBoxerMass);

        // TASK 7
        System.out.println(secondBoxerMass % firstBoxerMass);

        // TASK 8
        var totalWorkHours = 640;
        var totalWorkers = 0;
        totalWorkers = totalWorkHours / 8;
        System.out.println("Total workers in a company - "+totalWorkers);
        totalWorkers = totalWorkers + 94;
        totalWorkHours = totalWorkers * 8;
        System.out.println("If company has " + totalWorkers +" people, then total of "+ totalWorkHours +" hours can be divided between workers.");
    }
}