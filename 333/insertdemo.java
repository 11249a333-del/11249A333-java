/*
AIM
To write a Java Applet program to demonstrate the BorderLayout manager by arranging buttons and a text area in five different regions.
ALGORITHM
Step 1: Start the program.
Step 2: Import the required packages such as java.awt.* and java.applet.*.
Step 3: Create a class named insertdemo that extends the Applet class.
Step 4: Define the init() method.
Step 5: Set the background color of the applet to cyan using setBackground(Color.cyan).
Step 6: Set the layout manager to BorderLayout using setLayout(new BorderLayout()).
Step 7: Create a button with the text "this is cross the top" and add it to the NORTH region.
Step 8: Create a button with the text "the footer messsage might go here" and add it to the SOUTH region.
Step 9: Create a button with the text "RIGHT" and add it to the EAST region.
Step 10: Create a button with the text "LEFT" and add it to the WEST region.
Step 11: Create a TextArea with the message "the reasonable man adapts"
Step 12: Add the TextArea to the CENTER region.
Step 13: Override the getInsets() method to provide a 10-pixel margin on all sides.
Step 14: Compile and execute the Java Applet program.
Step 15: Stop the program.
Program:*/
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*
<applet code="insertdemo" width=400 height=200>
</applet>
*/
public class insertdemo extends Applet
{
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("this is cross the top"),BorderLayout.NORTH);
add(new Button("the footer messsage might go here"),BorderLayout.SOUTH);
add(new Button("RIGHT"),BorderLayout.EAST);
add(new Button("LEFT"),BorderLayout.WEST);
String msg="the reasonable man adapts\n\n";
add(new TextArea(msg),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(10,10,10,10);
}
}
/*RESULT
Thus, the Java Applet program to demonstrate the BorderLayout manager was successfully written and executed.*/
