/*
AIM
To write a Java program to find the largest among three integers using conditional statements.
ALGORITHM
Step 1: Start the program.
Step 2: Import the java.util.Scanner package.
Step 3: Create a class named largestofthreenumbers.
Step 4: Define the main() method.
Step 5: Declare three integer variables x, y, and z.
Step 6: Display a message asking the user to enter three integers.
Step 7: Create a Scanner object to read the input values.
Step 8: Read the three integer values from the user.
Step 9: Check whether x is greater than both y and z. If true, display "First number is largest".
Step 10: Otherwise, check whether y is greater than both x and z. If true, display "Second number is largest".
Step 11: Otherwise, check whether z is greater than both x and y. If true, display "Third number is largest".
Step 12: If none of the above conditions is true, display "All are equal".
Step 13: Stop the program.
Program:*/
import java.util.Scanner;
class largestofthreenumbers
{
public static void main(String args[])
{
int x,y,z;
System.out.println("enter three integers");
Scanner in =new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
z=in.nextInt();
if(x>y&&x>z)
System.out.println("First number is largest");
else if(y>x&&y>z)
System.out.println("Second number is largest");
else if(z>x&&z>y)
System.out.println("Third number is largest");
else
System.out.println("All are equal");
}
}
/*RESULT
Thus, the Java program to find the largest among three integers using conditional statements was successfully written and executed.*/
