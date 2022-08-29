package newexmpl;

public class lison01 {
    public static class Main {
        public static void main(String[] args) {

            Main m = new Main();

            System.out.println(m.sum(245,458));
        }

       int sum(int a, int b){
            return a * b;
        }


    }

    public static class HousWork {
        public static void main(String[] args) {
            System.out.println(sum(20, 30));
            System.out.println(multy(30, 10));
            System.out.println(subt(100, 47));
            System.out.println(div(28, 13));
            System.out.println(convert(287));
            System.out.println(percent(256));
            new HousWork().print("Hello World");
        }

        public static int sum(int a, int b) {
            return a + b;
        }

        static int multy(int a, int b) {
            return a * b;
        }

        static int subt(int a, int b) {
            return a - b;
        }

        static float div(int a, int b) {
            return (float) a / b;
        }

        static float convert(int evro) {
            float dolar = ((evro * 500) / 485f);
            return dolar;
        }

        static float percent(int a) {
            return (float) (a * 0.10) + a;
        }
        public void print(String str){
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
        }
    }

    public static class HelloWorld {

        public static void main(String[] args) {

            int i = 25;
            String s = "Xdkjfdkf";

            System.out.println(s + 2);
        }
    }
}
