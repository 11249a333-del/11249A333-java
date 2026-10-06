/*AIM

To write a Java program to create/write data into a text file using the FileWriter class.

ALGORITHM

Step-1: Start the program.
Step-2: Create a FileWriter object for the file sample2.txt.
Step-3: Initialize the character value from 65 to 90.
Step-4: Use a for loop to generate characters from A to Z.
Step-5: Write each character into the file using the write() method.
Step-6: Close the file using the close() method.
Step-7: If an exception occurs, display the exception message.
Step-8: Stop the program.
PROGRAM 
  */

import java.io.*;
class Filewriter
{
public static void main(String [] args)
{
try
{
FileWriter fw=new FileWriter("sample2.txt");
for(char i=65;i<91;i++)
{
fw.write(i);
}
fw.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
/*OUTPUT

The contents written into sample2.txt are:

ABCDEFGHIJKLMNOPQRSTUVWXYZ

  RESULT

Thus, the Java program to write characters from A to Z into a text file using FileWriter was successfully executed.*/
