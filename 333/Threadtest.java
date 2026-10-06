/*
AIM

To write a Java program to demonstrate different thread methods such as yield(), stop(), and sleep().

ALGORITHM

Step-1: Start the program.
Step-2: Create three thread classes A, B, and C by extending the Thread class.
Step-3: In Thread A, use the yield() method when i is equal to 1.
Step-4: In Thread B, display the values from 1 to 5 and call the stop() method when j reaches 3.
Step-5: In Thread C, display the values from 1 to 5 and use the sleep(1500) method when k is equal to 1.
Step-6: Create objects a, b, and c for the three threads.
Step-7: Start all three threads using the start() method.
Step-8: The threads execute concurrently according to the thread scheduler.
Step-9: Display the output and stop the program.
PROGRAM:*/
import java.io.*;
class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
if(i==1)
yield();
System.out.println("From Thread A i="+i);
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("From Thread B j="+j);
if(j==3)
System.out.println("Exit from B");
stop();
}
}
}
class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println("Thread c=" + k);
if(k==1)
try
{
sleep(1500);
}
catch(Exception c)
{
System.out.println("Exit from c");
}
}
}
}
class Threadtest
{
public static void main(String [] args)
{
A a=new A();
B b=new B();
C c=new C();
System.out.println("Start thread A");
a.start();
b.start();
c.start();
System.out.println("Exit from main thread");
}
}
/*
OUTPUT
Start thread A
From Thread A i=1
From Thread A i=2
From Thread A i=3
From Thread A i=4
From Thread A i=5
Exit from A
From Thread B j=1
From Thread B j=2
From Thread B j=3
Exit from B
Thread c=1
Exit from main thread
Thread c=2
Thread c=3
Thread c=4
Thread c=5
  
RESULT
Thus, the Java program to demonstrate the yield(), stop(), and sleep() thread methods was successfully executed.
  */
