package Lesson05;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Николай", 21);

        Woman woman = new Woman("Катя", 20);
        man.wife = woman;
        woman.husband = man;
        System.out.println(man);
        System.out.println(woman);



    }
}
