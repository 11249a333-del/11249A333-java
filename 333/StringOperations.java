/*AIM

To write a Java program to demonstrate various String operations such as length, concatenation, case conversion, replacement, appending, comparison, startsWith() and endsWith().

ALGORITHM

Step-1: Start the program.
Step-2: Create two strings str1 and str2 with values "Hello" and "Java".
Step-3: Find the length of str1 using the length() method.
Step-4: Concatenate str1 and str2 using the + operator.
Step-5: Convert the concatenated string into uppercase using toUpperCase().
Step-6: Convert the concatenated string into lowercase using toLowerCase().
Step-7: Replace "Java" with "World" using the replace() method.
Step-8: Append the strings using StringBuilder and its append() method.
Step-9: Compare the strings using equals() and compareTo().
Step-10: Check whether the string starts with "Hello" using startsWith().
Step-11: Check whether the string ends with "Java" using endsWith().
Step-12: Display all the results and stop the program
PROGRAM:*/
public class StringOperations {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Java";

        // 1. Length
        System.out.println("1. Length of str1: " + str1.length());

        // 2. Concatenation
        String result = str1 + " " + str2;
        System.out.println("2. Concatenation: " + result);

        // 3. Uppercase
        System.out.println("3. Uppercase: " + result.toUpperCase());

        // 4. Lowercase
        System.out.println("4. Lowercase: " + result.toLowerCase());

        // 5. Replace
        String replaced = result.replace("Java", "World");
        System.out.println("5. Replace: " + replaced);

        // 6. Append using StringBuilder
        StringBuilder sb = new StringBuilder(str1);
        sb.append(" ");
        sb.append(str2);
        System.out.println("6. Append: " + sb);

        // 7. Compare using equals()
        System.out.println("7. Compare using equals: "
                + str1.equals(str2));

        // 8. Compare using compareTo()
        System.out.println("8. Compare using compareTo: "
                + str1.compareTo(str2));

        // 9. startsWith()
        System.out.println("9. Starts with 'Hello': "
                + result.startsWith("Hello"));

        // 10. endsWith()
        System.out.println("10. Ends with 'Java': "
                + result.endsWith("Java"));

        // 11. indexOf()
        System.out.println("11. Index of 'Java': "
                + result.indexOf("Java"));

        // 12. indexOf() for a character
        System.out.println("12. Index of 'o': "
                + result.indexOf('o'));
    }
}
/*
OUTPUT
1. Length of str1: 5
2. Concatenation: Hello Java
3. Uppercase: HELLO JAVA
4. Lowercase: hello java
5. Replace: Hello World
6. Append: Hello Java
7. Compare using equals: false
8. Compare using compareTo: -2
9. Starts with 'Hello': true
10. Ends with 'Java': true

RESULT
Thus, the Java program to perform various String operations was successfully executed and the required results were obtained.
    */
