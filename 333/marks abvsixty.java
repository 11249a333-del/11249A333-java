/*AIM
To write a Java program to read the names and marks of six students and display the names and marks of students who scored 60 or above.
ALGORITHM
Step 1: Start the program.
Step 2: Import the java.util.Scanner package.
Step 3: Create a class named marks_abvsixty.
Step 4: Define the main() method.
Step 5: Declare an integer array marks[] to store the marks of six students.
Step 6: Declare a String array name[] to store the names of the students.
Step 7: Create a Scanner object to read input from the user.
Step 8: Use a for loop to read the names and marks of six students.
Step 9: Store each student's name and marks in the respective arrays.
Step 10: Use another for loop to check the marks of all six students.
Step 11: Check whether each student's marks are greater than or equal to 60.
Step 12: If the condition is true, display the student's name and marks.
Step 13: Repeat the process until all six students' marks are checked.
Step 14: Stop the program.
Program:*/
import java.util.Scanner;
public class marks_abvsixty
{
public static void main(String args[])
{
int marks[]=new
int[6];int I;
String name[]=new String[30];
Scanner scanner=new Scanner(system.in);
for(i=0;i<6;i++)
{
System.out.print("enter name of student and marksof subject"+(i+1)+":");
name[i]=Scanner.next();
marks[i]=Scanner.nextInt();
}
for(i=0;i<6;i++)
{
if(marks[i]>=60)
{
System.out.print(name[i]+""+ marks[i]);
}
}
}
}
/*RESULT
Thus, the Java program to display the names and marks of students who scored 60 or above was successfully written and executed.*/
