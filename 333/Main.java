/*AIM

To write a Java program to demonstrate single-level and multilevel inheritance.

ALGORITHM

Step-1: Start the program.
Step-2: Create a class Animal with the eat() method.
Step-3: Create a class Dog that extends Animal and define the bark() method.
Step-4: Create a class Puppy that extends Dog and define the play() method.
Step-5: Create an object d of the Dog class.
Step-6: Call the eat() and bark() methods using the Dog object to demonstrate single-level inheritance.
Step-7: Create an object p of the Puppy class.
Step-8: Call the eat(), bark(), and play() methods using the Puppy object to demonstrate multilevel inheritance.
Step-9: Display the output.
Step-10: Stop the program.
PROGRAM:*/
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
/*OUTPUT
Animal eats
Dog barks
Animal eats
Dog barks
Puppy plays

RESULT
Thus, the Java program to demonstrate single-level and multilevel inheritance was successfully executed.*/
