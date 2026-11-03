/*
AIM
To write a Java Applet program to create a GridLayout with 5 rows and 2 columns and display ten buttons labelled A to J.

ALGORITHM
Step 1: Start the program.
Step 2: Import the required Java packages.
Step 3: Create a class named gld that extends the Applet class.
Step 4: Define the init() method.
Step 5: Set the layout using GridLayout(5,2).
Step 6: Create ten buttons labelled A, B, C, D, E, F, G, H, I and J.
Step 7: Add all ten buttons to the Applet using the add() method.
Step 8: Define the getInsets() method.
Step 9: Return the inset values using new Insets(20,20,20,20).
Step 10: Display the buttons in 5 rows and 2 columns.
Step 11: Stop the program.
Program:*/
import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
/*<applet code="gld.class" height=300 width=300>
</applet>*/

public class gld extends Applet
{
public void init()
{
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}
/*RESULT
Thus, the Java Applet program using GridLayout was successfully executed, and ten buttons were displayed in 5 rows and 2 columns.*/
