/*
AIM
To write a Java program to search for an element in a sorted array using Binary Search.
ALGORITHM
Step-1: Start the program.
Step-2: Read the number of elements n from the user.
Step-3: Create an integer array of size n.
Step-4: Read the elements of the array.
Step-5: Read the element x to be searched.
Step-6: Initialize first = 0 and last = n - 1.
Step-7: Calculate the middle position using mid = (first + last) / 2.
Step-8: If a[mid] > x, set last = mid - 1.
Step-9: If a[mid] < x, set first = mid + 1.
Step-10: If a[mid] == x, set flag = 1 and display "Element found".
Step-11: Repeat Steps 7–10 until the element is found or first > last.
Step-12: If flag == 0, display "Element not found".
Step-13: Stop the program.
PROGRAM:
*/
import java.util.Scanner;
class binarysearch
{
public static void main(String args[])
{
int i,mid,first,last,x,n,flag=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter number of elements:");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("enter elements of array:");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter element to search:");
x=sc.nextInt();
first=0;
last=n-1;
while(first<=last)
{
mid=(first+last)/2;
if(a[mid]>x)
last=mid-1;
else
if(a[mid]<x)
first=mid+1;
else
{
flag=1;
System.out.println("element found");
break;
}
}
if(flag==0)
System.out.println("element not found");
}
}
/*
OUTPUT
enter number of elements:5
enter elements of array:10 20 30 40 50
enter element to search:
30
element found
RESULT
Thus, the Java program to search for an element in a sorted array using Binary Search was successfully executed.
*/
