/*
AIM

To write a Java program to check whether a given number is an Armstrong number or not.

ALGORITHM

Step-1: Start the program.
Step-2: Import the Scanner class to get input from the user.
Step-3: Read a positive number n from the user.
Step-4: Store the original number in the variable nu.
Step-5: Extract the last digit using rem = nu % 10.
Step-6: Find the sum of cubes of each digit using num = num + rem × rem × rem.
Step-7: Remove the last digit using nu = nu / 10.
Step-8: Repeat Steps 5–7 until all digits are processed.
Step-9: Compare the calculated value num with the original number n.
Step-10: If both are equal, display "Armstrong Number"; otherwise, display "Not an Armstrong number".
Step-11: Stop the program.
PROGRAM:
  */
import java.util.Scanner;
public class armstrong{
public static void main(String [] args){
int n,nu,num=0,rem;
Scanner scan=new Scanner(System.in);
System.out.println("Enter any positive number:");
n=scan.nextInt();
nu=n;
while(nu!=0)
{
rem=nu%10;
num=num+rem*rem*rem;
nu=nu/10;
}
if(num==n)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not an Armstrong number");
}
}
}
/*
OUTPUT
Enter any positive number:
153
Armstrong Number
  
RESULT
Thus, the Java program to check whether a given number is an Armstrong number or not was successfully executed.
  */
