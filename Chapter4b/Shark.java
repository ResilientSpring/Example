// Coding the Python project in Java.

public class Shark {

    String name;
    int age;

    Shark(String name, int age){

        this.name = name;
        this.age = age;

        System.out.println("This is the constructor method.");

    }

    void swim(){

        System.out.println(name + " is swimming.");

    }

    void be_awesome(){
        System.out.println(name + " is being awesome.");
    }
}
