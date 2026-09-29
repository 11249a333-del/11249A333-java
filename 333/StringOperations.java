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