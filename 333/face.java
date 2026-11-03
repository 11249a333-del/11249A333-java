/*
AIM
To write a Java Applet program to draw a human face using different Graphics methods such as drawOval(), fillOval(), and fillArc().
ALGORITHM
Step 1: Start the program.
Step 2: Import the required Java packages such as java.awt, java.io, and java.applet.
Step 3: Create a class named face that extends the Applet class.
Step 4: Define the paint(Graphics g) method.
Step 5: Use drawOval() to draw the face.
Step 6: Use drawOval() to draw the two eyes.
Step 7: Use fillOval() to draw the black pupils.
Step 8: Use fillOval() to draw the nose.
Step 9: Use fillArc() to draw the mouth.
Step 10: Use drawOval() to draw the two ears.
Step 11: Display the completed face.
Step 12: Stop the program.
Program:*/
import java.awt.*; 
import java.io.*; 
import java.applet.*;
/*<applet code="face.class" height=300 width=300>
</applet>*/

public class face extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,40,120,150);
g.drawOval(57,75,30,20);
g.drawOval(110,75,30,20);
g.fillOval(68,81,10,10);
g.fillOval(121,81,10,10);
g.fillOval(85,100,30,30);
g.fillArc(60,125,80,40,180,180);
g.drawOval(25,92,15,30);
g.drawOval(160,92,15,30);
}
}
/*RESULT
Thus, the Java Applet program to draw a human face using Graphics methods was successfully executed.*/


