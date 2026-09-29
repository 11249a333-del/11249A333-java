import java.util.Scanner;
class evenoddswitch
{
public static void main(String args[])
{
int n,i;
Scanner s=new
Scanner(System.in);
System.out.println("enter a number");
n=s.nextInt();
switch(n%2)
{
case 0:
System.out.println("this number is even");
break;
case 1:
System.out.println("this number is odd");
break;
}
}
}