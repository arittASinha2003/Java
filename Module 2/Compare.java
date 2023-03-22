import java.util.Scanner;

class CompareValues {

    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    public static void compare(char a, char b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

    public static void compare(String a, String b) {
        if (a.compareTo(b) > 0) {
            System.out.println(a + " is greater than " + b);
        } else if (b.compareTo(a) > 0) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }
}

class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Example 1: Compare two integers
        System.out.println("Enter the first integer: ");
        int int1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int int2 = input.nextInt();
        CompareValues.compare(int1, int2);
        
        // Example 2: Compare two characters
        System.out.println("Enter the first character: ");
        char char1 = input.next().charAt(0);
        System.out.println("Enter the second character: ");
        char char2 = input.next().charAt(0);
        CompareValues.compare(char1, char2);
        
        // Example 3: Compare two strings
        System.out.println("Enter the first string: ");
        String str1 = input.next();
        System.out.println("Enter the second string: ");
        String str2 = input.next();
        CompareValues.compare(str1, str2);
    }
}
