import java.util.Scanner;

public class ArithmeticOperations {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.println("Enter operation (+, -, *, /): ");
        char operation = input.next().charAt(0);
        
        switch(operation) {
            case '+':
                int sum = add(num1, num2);
                System.out.println("Sum of the two numbers is: " + sum);
                break;
            case '-':
                int diff = subtract(num1, num2);
                System.out.println("Difference of the two numbers is: " + diff);
                break;
            case '*':
                int prod = multiply(num1, num2);
                System.out.println("Product of the two numbers is: " + prod);
                break;
            case '/':
                double quotient = divide(num1, num2);
                System.out.println("Quotient of the two numbers is: " + quotient);
                break;
            default:
                System.out.println("Invalid operation entered!");
        }
    }
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public static double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
}
/*import java.util.Scanner;

public class ArithmeticOperations {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        
        int sum = add(num1, num2);
        int diff = subtract(num1, num2);
        int prod = multiply(num1, num2);
        double quotient = divide(num1, num2);
        
        System.out.println("Sum of the two numbers is: " + sum);
        System.out.println("Difference of the two numbers is: " + diff);
        System.out.println("Product of the two numbers is: " + prod);
        System.out.println("Quotient of the two numbers is: " + quotient);
    }
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public static double divide(int num1, int num2) {
        return (double) num1 / num2;
    }
}
*/