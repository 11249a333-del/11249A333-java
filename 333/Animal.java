/*AIM

To write a Java program to demonstrate multiple inheritance using interfaces.

ALGORITHM

Step-1: Start the program.
Step-2: Create an interface Animal with the method eat().
Step-3: Create another interface Pet with the method play().
Step-4: Create a class Dog that implements both Animal and Pet interfaces.
Step-5: Define the eat() and play() methods inside the Dog class.
Step-6: Create an object d of the Dog class.
Step-7: Call the eat() method using the object.
Step-8: Call the play() method using the object.
Step-9: Display the output and stop the program.
PROGRAM:*/
interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog plays with ball");
    }
}

public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.play();
    }
}
/*OUTPUT
Dog eats food
Dog plays with balL

RESULT
Thus, the Java program to demonstrate multiple inheritance using interfaces was successfully executed.*/
