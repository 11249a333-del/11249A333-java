/*
AIM
To write a Java program to demonstrate the use of an interface by implementing its methods in a class.
ALGORITHM
Step-1: Start the program.
Step-2: Create an interface Animal with two methods: animalsound() and sleep().
Step-3: Create a class dog that implements the Animal interface.
Step-4: Define the animalsound() method to display the sound of the dog.
Step-5: Define the sleep() method to display the sleeping message.
Step-6: Create an object a of the dog class.
Step-7: Call the animalsound() method using the object.
Step-8: Call the sleep() method using the object.
Step-9: Display the output and stop the program.
PROGRAM:
*/
interface Animal{
public void animalsound();
public void sleep();
}
class dog implements Animal{
public void animalsound(){
System.out.println("the dog says : BOW BOWW");
}
public void sleep(){
System.out.println("Zzz");
}
}
class b{
public static void main(String [] args){
dog a=new dog();
a.animalsound();
a.sleep();
}
}
/*
OUTPUT
the dog says : BOW BOWW
Zzz
RESULT
Thus, the Java program to demonstrate an interface and its implementation was successfully executed.
  */
