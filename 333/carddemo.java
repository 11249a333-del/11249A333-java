/*
Aim:
To write a Java Applet program using CardLayout to display different buttons and switch between them when clicked.
Algorithm:
Step 1: Start the program.
Step 2: Import the required Java packages.
Step 3: Create a class named carddemo that extends Applet and implements ActionListener.
Step 4: Declare three buttons, a Panel, and a CardLayout object.
Step 5: Create the Panel and add it to the Applet.
Step 6: Create a CardLayout object and set it as the Panel layout.
Step 7: Create the first button and add an ActionListener to it.
Step 8: Add the first button to the Panel.
Step 9: Create the second button and add an ActionListener to it.
Step 10: Add the second button to the Panel.
Step 11: Create the third button and add an ActionListener to it.
Step 12: Add the third button to the Panel.
Step 13: Define the actionPerformed() method to handle button clicks.
Step 14: Use buttonCardLayout.next(buttonPanel) to display the next button.
Step 15: Stop the program.

Program:*/
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
/*
<applet code="carddemo" width=250 height=150>
</applet>
*/
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}
/*
RESULT
Thus, the Java Applet program using CardLayout was successfully executed. The buttons are displayed one at a time, and clicking a button switches to the next button.
*/

