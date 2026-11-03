/*AIM
To write a Java Applet program to draw different shapes such as lines, rectangles, filled rectangles, rounded rectangles, and intersecting lines using the Graphics class.
ALGORITHM
Step 1: Start the program.
Step 2: Import the required packages such as java.awt.*, java.io.*, and java.applet.*.
Step 3: Create a class named linerect that extends the Applet class.
Step 4: Define the paint(Graphics g) method.
Step 5: Use the drawLine() method to draw a line from coordinates (10,10) to (50,50).
Step 6: Use the drawRect() method to draw a rectangle at position (10,60) with width 40 and height 30.
Step 7: Use the fillRect() method to draw a filled rectangle at position (60,10) with width 30 and height 80.
Step 8: Use the drawRoundRect() method to draw an outlined rounded rectangle at position (10,100) with width 80 and height 50.
Step 9: Use the fillRoundRect() method to draw a filled rounded rectangle at position (20,110) with width 60 and height 30.
Step 10: Use the drawLine() method to draw a diagonal line from (100,10) to (230,140).
Step 11: Use another drawLine() method to draw a diagonal line from (100,140) to (230,10), forming a cross.
Step 12: Compile and execute the Java Applet program to display all the shapes.
Step 13: Stop the program.
Program:*/
import java.awt.*;
import java.io.*;
import java.applet.*;
/*<applet code="linerect.class" height=300 width=300>
</applet>*/
public class linerect extends Applet
{
public void paint (Graphics g)
{
g.drawLine(10,10,50,50);
g.drawRect(10,60,40,30);
g.fillRect(60,10,30,80);
g.drawRoundRect(10,100,80,50,10,10);
g.fillRoundRect(20,110,60,30,5,5);
g.drawLine(100,10,230,140);
g.drawLine(100,140,230,10);
}
}
/*RESULT
Thus, the Java Applet program to draw different shapes such as lines, rectangles, filled rectangles, rounded rectangles, and intersecting lines using the Graphics class was successfully written and executed.*/
