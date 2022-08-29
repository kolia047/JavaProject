package losson02;

public class Test9 {
    public static void main(String[] args) {
        checkInterval(36);

    }

    public static void checkInterval(int a) {

        if (a >= 20 && a <= 50) {
            System.out.println("Число а содержится в интервале.");
        } else {
            System.out.println("Число а не содержится в интервале.");
        }
    }
}
