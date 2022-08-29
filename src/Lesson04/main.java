package Lesson04;

public class main {
    public static void main(String[] args) {
        Woman woman = new Woman("Катя", 38);
        Woman woman1 = new Woman("Елена", 24);

        Cat cat = new Cat("Барсик", 2, woman);
        Dog dog = new Dog("Белка", 3, woman);
        Fish fish = new Fish("Кнопка", 1, woman);

        System.out.println(woman);
        System.out.println(woman1);
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(fish);

    }
}
