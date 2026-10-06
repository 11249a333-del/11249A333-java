/*
AIM

To write a Java program to generate and display the Fibonacci series for 10 terms.

ALGORITHM

Step-1: Start the program.
Step-2: Initialize n1 = 0, n2 = 1, and count = 10.
Step-3: Display the first two Fibonacci numbers, 0 and 1.
Step-4: Start a for loop from i = 2 to i < count.
Step-5: Calculate the next term using n3 = n1 + n2.
Step-6: Display the value of n3.
Step-7: Assign n1 = n2 and n2 = n3 to generate the next term.
Step-8: Repeat Steps 5–7 until 10 terms are generated.
Step-9: Stop the program.
PROGRAM:*/
class a{
public static void main(String [] args){
int n1=0,n2=1,count=10;
System.out.println("Fibonacci:"+n1+" "+n2);
for(int i=2;i<count;i++)
{
int n3=n1+n2;
System.out.println(" "+n3);
n1=n2;
n2=n3;
}
}
}
/*
OUTPUT
Fibonacci:0 1
 1
 2
 3
 5
 8
 13
 21
 34

Therefore, the 10 Fibonacci terms are:

0 1 1 2 3 5 8 13 21 34
  
RESULT
Thus, the Java program to generate the Fibonacci series for 10 terms was successfully executed.
*/
