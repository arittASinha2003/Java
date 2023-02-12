import java.util.Scanner;

public class AverageAndSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    double average;
    
    System.out.println("Enter 5 numbers:");
    for (int i = 0; i < 5; i++) {
      int number = input.nextInt();
      sum += number;
    }
    
    average = (double) sum / 5;
    
    System.out.println("The sum of the numbers is: " + sum);
    System.out.println("The average of the numbers is: " + average);
  }
}
