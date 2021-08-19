import java.util.ArrayList;

public class classes {
    private String name;
    private int age;
    //constructive method//

    public classes(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }
}
