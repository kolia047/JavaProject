package Lesson04;

public class Woman {
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Cat {
    private String name;
    private int age;
    private Woman owner;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }

    public Cat(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;


    }
}
class Dog {
    private String name;
    private int age;
    private Woman owner;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }

    public Dog(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;



    }
}
class Fish {
    private String name;
    private int age;
    private Woman owner;

    public Fish(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }
}