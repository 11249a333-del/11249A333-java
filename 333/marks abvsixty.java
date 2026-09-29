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
