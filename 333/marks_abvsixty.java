import java.util.Scanner;
public class marks_abvsixty
{
public static void main(String args[])
{
int marks[]=new
int[6];int i;
String name[]=new String[4];
Scanner scanner=new Scanner(System.in);
for(i=0;i<6;i++)
{
System.out.print("enter name of student and marksof subject"+(i+1)+":");
name[i]=scanner.next();
marks[i]=scanner.nextInt();
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
