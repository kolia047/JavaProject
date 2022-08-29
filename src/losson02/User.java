package losson02;

public class User {
    public int age;
    public String name;
    public String passpurtData;

    public void talk(String s){
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", passpurtData='" + passpurtData + '\'' +
                '}';
    }
}
