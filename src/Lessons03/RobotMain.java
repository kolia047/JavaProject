package Lessons03;

public class RobotMain {
    private static Robot robot1;

    public static void main(String[] args) {
        Robot robot1 = new Robot("Терминатор Т800", 200, 190);
        Robot robot2 = new Robot("Т1000", 50, 210);

       if (Robot.fight(robot1, robot2)) {
           System.out.println("Winner is " + robot1.getName());
       } else {
           System.out.println("Winner is " + robot2.getName());
       }
    }
}
