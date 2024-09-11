//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);

        var friend = 19;

        System.out.println("Friend: " + friend);
        friend -= 2;
        System.out.println("Friend: " + friend);
        friend /= 7;
        System.out.println("Friend: " + friend);

        var frog = 3.5;

        System.out.println("Frog : " + frog);
        frog *= 10;
        System.out.println("Frog : " + frog);
        frog /= 3.5;
        System.out.println("Frog : " + frog);
        frog += 4;
        System.out.println("Frog : " + frog);

        var firstMan = 78.2;
        var secondMan = 82.7;
        var result = firstMan + secondMan;

        System.out.println(result);

        var res = secondMan % firstMan;

        var time = 640;
        var timePerWorker = 8;
        var amountWorkers = time / timePerWorker;

        System.out.println("Всего работников в компании — " + amountWorkers + " человек");

        var newWorkers = amountWorkers + 94;
        var newTime = newWorkers * timePerWorker;

        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");
    }
}
