/*
AIM

To write a Java program to arrange the elements of an array in ascending order.

ALGORITHM

Step-1: Start the program.
Step-2: Read the number of elements n from the user.
Step-3: Create an integer array of size n.
Step-4: Read and store all the elements into the array.
Step-5: Compare each element with the remaining elements using nested for loops.
Step-6: If a[i] > a[j], swap the two elements using a temporary variable.
Step-7: Repeat the comparison until all elements are arranged in ascending order.
Step-8: Display the sorted array.
Step-9: Stop the program.
PROGRAM:
  */
import java.util.Scanner;
public class ascendingorder
{
public static void main(String[]args)
{
int n,temp;
Scanner s=new Scanner(System.in);
System.out.print("eneter no.of elements you want in array:");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter all the elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for (int j=i+1;j<n;j++)

{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.print("AscendingOrder:");
for(int i=0;i<n-1;i++)
{
System.out.print(a[i]+",");
}
System.out.print(a[n-1]);
}
}
/*
OUTPUT
eneter no.of elements you want in array:5
enter all the elements:
45
12
78
23
10

RESULT
Thus, the Java program to arrange the elements of an array in ascending order was successfully executed.
  */
