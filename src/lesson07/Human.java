package lesson07;

public class Human {
    String name;
    boolean sex;
    int age;
    Human dad;
    Human mom;

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, Human dad, Human mom) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.dad = dad;
        this.mom = mom;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", dad=" + dad +
                ", mom=" + mom +
                '}';
    }
}
