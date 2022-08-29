package lesson07;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("дед Василий", true, 68);
        Human human1 = new Human("дед Petr", true, 72);
        Human human2 = new Human("баба Клава", false, 67);
        Human human3 = new Human("баба Elezaveta", false, 71);

        Human dad = new Human("папа Игорь", true, 40, human, human2);
        Human mom = new Human("мама Катя", false, 38, human1, human3);

        Human child1 = new Human("Оля", false, 12, dad, mom);


        System.out.println(human);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println("--------------------");
        System.out.println(dad);
        System.out.println(mom);
        System.out.println("---------------------");
        System.out.println(child1);



    }
}
