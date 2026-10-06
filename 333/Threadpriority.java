/*
AIM

To write a Java program to demonstrate thread priority and thread scheduling using multiple threads.

ALGORITHM

Step-1: Start the program.
Step-2: Create three thread classes A, B, and C by extending the Thread class.
Step-3: Define the run() method in each thread to display messages and numbers from 1 to 4.
Step-4: Create objects threadA, threadB, and threadC.
Step-5: Set the priority of threadC to MAX_PRIORITY (10).
Step-6: Set the priority of threadA to MIN_PRIORITY (1).
Step-7: Set the priority of threadB to one greater than the priority of threadA (2).
Step-8: Start threads A, B, and C using the start() method.
Step-9: The thread scheduler executes the threads according to their priority and scheduling conditions.
Step-10: Display the output and stop the program.
PROGRAM:*/
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started");
for(int i=1;i<=4;i++)
{
System.out.println("From Thread A i="+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started");
for(int j=1;j<=4;j++)
{
System.out.println("From Thread B j="+j);
}
System.out.println("Exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("Thread C started");
for(int k=1;k<=4;k++)
{
System.out.println("Thread c=" + k);
}
System.out.println("Exit from c");
}
}
class Threadpriority
{
public static void main(String [] args)
{
A threadA=new A();
B threadB=new B();
C threadC=new C();
threadC.setPriority(Thread.MAX_PRIORITY);
threadB.setPriority(threadA.getPriority()+1);
threadA.setPriority(Thread.MIN_PRIORITY);
System.out.println("start thread A");
threadA.start();
System.out.println("start thread B");
threadB.start();
System.out.println("start thread C");
threadC.start();
System.out.println("end of main thread");
}
}
/*
OUTPUT

Sample Output:

Note: The exact order may vary because thread scheduling is controlled by the JVM and operating system.

start thread A
start thread B
start thread C
end of main thread
Thread C started
Thread A started
Thread B started
Thread c=1
Thread c=2
Thread c=3
Thread c=4
Exit from c
From Thread A i=1
From Thread A i=2
From Thread A i=3
From Thread A i=4
Exit from A
From Thread B j=1
From Thread B j=2
From Thread B j=3
From Thread B j=4
Exit from B
RESULT

Thus, the Java program to demonstrate thread priority and thread scheduling was successfully executed.
  */


