/*AIM

To write a Java program to demonstrate the use of user-defined packages for performing arithmetic operations such as addition, subtraction, multiplication, and division.

ALGORITHM

Step-1: Start the program.
Step-2: Import the required user-defined packages add, sub, mul, and div.
Step-3: Create objects of the classes Add, Sub, Mul, and Div.
Step-4: Call the addop() method to perform addition of 20 and 10.
Step-5: Call the subop() method to perform subtraction of 20 and 10.
Step-6: Call the mulop() method to perform multiplication of 20 and 10.
Step-7: Call the divop() method to perform division of 20 by 10.
Step-8: Display the results.
Step-9: Stop the program.

PROGRAM:*/

import java.util.*;
import add.*;
import sub.*;
import mul.*;
import div.*;
public class ArithDemo
{
public static void main(String args [])
{
Add ad= new Add();
Sub su= new Sub();
Mul mu= new Mul();
Div di= new Div();
ad.addop(20,10);
su.subop(20,10);
mu.mulop(20,10);
di.divop(20,10);
}
}
/*OUTPUT
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2
RESULT

Thus, the Java program to demonstrate user-defined packages for arithmetic operations was successfully executed.*/
