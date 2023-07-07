// Parent class
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Child class inheriting from the Animal class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog dog = new Dog();

        // Accessing the methods of the parent class
        dog.eat();

        // Accessing the methods of the child class
        dog.bark();
    }
}
