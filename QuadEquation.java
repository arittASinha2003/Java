import java.util.Scanner;

class QuadEquation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficient of x^2:");
        double a = sc.nextDouble();
        System.out.println("Enter the coefficient of x:");
        double b = sc.nextDouble();
        System.out.println("Enter the constant:");
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double root1, root2;
        if (discriminant > 0)
        {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different");
            System.out.println("First root is: " + root1);
            System.out.println("Second root is: " + root2);
        }
        else if (discriminant == 0)
        {
            root1 = root2 = -b / (2 * a);
            System.out.println("The roots are real and same");
            System.out.println("First root is: " + root1);
            System.out.println("Second root is: " + root2);
        }
        else
        {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and different");
            System.out.println("First root is: " + realPart + "+" + imaginaryPart + "i");
            System.out.println("Second root is: " + realPart + "-" + imaginaryPart + "i");
        }
    }
}
