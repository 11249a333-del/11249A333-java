/*
AIM

To write a Java program to read and display the contents of a text file using the FileReader class.

ALGORITHM

Step-1: Start the program.
Step-2: Create a FileReader object and open the file sample2.txt.
Step-3: Declare an integer variable i to store the character read from the file.
Step-4: Read the file character by character using the read() method.
Step-5: Continue reading until the read() method returns -1, which indicates the end of the file.
Step-6: Convert each character into char and display it on the screen.
Step-7: Close the file using the close() method.
Step-8: If an exception occurs, display the exception message.
Step-9: Stop the program.
PROGRAM:
  */

import java.io.*;
class Filereader
{
public static void main(String [] args)
{
try
{
FileReader fr=new FileReader("sample2.txt");
int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
/*
OUTPUT

Contents of sample2.txt:

Hello World
This is a Java FileReader program.

Output:

H
e
l
l
o
 
W
o
r
l
d
T
h
i
s
 
i
s
 
a
 
J
a
v
a
 
F
i
l
e
R
e
a
d
e
r
 
p
r
o
g
r
a
m
.
RESULT

Thus, the Java program to read and display the contents of a text file using FileReader was successfully executed.
  */
