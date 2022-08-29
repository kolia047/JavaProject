package Lessons03;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public static boolean fight(Robot robot1, Robot robot2) {
        if (robot1.power > robot2.power) {
            return true;
        } else {
            return false;
        }
    }
}
