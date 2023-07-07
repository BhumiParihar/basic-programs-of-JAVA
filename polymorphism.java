// Parent class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Child class inheriting from the Animal class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Another child class inheriting from the Animal class
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of the Animal, Dog, and Cat classes
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Polymorphism - using the parent class reference to refer to child class objects
        Animal animalRef1 = dog;
        Animal animalRef2 = cat;

        // Calling the makeSound method using the parent class reference
        animalRef1.makeSound();
        animalRef2.makeSound();
    }
}
