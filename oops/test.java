interface Animal {
    // Abstract method (method declaration without body)
    void makeSound();

    // Constant (public, static, final)
    String TYPE = "Animal";

    // Default method (with a default implementation)
    default void eat() {
        System.out.println("Animal is eating");
    }

    // Static method (since Java 8)
    static void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog implements Animal {
    // Implementing the abstract method from Animal interface
    public void makeSound() {
        System.out.println("Woof");
    }
}
public class test {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Outputs: Woof
        myDog.eat();        // Outputs: Animal is eating

        Animal.sleep();     // Outputs: Animal is sleeping
    }
}

