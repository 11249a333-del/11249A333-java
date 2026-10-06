/*
AIM

To write a Java program to demonstrate single inheritance using an Animal superclass and a Dog subclass.

ALGORITHM

Step-1: Start the program.
Step-2: Create a class Animal with a method eat().
Step-3: Create a class Dog that extends the Animal class.
Step-4: Define the bark() method inside the Dog class.
Step-5: Create an object d of the Dog class.
Step-6: Call the inherited eat() method using the Dog object.
Step-7: Call the bark() method using the same object.
Step-8: Display the output.
Step-9: Stop the program.
PROGRAM:*/
class Animal{
void eat()
{
System.out.println("Animal is eating");
}
}
class Dog extends Animal {
void bark()
{
System.out.println("Dog is barking");
}
}
public class InheritanceExample{
public static void main(String[] args){
Dog d=new Dog();
d.eat();
d.bark();
}
}
/*OUTPUT
Animal is eating
Dog is barking
  RESULT

Thus, the Java program to demonstrate single inheritance was successfully executed.*/
