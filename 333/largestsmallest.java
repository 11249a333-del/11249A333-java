/*AIM
To write a Java program to find the sum, largest number, and smallest number in a given array.
ALGORITHM
Step 1: Start the program.
Step 2: Import the required package java.util.Scanner.
Step 3: Create a class named largestsmallest.
Step 4: Define the main() method.
Step 5: Declare and initialize an integer array with the given elements {23,34,13,64,72,90,10,15,9,27}.
Step 6: Initialize the variables sum to 0, min to the first array element, and max to the first array element.
Step 7: Use a for loop to traverse the array elements starting from index 1.
Step 8: Check whether the current array element is greater than max. If true, assign the current element to max.
Step 9: Check whether the current array element is smaller than min. If true, assign the current element to min.
Step 10: Add the current array element to sum.
Step 11: Repeat Steps 8 to 10 until all array elements are processed.
Step 12: Display the sum of the array elements.
Step 13: Display the largest number in the array.
Step 14: Display the smallest number in the array.
Step 15: Stop the program.
Program:*/
import java.util.Scanner;
public class largestsmallest
{
public static void main(String args[])
{
int a[]=new int[] {23,34,13,64,72,90,10,15,9,27};
int sum=0;
int min=a[0];
int max=a[0];
for(int i=1;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
if (a[i]<min)
{
min=a[i];
}
sum=sum+a[i];
}
System.out.println("the sum is:" + sum);
System.out.println("largest number in a given array is:" + max);
System.out.println("smallest number in a given array is:" + min);
}
}
/*RESULT
Thus, the Java program to find the sum, largest number, and smallest number in a given array was successfully written and executed.*/
