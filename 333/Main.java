// Single-level inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class Main {
    public static void main(String[] args) {

        // Single-level inheritance
        Dog d = new Dog();
        d.eat();   // From Animal
        d.bark();  // From Dog

        System.out.println();

        // Multilevel inheritance
        Puppy p = new Puppy();
        p.eat();   // From Animal
        p.bark();  // From Dog
        p.play();  // From Puppy
    }
}