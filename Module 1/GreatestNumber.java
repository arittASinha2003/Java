import java.util.Scanner;

class GreatestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();
    System.out.print("Enter third number: ");
    int num3 = sc.nextInt();

    int greatest = num1;
    if (num2 > greatest) {
      greatest = num2;
    }
    if (num3 > greatest) {
      greatest = num3;
    }

    System.out.println("Greatest number is: " + greatest);
  }
}
