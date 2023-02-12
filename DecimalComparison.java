import java.util.Scanner;

public class DecimalComparison {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number with 3 decimal places: ");
    double firstNumber = input.nextDouble();
    System.out.print("Enter second number with 3 decimal places: ");
    double secondNumber = input.nextDouble();

    int Number1 = (int)(firstNumber * 1000);
    int Number2 = (int)(secondNumber * 1000);
    
    if (Number1 == Number2) {
      System.out.println("The numbers are the same up to three decimal places.");
    } else {
      System.out.println("The numbers are not the same up to three decimal places.");
    }
  }
}
